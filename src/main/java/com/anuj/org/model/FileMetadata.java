package com.anuj.org.model;

public class FileMetadata {

    int file_id ;
    String url;
    String extension;
    int form_parameter_id;

    public int getFile_id() {
        return file_id;
    }

    public void setFile_id(int file_id) {
        this.file_id = file_id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public int getForm_parameter_id() {
        return form_parameter_id;
    }

    public void setForm_parameter_id(int form_parameter_id) {
        this.form_parameter_id = form_parameter_id;
    }

    @Override
    public String toString() {
        return "FileMetadata{" +
                "file_id=" + file_id +
                ", url='" + url + '\'' +
                ", extension='" + extension + '\'' +
                ", form_parameter_id=" + form_parameter_id +
                '}';
    }
}
