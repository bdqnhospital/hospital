package cn.hospital.dao;

import cn.hospital.pojo.Medical;

public interface MedicalMapper {
    /**
     * 添加病历方法
     *
     * @mbggenerated Tue Jun 25 19:21:00 CST 2019
     */
    int insert(Medical record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hospital_medical
     *
     * @mbggenerated Tue Jun 25 19:21:00 CST 2019
     */
    int insertSelective(Medical record);
}