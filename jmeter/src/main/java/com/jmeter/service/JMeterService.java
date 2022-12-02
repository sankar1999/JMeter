package com.jmeter.service;

import com.jmeter.entity.JMeterEntity;

import java.util.List;

public interface JMeterService {
    void saveBulkData(List<JMeterEntity> jMeterEntities);

    void deleteAll();

    List<JMeterEntity> getAllData();
}
