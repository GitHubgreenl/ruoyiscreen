package com.ruoyi.screen.service.impl;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.screen.mapper.OutputMes8Mapper;
import com.ruoyi.screen.domain.OutputMes8;
import com.ruoyi.screen.service.IOutputMes8Service;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-03-26
 */
@Service
public class OutputMes8ServiceImpl implements IOutputMes8Service 
{
    @Autowired
    private OutputMes8Mapper outputMes8Mapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param 采样时间 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public OutputMes8 selectOutputMes8By采样时间(Date 采样时间)
    {
        return outputMes8Mapper.selectOutputMes8By采样时间(采样时间);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param outputMes8 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<OutputMes8> selectOutputMes8List(OutputMes8 outputMes8)
    {
        return outputMes8Mapper.selectOutputMes8List(outputMes8);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param outputMes8 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertOutputMes8(OutputMes8 outputMes8)
    {
        return outputMes8Mapper.insertOutputMes8(outputMes8);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param outputMes8 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateOutputMes8(OutputMes8 outputMes8)
    {
        return outputMes8Mapper.updateOutputMes8(outputMes8);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param 采样时间s 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteOutputMes8By采样时间s(Date[] 采样时间s)
    {
        return outputMes8Mapper.deleteOutputMes8By采样时间s(采样时间s);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param 采样时间 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteOutputMes8By采样时间(Date 采样时间)
    {
        return outputMes8Mapper.deleteOutputMes8By采样时间(采样时间);
    }
}
