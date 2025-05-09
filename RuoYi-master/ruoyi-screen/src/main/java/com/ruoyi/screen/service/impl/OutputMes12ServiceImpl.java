package com.ruoyi.screen.service.impl;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.screen.mapper.OutputMes12Mapper;
import com.ruoyi.screen.domain.OutputMes12;
import com.ruoyi.screen.service.IOutputMes12Service;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-03-26
 */
@Service
public class OutputMes12ServiceImpl implements IOutputMes12Service 
{
    @Autowired
    private OutputMes12Mapper outputMes12Mapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param 采样时间 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public OutputMes12 selectOutputMes12By采样时间(Date 采样时间)
    {
        return outputMes12Mapper.selectOutputMes12By采样时间(采样时间);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param outputMes12 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<OutputMes12> selectOutputMes12List(OutputMes12 outputMes12)
    {
        return outputMes12Mapper.selectOutputMes12List(outputMes12);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param outputMes12 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertOutputMes12(OutputMes12 outputMes12)
    {
        return outputMes12Mapper.insertOutputMes12(outputMes12);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param outputMes12 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateOutputMes12(OutputMes12 outputMes12)
    {
        return outputMes12Mapper.updateOutputMes12(outputMes12);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param 采样时间s 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteOutputMes12By采样时间s(Date[] 采样时间s)
    {
        return outputMes12Mapper.deleteOutputMes12By采样时间s(采样时间s);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param 采样时间 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteOutputMes12By采样时间(Date 采样时间)
    {
        return outputMes12Mapper.deleteOutputMes12By采样时间(采样时间);
    }
}
