package com.kompanion.gatewaysms.controller;

import com.kompanion.gatewaysms.model.dtos.InfoByPhoneDto;
import com.kompanion.gatewaysms.model.dtos.InfoDto;
import com.kompanion.gatewaysms.model.entity.InfoByPhone;
import com.kompanion.gatewaysms.service.NikitaInfoService;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class NikitaInfoCtrl {
    NikitaInfoService nikitaInfoService;

    public NikitaInfoCtrl(NikitaInfoService nikitaInfoService) {
        this.nikitaInfoService = nikitaInfoService;
    }

    @PostMapping(value = "/getInfoAccaunt",
                    consumes = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_XML_VALUE },
                    produces = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_XML_VALUE })
    public String getInfoAccaunt(@RequestBody InfoDto infoDto){
        return nikitaInfoService.getInfoAccaunt(infoDto);
    }
    @PostMapping(value = "/getInfoByPhone")
    public String getInfoByPhone(@RequestBody InfoByPhoneDto infoByPhoneDto){
        return  nikitaInfoService.getIngoByPhone(infoByPhoneDto);
    }
}
