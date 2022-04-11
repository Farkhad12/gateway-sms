package com.kompanion.gatewaysms.model.entity;


import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import javax.persistence.*;
import java.awt.geom.GeneralPath;

@JacksonXmlRootElement
@Entity
@Table(name = "Info_table")
public class Info {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
Long id;
    @JacksonXmlProperty
    String login;
    @JacksonXmlProperty
    String pwd;


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }



    public Info(String login, String phone) {
        this.login = login;
        this.pwd = pwd;
    }

    public Info() {
    }
}
