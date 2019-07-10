package com.sda.steelprofiles.finalApp.controllers;

import com.sda.steelprofiles.finalApp.dtos.CsectionDTO;
import com.sda.steelprofiles.finalApp.services.servicesImpl.CsectionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CsectionController {

    private CsectionServiceImpl csection;

    @Autowired
    public CsectionController(CsectionServiceImpl csection) {
        this.csection = csection;
    }

    @GetMapping("/addCsection")
    public String showaddingForm(Model model) {
        model.addAttribute("newCsection", new CsectionDTO());
        model.addAttribute("queryString", new QueryString());
        return "addCsection";
    }


    @PostMapping("/addNewCsectionAction")
    public String addNewCsection(@ModelAttribute("newCsection") CsectionDTO csectionDTO) {
        csection.seve(csectionDTO);

        return "redirect:addCsection";
    }
    public static class QueryString{
        String queryString;

        public QueryString() {
        }

        public QueryString(String queryString) {
            this.queryString = queryString;
        }

        public String getQueryString() {
            return queryString;
        }

        public void setQueryString(String queryString) {
            this.queryString = queryString;
        }
    }
}