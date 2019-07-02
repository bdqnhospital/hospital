package cn.hospital.controller;

import cn.hospital.pojo.Drugs;
import cn.hospital.service.DrugsService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("drugsController")
public class DrugsController {

    @Autowired
    @Qualifier("drugsService")
    private DrugsService drugsService;


    @ResponseBody
    @RequestMapping(value = "selectDrugsList",produces = {"application/json;charset=utf-8"})
    public String selectDrugsList() {
        List<Drugs> list = drugsService.selectDrugsList();
        String listJSON = JSON.toJSONString(list);
        System.out.println("**********"+listJSON);
        return listJSON;
    }
}
