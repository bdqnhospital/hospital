package cn.hospital.service;

import cn.hospital.pojo.Patient;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface PatientService {

    //根据日期查询挂号单
    List<Patient> selectPatientListByDate(Date date,Integer id);

    //查询本周挂号单列表
    List<Patient> selectPatientListByWeek(@Param("id") Integer id);

}
