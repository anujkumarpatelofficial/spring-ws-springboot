package com.anuj.org.dao;

import com.anuj.org.model.FileMetadata;

public interface FileDao {

    public  boolean add(FileMetadata metadata);
    public  FileMetadata getFileDetails(String uniqueId);

}
