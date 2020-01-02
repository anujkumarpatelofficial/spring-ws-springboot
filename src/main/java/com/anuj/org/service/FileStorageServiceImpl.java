package com.anuj.org.service;

import com.anuj.org.dao.FileMetadataDao;
import com.anuj.org.dao.FormParameterDao;
import com.anuj.org.model.FileMetadata;
import com.anuj.org.model.FormParameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;

@Service
public class FileStorageServiceImpl  implements  FileStorageService{

    @Autowired
    private  FormParameterDao formParameterDao;
    @Autowired
    private   FileMetadataDao fileMetadataDao;
    @Autowired
    private FileStorageCloudService fileStorageCloudService;


    @Override
    public String addFile(MultipartFile file, FormParameter formParameter) {
       // adding file in cloud
        String url = fileStorageCloudService.storeFileIncloud(file,formParameter);
       //adding form parameter in database
        List<FormParameter> existingFormParameter= formParameterDao.findByNameAndPrice(formParameter);
        if(existingFormParameter.size() > 0){
            System.out.println("already data exist ::");
            System.out.println(existingFormParameter.get(0));
            formParameter = existingFormParameter.get(0);
        }else{
            //add metadata into db
            int id= formParameterDao.save(formParameter);
            formParameter.setId(id);
            System.out.println("id of newly created formparameter "+id);
        }
        // adding file metadata in database
        FileMetadata fileMetadata =new FileMetadata();
        fileMetadata.setExtension(url);
        fileMetadata.setUrl("http://"+url);
        fileMetadata.setForm_parameter_id(formParameter.getId());
        fileMetadataDao.save(fileMetadata);
        return  url;
    }
}
