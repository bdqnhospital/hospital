package cn.hospital.controller;

import cn.hospital.pojo.Doctor;
import cn.hospital.pojo.Section;
import cn.hospital.service.SectionService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/sectionController")
public class SectionController {

    @Autowired
    @Qualifier("sectionService")
    private SectionService sectionService;

    @RequestMapping("/showSectionName")
    public String showSectionName(HttpSession session, Model model) {
        Doctor doctor1 = (Doctor) session.getAttribute("doctor");
        Integer sid = doctor1.getDoctorId();
        System.out.println(sid);
        Section section = sectionService.findSectionById(sid);
        System.out.println(section.getSectionName());
        model.addAttribute("section",section);
        return "back_welcome";
    }

    @ResponseBody
    @RequestMapping(value = "/selectSectionList",produces = {"application/json;charset=utf-8"})
    public String selectSectionList() {
        List<Section> list = sectionService.selectSectionList();
        String listJSON = JSON.toJSONString(list);
        //System.out.println(listJSON);
        return listJSON;
    }
}
