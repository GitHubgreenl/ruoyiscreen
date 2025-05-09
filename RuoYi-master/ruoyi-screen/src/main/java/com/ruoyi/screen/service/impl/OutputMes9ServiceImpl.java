package com.ruoyi.screen.service.impl;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.screen.mapper.OutputMes9Mapper;
import com.ruoyi.screen.domain.OutputMes9;
import com.ruoyi.screen.service.IOutputMes9Service;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-03-26
 */
@Service
public class OutputMes9ServiceImpl implements IOutputMes9Service 
{
    @Autowired
    private OutputMes9Mapper outputMes9Mapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param 采样时间 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public OutputMes9 selectOutputMes9By采样时间(Date 采样时间)
    {
        return outputMes9Mapper.selectOutputMes9By采样时间(采样时间);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param outputMes9 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<OutputMes9> selectOutputMes9List(OutputMes9 outputMes9)
    {
        return outputMes9Mapper.selectOutputMes9List(outputMes9);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param outputMes9 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertOutputMes9(OutputMes9 outputMes9)
    {
        return outputMes9Mapper.insertOutputMes9(outputMes9);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param outputMes9 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateOutputMes9(OutputMes9 outputMes9)
    {
        return outputMes9Mapper.updateOutputMes9(outputMes9);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param 采样时间s 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteOutputMes9By采样时间s(Date[] 采样时间s)
    {
        return outputMes9Mapper.deleteOutputMes9By采样时间s(采样时间s);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param 采样时间 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteOutputMes9By采样时间(Date 采样时间)
    {
        return outputMes9Mapper.deleteOutputMes9By采样时间(采样时间);
    }
}
