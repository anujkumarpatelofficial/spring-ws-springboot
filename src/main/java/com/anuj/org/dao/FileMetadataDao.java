package com.anuj.org.dao;

import com.anuj.org.model.FileMetadata;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class FileMetadataDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int save(FileMetadata fileMetadata) {
        return jdbcTemplate.update(
                "insert into file_metadata (url, extenstion,form_parameter_id) values(?,?,?)",
                fileMetadata.getUrl(),fileMetadata.getExtension(),fileMetadata.getForm_parameter_id());
    }

}
