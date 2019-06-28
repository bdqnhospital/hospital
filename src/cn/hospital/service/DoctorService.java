package cn.hospital.service;

import cn.hospital.pojo.Doctor;
import org.apache.ibatis.annotations.Param;

public interface DoctorService {

    Doctor selectDoctorByParam(@Param("doctorId") int doctorId,
                               @Param("doctorPassword") String doctorPassword);
}
