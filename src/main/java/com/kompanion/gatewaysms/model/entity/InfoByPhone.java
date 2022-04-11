package com.kompanion.gatewaysms.model.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "infoByPhone")
public class InfoByPhone {
    @Id
            @GeneratedValue(strategy = GenerationType.AUTO)
            Long id;
    String login;
    String psw;
    String phone;
}
