package com.jmeter.controller;

import com.jmeter.entity.JMeterEntity;
import com.jmeter.service.JMeterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jmeter")
public class JMeterController {

    @Autowired
    private JMeterService jMeterService;

    @PostMapping("/saveBulkData")
    public void saveBulkData(@RequestBody List<JMeterEntity> jMeterEntities) {
        jMeterEntities.forEach(System.out::println);
        jMeterService.saveBulkData(jMeterEntities);
    }

    @GetMapping("/getAllData")
    public List<JMeterEntity> getAllData() {
        return jMeterService.getAllData();
    }

    @DeleteMapping("/deleteAll")
    public void deleteAll() {
        jMeterService.deleteAll();
    }
}
