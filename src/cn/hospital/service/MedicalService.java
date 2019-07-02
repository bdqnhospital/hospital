package cn.hospital.service;

import cn.hospital.pojo.Medical;

public interface MedicalService {

    /**
     * 添加病历内容
     * @param record medical对象
     * @return 返回影响行数
     */
    int insert(Medical record);
}
