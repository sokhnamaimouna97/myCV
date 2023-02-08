package sn.atos.project.myCV.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/first")

public class IndexController {
    @GetMapping("/message")
    public String indexPage() {
        return "index";

    }
}
