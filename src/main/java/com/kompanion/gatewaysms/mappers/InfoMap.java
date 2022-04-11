package com.kompanion.gatewaysms.mappers;

import com.kompanion.gatewaysms.model.dtos.InfoDto;
import com.kompanion.gatewaysms.model.entity.Info;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface InfoMap {
    InfoMap INSTANCE = Mappers.getMapper(InfoMap.class);

    Info mapToInfo(InfoDto infoDto);
    InfoDto mapToInfoDto(Info info);
}
