package com.company.controller;

import com.company.model.StarShip;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/hello")
public class TransportController {

    @RequestMapping("/search")
    public String searchTransportByModelPage(Model model) {

        model.addAttribute("starShip", new StarShip());

        return "transport-search"; }

    @RequestMapping("/transportv1")
    public String getTransportByModelPagev1(HttpServletRequest request, Model model) {

        String transportModel = request.getParameter("transportModel");

        transportModel = transportModel.toUpperCase() + " is the best!";

        model.addAttribute("message", transportModel);

        return "searched-transport"; }

    @RequestMapping("/transportv2")
    public String getTransportByModelPagev2(@RequestParam("transportModel") String transportModel, Model model) {

        transportModel = transportModel.toUpperCase() + " is the best!";

        model.addAttribute("message", transportModel);

        return "searched-transport"; }

    @RequestMapping("/transport")
    public String getTransportByModelPage(@ModelAttribute("starShip") StarShip starShip) {

        System.out.println(starShip.getModel());

        System.out.println("AdditionalModules:");

        for (String s :
                starShip.getPutAdditionalModules()) {
            System.out.println("Module: " + s);
        }

        return "searched-transport"; }
}
