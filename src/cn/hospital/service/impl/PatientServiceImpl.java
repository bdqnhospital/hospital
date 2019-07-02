package cn.hospital.service.impl;

import cn.hospital.dao.PatientMapper;
import cn.hospital.pojo.Patient;
import cn.hospital.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service("patientService")
public class PatientServiceImpl implements PatientService{

    @Autowired
    @Qualifier("patientMapper")
    private PatientMapper patientMapper;

    @Override
    //根据日期查询挂号单
    public List<Patient> selectPatientListByDate(Date date,Integer id) {
        return patientMapper.selectPatientListByDate(date,id);
    }

    @Override
    //查询本周挂号单列表
    public List<Patient> selectPatientListByWeek(Integer id) {
        return patientMapper.selectPatientListByWeek(id);
    }

}
