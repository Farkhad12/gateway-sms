package com.kompanion.gatewaysms.model.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Sms")
@Data
@AllArgsConstructor
public class Sms{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String login;
    String pwd;
    String sender;
    String text;
    String phone;
    @CreationTimestamp
    @DateTimeFormat(style = "YYYYMMDDhhmmss")
    Date time;
//
}
