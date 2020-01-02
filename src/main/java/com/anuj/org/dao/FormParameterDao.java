package com.anuj.org.dao;

import com.anuj.org.model.FormParameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

@Repository
public class FormParameterDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    /*public int save(FormParameter formParameter) {
        KeyHolder keyHolder = new GeneratedKeyHolder();
        return jdbcTemplate.update(
                "insert into form_parameters (parameter_1, parameter_2,parameter_3,parameter_4) values(?,?,?,?)",
                formParameter.getParameter_1()==null?"":formParameter.getParameter_1(),
                       formParameter.getParameter_2()==null?"":formParameter.getParameter_2(),
                       formParameter.getParameter_3()==null?"":formParameter.getParameter_3(),
                       formParameter.getParameter_4()==null?"":formParameter.getParameter_4());
    }*/

    public int save(FormParameter formParameter) {
        KeyHolder keyHolder = new GeneratedKeyHolder();
        String query="insert into form_parameters (parameter_1, parameter_2,parameter_3,parameter_4) values(?,?,?,?)";
        KeyHolder keyHolder1 = new GeneratedKeyHolder();
        jdbcTemplate.update(
                new PreparedStatementCreator() {
                    public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
                        PreparedStatement pst =
                                con.prepareStatement(query, new String[] {"id"});
                        pst.setString(1, formParameter.getParameter_1()==null?"":formParameter.getParameter_1());
                        pst.setString(2, formParameter.getParameter_2()==null?"":formParameter.getParameter_2());
                        pst.setString(3, formParameter.getParameter_3()==null?"":formParameter.getParameter_3());
                        pst.setString(4, formParameter.getParameter_4()==null?"":formParameter.getParameter_4());
                        return pst;
                    }
                },
                keyHolder);
        return (Integer) keyHolder.getKey();

    }

    public List<FormParameter> findByNameAndPrice(FormParameter formParameter) {
        return jdbcTemplate.query(
                "select * from form_parameters where parameter_1 = ? and parameter_2 = ? and parameter_3 = ? and parameter_4 = ?",
                new Object[]{formParameter.getParameter_1()==null?"":formParameter.getParameter_1(),
                        formParameter.getParameter_2()==null?"":formParameter.getParameter_2(),
                        formParameter.getParameter_3()==null?"":formParameter.getParameter_3(),
                        formParameter.getParameter_4()==null?"":formParameter.getParameter_4()},
                (rs, rowNum) ->
                        new FormParameter(
                                rs.getInt("id"),
                                rs.getString("parameter_1"),
                                rs.getString("parameter_2"),
                                rs.getString("parameter_3"),
                                rs.getString("parameter_4")
                        )
        );
    }
}
