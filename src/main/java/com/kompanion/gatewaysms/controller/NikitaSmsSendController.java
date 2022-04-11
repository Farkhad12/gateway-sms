package com.kompanion.gatewaysms.controller;

import com.kompanion.gatewaysms.model.dtos.SmsDto;
import com.kompanion.gatewaysms.service.NikitaSmsSendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;

@RestController
@RequestMapping("/v")
public class NikitaSmsSendController {
    @Autowired
    NikitaSmsSendService nikitaSmsSendService;


    @PostMapping(value = "/smsSend",
            consumes = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_XML_VALUE },
            produces = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_XML_VALUE } )
    public String sendSms(@RequestBody SmsDto smsDto){
        return nikitaSmsSendService.sendSms(smsDto);
    }
}
