package com.ruoyi.screen.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.screen.mapper.LishiMes15Mapper;
import com.ruoyi.screen.domain.LishiMes15;
import com.ruoyi.screen.service.ILishiMes15Service;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-03-26
 */
@Service
public class LishiMes15ServiceImpl implements ILishiMes15Service 
{
    @Autowired
    private LishiMes15Mapper lishiMes15Mapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param mIindex 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public LishiMes15 selectLishiMes15ByMIindex(Long mIindex)
    {
        return lishiMes15Mapper.selectLishiMes15ByMIindex(mIindex);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param lishiMes15 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<LishiMes15> selectLishiMes15List(LishiMes15 lishiMes15)
    {
        return lishiMes15Mapper.selectLishiMes15List(lishiMes15);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param lishiMes15 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertLishiMes15(LishiMes15 lishiMes15)
    {
        return lishiMes15Mapper.insertLishiMes15(lishiMes15);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param lishiMes15 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateLishiMes15(LishiMes15 lishiMes15)
    {
        return lishiMes15Mapper.updateLishiMes15(lishiMes15);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param mIindexs 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteLishiMes15ByMIindexs(Long[] mIindexs)
    {
        return lishiMes15Mapper.deleteLishiMes15ByMIindexs(mIindexs);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param mIindex 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteLishiMes15ByMIindex(Long mIindex)
    {
        return lishiMes15Mapper.deleteLishiMes15ByMIindex(mIindex);
    }
}
