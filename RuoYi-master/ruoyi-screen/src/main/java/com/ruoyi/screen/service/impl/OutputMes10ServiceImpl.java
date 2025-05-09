package com.ruoyi.screen.service.impl;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.screen.mapper.OutputMes10Mapper;
import com.ruoyi.screen.domain.OutputMes10;
import com.ruoyi.screen.service.IOutputMes10Service;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-03-26
 */
@Service
public class OutputMes10ServiceImpl implements IOutputMes10Service 
{
    @Autowired
    private OutputMes10Mapper outputMes10Mapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param 采样时间 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public OutputMes10 selectOutputMes10By采样时间(Date 采样时间)
    {
        return outputMes10Mapper.selectOutputMes10By采样时间(采样时间);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param outputMes10 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<OutputMes10> selectOutputMes10List(OutputMes10 outputMes10)
    {
        return outputMes10Mapper.selectOutputMes10List(outputMes10);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param outputMes10 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertOutputMes10(OutputMes10 outputMes10)
    {
        return outputMes10Mapper.insertOutputMes10(outputMes10);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param outputMes10 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateOutputMes10(OutputMes10 outputMes10)
    {
        return outputMes10Mapper.updateOutputMes10(outputMes10);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param 采样时间s 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteOutputMes10By采样时间s(Date[] 采样时间s)
    {
        return outputMes10Mapper.deleteOutputMes10By采样时间s(采样时间s);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param 采样时间 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteOutputMes10By采样时间(Date 采样时间)
    {
        return outputMes10Mapper.deleteOutputMes10By采样时间(采样时间);
    }
}
