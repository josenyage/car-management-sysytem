package com.jnm.cardealersms.controller;

import com.jnm.cardealersms.model.EmployeeType;
import com.jnm.cardealersms.model.JobTitle;
import com.jnm.cardealersms.services.EmployeeTypeService;
import com.jnm.cardealersms.services.JobTitleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class JobTitleController {

    @Autowired
    JobTitleService jobTitleService;

    @GetMapping("/jobTitles")
    public String getJobTitle(Model model){

        List<JobTitle> jobTitleList = jobTitleService.getJobTitle();
        model.addAttribute("jobTitles", jobTitleList);

        return "jobTitles";
    }

    @PostMapping("/jobTitles/addNew")

    public String addNew(JobTitle jobTitle){

        jobTitleService.save(jobTitle);

        return "redirect:/jobTitles";

    }

    @RequestMapping("jobTitles/findById")
    @ResponseBody

    public Optional<JobTitle> findById(int id){
        return jobTitleService.findById(id);
    }

    @RequestMapping( value = "jobTitles/update", method = {RequestMethod.GET, RequestMethod.PUT})

    public String update(JobTitle jobTitle){
        jobTitleService.save(jobTitle);
        return "redirect:/jobTitles";
    }


    @RequestMapping(value = "/jobTitles/delete", method = {RequestMethod.DELETE, RequestMethod.GET})

    public String delete(Integer id){
        jobTitleService.delete(id);
        return "redirect:/jobTitles";
    }

}
