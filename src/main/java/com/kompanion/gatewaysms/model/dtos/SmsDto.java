package com.kompanion.gatewaysms.model.dtos;

import lombok.Data;

import java.util.List;

@Data
public class SmsDto {

    String login;
    String pwd;
    String sender;
    String text;
    String phone;
    String test;
}
