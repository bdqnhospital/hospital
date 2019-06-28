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
    public List<Patient> selectPatientListByDate(Date date) {
        return patientMapper.selectPatientListByDate(date);
    }
}
