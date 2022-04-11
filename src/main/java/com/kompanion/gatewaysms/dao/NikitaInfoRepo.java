package com.kompanion.gatewaysms.dao;

import com.kompanion.gatewaysms.model.entity.Info;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NikitaInfoRepo extends JpaRepository<Info,Long> {

}
