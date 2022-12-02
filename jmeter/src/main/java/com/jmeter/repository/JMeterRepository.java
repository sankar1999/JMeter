package com.jmeter.repository;

import com.jmeter.entity.JMeterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JMeterRepository extends JpaRepository<JMeterEntity, Long> {
}
