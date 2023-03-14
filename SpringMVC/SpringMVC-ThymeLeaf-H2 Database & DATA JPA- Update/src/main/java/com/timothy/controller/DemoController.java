package com.timothy.controller;

import com.timothy.service.MessageGenerator;
import com.timothy.testDatabase.TestData;
import com.timothy.testDatabase.TestDataRepository;
import com.timothy.util.AttributeNames;
import com.timothy.util.Mappings;
import com.timothy.util.ViewNames;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Objects;


@Controller
@Slf4j
public class DemoController {
    private final MessageGenerator messageGenerator;
    private final TestDataRepository testDataRepository;

    @Autowired
    public DemoController(MessageGenerator messageGenerator, TestDataRepository testDataRepository) {
        this.messageGenerator = messageGenerator;
        this.testDataRepository = testDataRepository;
    }

    @GetMapping(Mappings.WELCOME_PAGE)
    public String welcomePage(@RequestParam String userName, Model model) {
        model.addAttribute(AttributeNames.MAIN_MSG,
                messageGenerator.getMainMessage(userName));
        return ViewNames.WELCOME_PAGE;
    }


    @GetMapping(Mappings.ADD_DATA_PAGE)
    public String addDataPage() {
        return ViewNames.ADD_DATA_PAGE;
    }

    @PostMapping(Mappings.ADD_DATA_PAGE)
    public String ADDProcessData(@RequestParam Integer serialNumberName, @RequestParam String contentName) {
        if(testDataRepository.findAll().stream().anyMatch((TestData -> Objects.equals(TestData.getSerialNumber(), serialNumberName)))){
            log.info("add-error page triggered");
            return ViewNames.ADD_ERROR_PAGE;
        }
        testDataRepository.save(new TestData(serialNumberName,contentName));
        return ViewNames.ADD_DATA_PAGE;
    }


    @GetMapping(Mappings.VIEW_DATA_PAGE)
    public String testDataView(Model model) {
        model.addAttribute("testDataList",testDataRepository.findAll());
        return ViewNames.VIEW_DATA_PAGE;
    }


    @GetMapping(Mappings.EDIT_DATA_PAGE)
    public String editDataPage() {
        return ViewNames.EDIT_DATA_PAGE;
    }

    @PostMapping(Mappings.EDIT_DATA_PAGE)
    public String EDITProcessData(@RequestParam Integer serialNumberName, @RequestParam String contentName) {
        if(testDataRepository.findAll().stream().noneMatch((TestData -> Objects.equals(TestData.getSerialNumber(), serialNumberName)))){
            log.info("edit-error page triggered");
            return ViewNames.EDIT_ERROR_PAGE;
        }
        testDataRepository.delete(testDataRepository.findById(serialNumberName).get());
        testDataRepository.save(new TestData(serialNumberName,contentName));
        return ViewNames.EDIT_DATA_PAGE;
    }


    @GetMapping(Mappings.DELETE_DATA_PAGE)
    public String deleteDataPage() {
        return ViewNames.DELETE_DATA_PAGE;
    }

    @PostMapping(Mappings.DELETE_DATA_PAGE)
    public String deleteProcessData(@RequestParam Integer serialNumberName) {

        if(testDataRepository.findAll().stream().noneMatch((TestData -> Objects.equals(TestData.getSerialNumber(), serialNumberName)))){
            log.info("delete-error page triggered");
            return ViewNames.DELETE_ERROR_PAGE;
        }
        testDataRepository.delete(testDataRepository.findById(serialNumberName).get());
        return ViewNames.DELETE_DATA_PAGE;
    }

}
