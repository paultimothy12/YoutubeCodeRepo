package com.timothy.controller;

import com.timothy.service.MessageGenerator;
import com.timothy.testDatabase.TestDatabase;
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


@Controller
@Slf4j
public class DemoController {
    private final MessageGenerator messageGenerator;
    private final TestDatabase testDatabase;

    @Autowired
    public DemoController(MessageGenerator messageGenerator, TestDatabase testDatabase) {
        this.messageGenerator = messageGenerator;
        this.testDatabase = testDatabase;
    }

    @GetMapping(Mappings.WELCOME_PAGE)
    public String welcomePage(@RequestParam String userName, Model model) {
        model.addAttribute(AttributeNames.MAIN_MSG,
                messageGenerator.getMainMessage(userName));
        return ViewNames.WELCOME_PAGE;
    }

    //ADD_DATA_PAGE
    @GetMapping(Mappings.ADD_DATA_PAGE)
    public String addDataPage() {
        return ViewNames.ADD_DATA_PAGE;
    }

    @PostMapping(Mappings.ADD_DATA_PAGE)
    public String ADDProcessData(@RequestParam Integer serialNumberName, @RequestParam String contentName) {
        testDatabase.addTestDataList(serialNumberName, contentName);
        return ViewNames.ADD_DATA_PAGE;
    }

    //VIEW_DATA_PAGE
    @GetMapping(Mappings.VIEW_DATA_PAGE)
    public String testDataView(Model model) {
        model.addAttribute("testDatabase", testDatabase);
        return ViewNames.VIEW_DATA_PAGE;
    }

    //EDIT_DATA_PAGE
    @GetMapping(Mappings.EDIT_DATA_PAGE)
    public String editDataPage() {
        return ViewNames.EDIT_DATA_PAGE;
    }

    @PostMapping(Mappings.EDIT_DATA_PAGE)
    public String EDITProcessData(@RequestParam Integer serialNumberName, @RequestParam String contentName) {
        testDatabase.editTestDataList(serialNumberName, contentName);
        return ViewNames.EDIT_DATA_PAGE;
    }

    //DELETE_DATA_PAGE
    @GetMapping(Mappings.DELETE_DATA_PAGE)
    public String deleteDataPage() {
        return ViewNames.DELETE_DATA_PAGE;
    }

    @PostMapping(Mappings.DELETE_DATA_PAGE)
    public String deleteProcessData(@RequestParam Integer serialNumberName) {
        testDatabase.deleteTestDataList(serialNumberName);
        return ViewNames.DELETE_DATA_PAGE;
    }
}
