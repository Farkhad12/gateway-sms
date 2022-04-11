package com.kompanion.gatewaysms.service.impl;

import com.kompanion.gatewaysms.dao.NIkitaInfoByPhoneRepo;
import com.kompanion.gatewaysms.dao.NikitaInfoRepo;
import com.kompanion.gatewaysms.mappers.InfoMap;
import com.kompanion.gatewaysms.mappers.InfoPhoneMap;
import com.kompanion.gatewaysms.model.dtos.InfoByPhoneDto;
import com.kompanion.gatewaysms.model.dtos.InfoDto;
import com.kompanion.gatewaysms.model.entity.Info;
import com.kompanion.gatewaysms.model.entity.InfoByPhone;
import com.kompanion.gatewaysms.service.NikitaInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@Service
public class NikitaInfoServiceImpl implements NikitaInfoService {

    RestTemplate restTemplate;
    public NikitaInfoServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
    @Autowired
    NikitaInfoRepo nikitaInfoRepo;
    @Autowired
    NIkitaInfoByPhoneRepo nIkitaInfoByPhoneRepo;

    @Override
    public String getInfoAccaunt(InfoDto infoDto) {
        Info info = InfoMap.INSTANCE.mapToInfo(infoDto);

        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_XML));
        HttpEntity<InfoDto> entity = new HttpEntity<InfoDto>(infoDto, headers);
        nikitaInfoRepo.save(info);
        return restTemplate.exchange(
                "http://smspro.nikita.kg/api/info",HttpMethod.POST,entity, String.class).getBody();

    }

    @Override
    public String getIngoByPhone(InfoByPhoneDto infoByPhoneDto) {
        InfoByPhone info = InfoPhoneMap.INSTANCE.mapToInfoByPhone(infoByPhoneDto);

        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_XML));
        HttpEntity<InfoByPhoneDto> entity = new HttpEntity<InfoByPhoneDto>(infoByPhoneDto, headers);
        nIkitaInfoByPhoneRepo.save(info);
        return restTemplate.exchange(
                "http://smspro.nikita.kg/api/info",HttpMethod.POST,entity, String.class).getBody();
    }
}
