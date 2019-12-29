package com.anuj.org.model;

public class FileMetadata {

    int id ;
    String department;
    String zone;
    String uniqueId;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    @Override
    public String toString() {
        return "FileMetadata{" +
                "department='" + department + '\'' +
                ", zone='" + zone + '\'' +
                '}';
    }
}
