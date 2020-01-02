package com.anuj.org.service;

import com.anuj.org.model.FileMetadata;
import com.anuj.org.model.FormParameter;
import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

public interface FileStorageCloudService {

    public String storeFileIncloud(MultipartFile file, FormParameter metadata);
    public Resource loadFileAsResource(String fileName);

}
