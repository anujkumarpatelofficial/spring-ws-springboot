package com.anuj.org.service;

import com.anuj.org.model.FileMetadata;
import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

public interface FileStorageService {

    public String storeFile(MultipartFile file, FileMetadata metadata);
    public Resource loadFileAsResource(String fileName);

}
