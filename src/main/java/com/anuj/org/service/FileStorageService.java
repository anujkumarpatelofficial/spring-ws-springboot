package com.anuj.org.service;

import com.anuj.org.model.FormParameter;
import org.springframework.web.multipart.MultipartFile;

public interface FileStorageService {

    public String addFile(MultipartFile file, FormParameter formParameter);
}
