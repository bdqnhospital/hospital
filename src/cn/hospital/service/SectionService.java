package cn.hospital.service;

import cn.hospital.pojo.Section;

public interface SectionService {
    //根据医生id查询显示科室名称
    Section findSectionById(Integer id);
}
