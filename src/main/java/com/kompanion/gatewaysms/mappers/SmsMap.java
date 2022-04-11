package com.kompanion.gatewaysms.mappers;

import com.kompanion.gatewaysms.model.dtos.SmsDto;
import com.kompanion.gatewaysms.model.entity.Sms;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface SmsMap {
    SmsMap INSTANCE = Mappers.getMapper(SmsMap.class);

    Sms mapToSms(SmsDto smsDto);

    SmsDto mapToSmsDto(Sms sms);
}
