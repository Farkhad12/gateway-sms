package com.kompanion.gatewaysms.dao;

import com.kompanion.gatewaysms.model.entity.Sms;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@Repository
public interface SmsNikitaRepo extends JpaRepository<Sms,Long> {
}
