package cn.hospital.controller;

import cn.hospital.pojo.Doctor;
import cn.hospital.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/doctorController")
public class DoctorController {

    @Autowired
    @Qualifier("doctorService")
    private DoctorService doctorService;

    @RequestMapping("login")
    public String login() {
        return "login";
    }

    @RequestMapping("/doLogin")
    public String doLogin(@RequestParam("doctorId") int doctorId,
                          @RequestParam("doctorPassword")String doctorPassword,
                          HttpSession session) {
        Doctor doctor = doctorService.selectDoctorByParam(doctorId,doctorPassword);
        if(null != doctor) {
            session.setAttribute("doctor",doctor);
            return "redirect:/sectionController/showSectionName";
        }
      return "login";
    }
}
