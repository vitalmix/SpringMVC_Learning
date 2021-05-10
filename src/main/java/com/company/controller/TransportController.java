package com.company.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class TransportController {

    @RequestMapping("/")
    public String showTransportPage() {
        return "transport-menu";
    }

    @RequestMapping("/search")
    public String searchTransportByModelPage() { return "transport-search"; }

    @RequestMapping("/transport")
    public String getTransportByModelPage(HttpServletRequest request, Model model) {

        String transportModel = request.getParameter("transportModel");

        transportModel = transportModel.toUpperCase() + " is the best!";

        model.addAttribute("message", transportModel);

        return "searched-transport"; }
}
