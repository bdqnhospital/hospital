package cn.hospital.controller;

import cn.hospital.pojo.*;
import cn.hospital.service.*;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/medicalController")
public class MedicalController {

    @Autowired
    @Qualifier("medicalService")
    private MedicalService medicalService;

    @Autowired
    @Qualifier("sectionService")
    private SectionService sectionService;

    @Autowired
    @Qualifier("drugsService")
    private DrugsService drugsService;

    @RequestMapping("/addMedical")
    public String addMedical(Medical medical, HttpSession session,Drugs drugs) {
        //得到药品名称
        String drugsName = drugs.getDrugsName();
        System.out.println(drugsName);
        //得到药品id
        Doctor doctor = (Doctor)session.getAttribute("doctor");
        Drugs drug = drugsService.selectDrugsByName(drugsName);
        Integer drugsId = drug.getDrugsId();

        medical.setDoctorId(1);
        medical.setDrugsId(drugsId);
        medical.setCreateDate(new Date());
        medical.setIsHospitalization(1);

        int result = medicalService.insert(medical);
        return "back_treatment";
    }


    @ResponseBody
    @RequestMapping("showDrugs")
    public String showDrugs(Drugs drugs) {
        String drugsString = JSON.toJSONString(drugs);
        String drugsJSON = "{\"code\":\"0\",\"msg\":\"\",\"count\":"+1+",\"data\":"+drugsString+"}";
        System.out.println(drugsJSON);
        return drugsJSON;
    }
}
