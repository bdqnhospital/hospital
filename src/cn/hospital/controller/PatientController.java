package cn.hospital.controller;

import cn.hospital.pojo.Doctor;
import cn.hospital.pojo.Patient;
import cn.hospital.service.PatientService;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("patientController")
public class PatientController {

    @Autowired
    @Qualifier("patientService")
    private PatientService patientService;

    /**
     * 查询当日挂号人数
     * @return list
     */
    @ResponseBody
    @RequestMapping("/todayInfo")
    public List<Patient> todayInfo(HttpSession session) {
        Doctor doctor = (Doctor) session.getAttribute("doctor");
        Date date = new Date();
        //分页
        //PageHelper.startPage(1,1);
        List<Patient> list = patientService.selectPatientListByDate(date,doctor.getDoctorId());
        System.out.println("---------------" + list);
        return list;
    }

    @RequestMapping("/toDataTable")
    public String toDataTable() {
        return "dataTable";
    }
    /**
     * 查询一周的挂号清单
     * @return list
     */
    @ResponseBody
    @RequestMapping("/weekInfo")
    public List<Patient> weekInfo(HttpSession session) {
        Doctor doctor = (Doctor) session.getAttribute("doctor");
        List<Patient> list = patientService.selectPatientListByWeek(doctor.getDoctorId());
        System.out.println("******************************"+list);
        return list;
    }
}






