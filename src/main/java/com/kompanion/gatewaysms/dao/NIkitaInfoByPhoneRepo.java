package com.kompanion.gatewaysms.dao;

import com.kompanion.gatewaysms.model.entity.InfoByPhone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NIkitaInfoByPhoneRepo extends JpaRepository<InfoByPhone,Long> {
}
