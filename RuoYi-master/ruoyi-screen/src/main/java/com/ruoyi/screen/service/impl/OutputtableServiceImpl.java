package com.ruoyi.screen.service.impl;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.screen.mapper.OutputtableMapper;
import com.ruoyi.screen.domain.Outputtable;
import com.ruoyi.screen.service.IOutputtableService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-03-26
 */
@Service
public class OutputtableServiceImpl implements IOutputtableService 
{
    @Autowired
    private OutputtableMapper outputtableMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param 采样时间 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public Outputtable selectOutputtableBy采样时间(Date 采样时间)
    {
        return outputtableMapper.selectOutputtableBy采样时间(采样时间);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param outputtable 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<Outputtable> selectOutputtableList(Outputtable outputtable)
    {
        return outputtableMapper.selectOutputtableList(outputtable);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param outputtable 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertOutputtable(Outputtable outputtable)
    {
        return outputtableMapper.insertOutputtable(outputtable);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param outputtable 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateOutputtable(Outputtable outputtable)
    {
        return outputtableMapper.updateOutputtable(outputtable);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param 采样时间s 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteOutputtableBy采样时间s(Date[] 采样时间s)
    {
        return outputtableMapper.deleteOutputtableBy采样时间s(采样时间s);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param 采样时间 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteOutputtableBy采样时间(Date 采样时间)
    {
        return outputtableMapper.deleteOutputtableBy采样时间(采样时间);
    }
}
