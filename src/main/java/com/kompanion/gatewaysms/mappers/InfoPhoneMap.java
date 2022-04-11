package com.kompanion.gatewaysms.mappers;

import com.kompanion.gatewaysms.model.dtos.InfoByPhoneDto;
import com.kompanion.gatewaysms.model.entity.InfoByPhone;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface InfoPhoneMap {
    InfoPhoneMap INSTANCE = Mappers.getMapper(InfoPhoneMap.class);

    InfoByPhone mapToInfoByPhone(InfoByPhoneDto infoByPhoneDto);
    InfoByPhoneDto mapToInfoByPhoneDto(InfoByPhone infoByPhone);

}
