package com.kompanion.gatewaysms.service;

import com.kompanion.gatewaysms.model.dtos.InfoByPhoneDto;
import com.kompanion.gatewaysms.model.dtos.InfoDto;
import com.kompanion.gatewaysms.model.dtos.ResponseInfoDto;

public interface NikitaInfoService {
    public ResponseInfoDto getInfoAccaunt(InfoDto infoDto);

    String getIngoByPhone(InfoByPhoneDto infoByPhoneDto);
}
