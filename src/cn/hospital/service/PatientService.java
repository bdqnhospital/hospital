package cn.hospital.service;

import cn.hospital.pojo.Patient;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface PatientService {

    List<Patient> selectPatientListByDate(Date date);
}
