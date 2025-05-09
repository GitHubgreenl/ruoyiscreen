package com.ruoyi.screen.service.impl;


import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.screen.mapper.OutputMes6Mapper;
import com.ruoyi.screen.domain.OutputMes6;
import com.ruoyi.screen.service.IOutputMes6Service;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-03-26
 */
@Service
public class OutputMes6ServiceImpl implements IOutputMes6Service 
{
    @Autowired
    private OutputMes6Mapper outputMes6Mapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param 采样时间 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public OutputMes6 selectOutputMes6By采样时间(Date 采样时间)
    {
        return outputMes6Mapper.selectOutputMes6By采样时间(采样时间);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param outputMes6 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<OutputMes6> selectOutputMes6List(OutputMes6 outputMes6)
    {
        return outputMes6Mapper.selectOutputMes6List(outputMes6);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param outputMes6 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertOutputMes6(OutputMes6 outputMes6)
    {
        return outputMes6Mapper.insertOutputMes6(outputMes6);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param outputMes6 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateOutputMes6(OutputMes6 outputMes6)
    {
        return outputMes6Mapper.updateOutputMes6(outputMes6);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param 采样时间s 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteOutputMes6By采样时间s(Date[] 采样时间s)
    {
        return outputMes6Mapper.deleteOutputMes6By采样时间s(采样时间s);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param 采样时间 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteOutputMes6By采样时间(Date 采样时间)
    {
        return outputMes6Mapper.deleteOutputMes6By采样时间(采样时间);
    }
}
