package cn.hospital.service.impl;

import cn.hospital.dao.SectionMapper;
import cn.hospital.pojo.Section;
import cn.hospital.service.SectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("sectionService")
public class SectionServiceImpl implements SectionService{

    @Autowired
    @Qualifier("sectionMapper")
    private SectionMapper sectionMapper;
    @Override
    public Section findSectionById(Integer id) {
        return sectionMapper.findSectionById(id);
    }
}
