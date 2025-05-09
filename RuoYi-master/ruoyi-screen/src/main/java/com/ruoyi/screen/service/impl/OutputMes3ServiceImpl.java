package com.ruoyi.screen.service.impl;

import java.util.Date;
import java.util.List;

import com.ruoyi.screen.mapper.OutputMes3Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.screen.domain.OutputMes3;
import com.ruoyi.screen.service.IOutputMes3Service;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-03-26
 */
@Service
public class OutputMes3ServiceImpl implements IOutputMes3Service 
{
    @Autowired
    private OutputMes3Mapper outputMes3Mapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param 采样时间 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public OutputMes3 selectOutputMes3By采样时间(Date 采样时间)
    {
        return outputMes3Mapper.selectOutputMes3By采样时间(采样时间);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param outputMes3 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<OutputMes3> selectOutputMes3List(OutputMes3 outputMes3)
    {
        return outputMes3Mapper.selectOutputMes3List(outputMes3);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param outputMes3 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertOutputMes3(OutputMes3 outputMes3)
    {
        return outputMes3Mapper.insertOutputMes3(outputMes3);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param outputMes3 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateOutputMes3(OutputMes3 outputMes3)
    {
        return outputMes3Mapper.updateOutputMes3(outputMes3);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param 采样时间s 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteOutputMes3By采样时间s(Date[] 采样时间s)
    {
        return outputMes3Mapper.deleteOutputMes3By采样时间s(采样时间s);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param 采样时间 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteOutputMes3By采样时间(Date 采样时间)
    {
        return outputMes3Mapper.deleteOutputMes3By采样时间(采样时间);
    }
}
