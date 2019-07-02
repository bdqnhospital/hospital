package cn.hospital.service.impl;

import cn.hospital.dao.MedicalMapper;
import cn.hospital.pojo.Medical;
import cn.hospital.service.MedicalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("medicalService")
public class MedicalServiceImpl implements MedicalService {

    @Autowired
    @Qualifier("medicalMapper")
    private MedicalMapper medicalMapper;

    /**
     *  添加病历方法
     * @param record medical对象
     * @return 影响行数
     */
    @Override
    public int insert(Medical record) {
        return medicalMapper.insert(record);
    }
}
