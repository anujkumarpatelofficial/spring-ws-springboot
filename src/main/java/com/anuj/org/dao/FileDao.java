package com.anuj.org.dao;

import com.anuj.org.model.FileMetadata;
import com.anuj.org.model.FormParameter;

public interface FileDao {

    public  boolean add(FormParameter formParameter);
    public  FileMetadata getFileDetails(String uniqueId);

}
