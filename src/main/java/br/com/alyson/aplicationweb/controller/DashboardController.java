package br.com.alyson.aplicationweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/dashboard")
public class DashboardController {


    @RequestMapping("/index")
    public ModelAndView index(){
        ModelAndView mv = new ModelAndView("dashboard");
        return mv;
    }
}
