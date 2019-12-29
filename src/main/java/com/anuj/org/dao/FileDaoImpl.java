package com.anuj.org.dao;

import com.anuj.org.model.FileMetadata;
import org.springframework.stereotype.Repository;

@Repository
public class FileDaoImpl  implements  FileDao{


    @Override
    public boolean add(FileMetadata metadata) {
        return false;
    }

    @Override
    public FileMetadata getFileDetails(String uniqueId) {
        return null;
    }
}
