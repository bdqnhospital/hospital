package cn.hospital.controller;

import cn.hospital.pojo.Patient;
import cn.hospital.service.PatientService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("patientController")
public class PatientController {

    @Autowired
    @Qualifier("patientService")
    private PatientService patientService;

    @RequestMapping("todayInfo")
    public String todayInfo() {
        Date date = new Date();
        List<Patient> list = patientService.selectPatientListByDate(date);
        if (list!=null) {
            String jsonStirng = JSON.toJSONString(list);
            return "data";
        } else {
            return "nodata";
        }
    }
}






