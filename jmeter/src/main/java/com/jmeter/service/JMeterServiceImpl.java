package com.jmeter.service;

import com.jmeter.entity.JMeterEntity;
import com.jmeter.repository.JMeterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JMeterServiceImpl implements JMeterService{

    @Autowired
    private JMeterRepository jMeterRepository;

    @Override
    public void saveBulkData(List<JMeterEntity> jMeterEntities) {
        jMeterRepository.saveAll(jMeterEntities);
    }

    @Override
    public void deleteAll() {
        jMeterRepository.deleteAll();
    }

    @Override
    public List<JMeterEntity> getAllData() {
        return jMeterRepository.findAll();
    }
}
