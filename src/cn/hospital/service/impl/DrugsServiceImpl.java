package cn.hospital.service.impl;

import cn.hospital.dao.DrugsMapper;
import cn.hospital.pojo.Drugs;
import cn.hospital.service.DrugsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("drugsService")
public class DrugsServiceImpl implements DrugsService {

    @Autowired
    @Qualifier("drugsMapper")
    private DrugsMapper drugsMapper;

    /**
     * 根据药品名称查询药品
     * @param name 药品名称
     * @return 返回药品对象
     */
    @Override
    public Drugs selectDrugsByName(String name) {
        return drugsMapper.selectDrugsByName(name);
    }

    /**
     * 查询药品列表
     * @return 返回药品列表
     */
    @Override
    public List<Drugs> selectDrugsList() {
        return drugsMapper.selectDrugsList();
    }
}
