package com.kompanion.gatewaysms.service;

import com.kompanion.gatewaysms.model.dtos.InfoByPhoneDto;
import com.kompanion.gatewaysms.model.dtos.InfoDto;
import com.kompanion.gatewaysms.model.entity.Info;

public interface NikitaInfoService {
    public String getInfoAccaunt(InfoDto infoDto);

    String getIngoByPhone(InfoByPhoneDto infoByPhoneDto);
}
