package cn.hospital.service;

import cn.hospital.pojo.Drugs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DrugsService {

    /**
     * 根据药品名称查询药品
     * @param name 药品名称
     * @return 返回药品对象
     */
    Drugs selectDrugsByName(@Param("drugsName") String name);

    /**
     * 查询药品列表
     * @return 返回药品列表
     */
    List<Drugs> selectDrugsList();
}
