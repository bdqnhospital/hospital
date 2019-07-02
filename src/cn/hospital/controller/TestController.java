package cn.hospital.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("testController")
public class TestController {

    @RequestMapping("/test")
    public String test() {
        return "back_treatment";
    }
}
