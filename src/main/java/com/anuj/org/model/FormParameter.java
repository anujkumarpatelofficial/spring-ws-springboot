package com.anuj.org.model;

public class FormParameter {

    private  int id ;
    private String parameter_1;
    private String parameter_2;
    private String parameter_3;
    private String parameter_4;


    public FormParameter(){
        super();
    }

    public FormParameter(int id, String parameter_1, String parameter_2, String parameter_3, String parameter_4) {
        this.id = id;
        this.parameter_1 = parameter_1;
        this.parameter_2 = parameter_2;
        this.parameter_3 = parameter_3;
        this.parameter_4 = parameter_4;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getParameter_1() {
        return parameter_1;
    }

    public void setParameter_1(String parameter_1) {
        this.parameter_1 = parameter_1;
    }

    public String getParameter_2() {
        return parameter_2;
    }

    public void setParameter_2(String parameter_2) {
        this.parameter_2 = parameter_2;
    }

    public String getParameter_3() {
        return parameter_3;
    }

    public void setParameter_3(String parameter_3) {
        this.parameter_3 = parameter_3;
    }

    public String getParameter_4() {
        return parameter_4;
    }

    public void setParameter_4(String parameter_4) {
        this.parameter_4 = parameter_4;
    }

    @Override
    public String toString() {
        return "FormParameter{" +
                "id=" + id +
                ", parameter_1='" + parameter_1 + '\'' +
                ", parameter_2='" + parameter_2 + '\'' +
                ", parameter_3='" + parameter_3 + '\'' +
                ", parameter_4='" + parameter_4 + '\'' +
                '}';
    }
}
