package com.kompanion.gatewaysms.service.impl;

import com.kompanion.gatewaysms.dao.SmsNikitaRepo;
import com.kompanion.gatewaysms.mappers.SmsMap;
import com.kompanion.gatewaysms.model.dtos.SmsDto;
import com.kompanion.gatewaysms.model.entity.Sms;
import com.kompanion.gatewaysms.service.NikitaSmsSendService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.Arrays;


@Service
public class NikitaSmsSendServiceImpl implements NikitaSmsSendService {
   private static final Logger logger = LoggerFactory.getLogger(NikitaSmsSendServiceImpl.class);
    @Autowired
    SmsNikitaRepo nikitaRepo;
   @Autowired
    RestTemplate restTemplate;
    @Override
    public String sendSms(SmsDto smsDto) {
        Sms sms = SmsMap.INSTANCE.mapToSms(smsDto);
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_XML));
        HttpEntity<SmsDto> entity = new HttpEntity<SmsDto>(smsDto, headers);
        logger.info("Saved...");
        nikitaRepo.save(sms);
        return restTemplate.exchange(
                "http://smspro.nikita.kg/api/message", HttpMethod.POST, entity, String.class).getBody();

    }
}
