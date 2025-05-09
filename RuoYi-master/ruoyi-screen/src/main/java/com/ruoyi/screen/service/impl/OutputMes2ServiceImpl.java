package com.ruoyi.screen.service.impl;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.screen.mapper.OutputMes2Mapper;
import com.ruoyi.screen.domain.OutputMes2;
import com.ruoyi.screen.service.IOutputMes2Service;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-03-26
 */
@Service
public class OutputMes2ServiceImpl implements IOutputMes2Service 
{
    @Autowired
    private OutputMes2Mapper outputMes2Mapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param 采样时间 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public OutputMes2 selectOutputMes2By采样时间(Date 采样时间)
    {
        return outputMes2Mapper.selectOutputMes2By采样时间(采样时间);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param outputMes2 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<OutputMes2> selectOutputMes2List(OutputMes2 outputMes2)
    {
        return outputMes2Mapper.selectOutputMes2List(outputMes2);
    }

    @Override
    public List<OutputMes2> selectAll(OutputMes2 outputMes2) {
        return outputMes2Mapper.selectAll(outputMes2);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param outputMes2 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertOutputMes2(OutputMes2 outputMes2)
    {
        return outputMes2Mapper.insertOutputMes2(outputMes2);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param outputMes2 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateOutputMes2(OutputMes2 outputMes2)
    {
        return outputMes2Mapper.updateOutputMes2(outputMes2);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param 采样时间s 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteOutputMes2By采样时间s(Date[] 采样时间s)
    {
        return outputMes2Mapper.deleteOutputMes2By采样时间s(采样时间s);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param 采样时间 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteOutputMes2By采样时间(Date 采样时间)
    {
        return outputMes2Mapper.deleteOutputMes2By采样时间(采样时间);
    }
}
