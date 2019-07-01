package cn.hospital.service;

import cn.hospital.pojo.Section;

import java.util.List;

public interface SectionService {
    //根据医生id查询显示科室名称
    Section findSectionById(Integer id);

    /**
     * 查询科室列表
     * @return 返回科室列表
     */
    List<Section> selectSectionList();
}
