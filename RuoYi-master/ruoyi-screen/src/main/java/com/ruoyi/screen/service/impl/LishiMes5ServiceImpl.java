package com.ruoyi.screen.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.screen.mapper.LishiMes5Mapper;
import com.ruoyi.screen.domain.LishiMes5;
import com.ruoyi.screen.service.ILishiMes5Service;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-03-26
 */
@Service
public class LishiMes5ServiceImpl implements ILishiMes5Service 
{
    @Autowired
    private LishiMes5Mapper lishiMes5Mapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param mIindex 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public LishiMes5 selectLishiMes5ByMIindex(Long mIindex)
    {
        return lishiMes5Mapper.selectLishiMes5ByMIindex(mIindex);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param lishiMes5 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<LishiMes5> selectLishiMes5List(LishiMes5 lishiMes5)
    {
        return lishiMes5Mapper.selectLishiMes5List(lishiMes5);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param lishiMes5 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertLishiMes5(LishiMes5 lishiMes5)
    {
        return lishiMes5Mapper.insertLishiMes5(lishiMes5);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param lishiMes5 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateLishiMes5(LishiMes5 lishiMes5)
    {
        return lishiMes5Mapper.updateLishiMes5(lishiMes5);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param mIindexs 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteLishiMes5ByMIindexs(Long[] mIindexs)
    {
        return lishiMes5Mapper.deleteLishiMes5ByMIindexs(mIindexs);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param mIindex 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteLishiMes5ByMIindex(Long mIindex)
    {
        return lishiMes5Mapper.deleteLishiMes5ByMIindex(mIindex);
    }
}
