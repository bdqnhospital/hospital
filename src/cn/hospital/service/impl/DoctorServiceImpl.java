package cn.hospital.service.impl;

import cn.hospital.dao.DoctorMapper;
import cn.hospital.pojo.Doctor;
import cn.hospital.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("doctorService")
public class DoctorServiceImpl implements DoctorService {

    @Autowired
    @Qualifier("doctorMapper")
    private DoctorMapper doctorMapper;
    @Override
    public Doctor selectDoctorByParam(int doctorId, String doctorPassword) {
        return doctorMapper.selectDoctorByParam(doctorId,doctorPassword);
    }
}
