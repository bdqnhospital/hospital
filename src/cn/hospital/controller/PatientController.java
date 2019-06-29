package cn.hospital.controller;

import cn.hospital.pojo.Patient;
import cn.hospital.service.PatientService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("patientController")
public class PatientController {

    @Autowired
    @Qualifier("patientService")
    private PatientService patientService;

    /**
     * 查询当日挂号人数
     * @return
     */
    @ResponseBody
    @RequestMapping(value="todayInfo",produces = {"application/json;charset=UTF-8"})
    public String todayInfo() {
        Date date = new Date();
        List<Patient> list = patientService.selectPatientListByDate(date);
        System.out.println(list);
        if (list!=null) {
            String jsonStirng = JSON.toJSONString(list, SerializerFeature.WriteDateUseDateFormat);
            return jsonStirng;
            //String jsonStirng = "{\"code\":\"0\",\"msg\":\"\",\"count\":"+list.size()+",\"data\":"+jsonStirng111+"}";
            //System.out.println(jsonStirng);
            //return jsonStirng;
        } else {
            return "nodata";
        }
    }

    @RequestMapping("toDataTable")
    public String toDataTable() {
        return "dataTable";
    }
    /**
     * 查询本周挂号人数
     * @return
     */
    /*@RequestMapping("weekInfo")
    public String weekInfo() {
        Date date = new Date();
        List<Patient> list = patientService.selectPatientListByWeek(date);
        if (list!=null) {
            String jsonStirng = JSON.toJSONString(list);
            return "data";
        } else {
            return "nodata";
        }
    }*/


    public String selectCountById(String id, Model model){
        int targetId = Integer.parseInt(id);
        int Result = patientService.selectCount(targetId);
        if(Result!=0){
            model.addAttribute("Result",Result);
            return "Ajax";
        }
        return "redirect:Ajax";
    }
}






