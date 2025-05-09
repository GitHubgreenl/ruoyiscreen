package com.ruoyi.screen.service.impl;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.screen.mapper.OutputMes14Mapper;
import com.ruoyi.screen.domain.OutputMes14;
import com.ruoyi.screen.service.IOutputMes14Service;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-03-26
 */
@Service
public class OutputMes14ServiceImpl implements IOutputMes14Service 
{
    @Autowired
    private OutputMes14Mapper outputMes14Mapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param 采样时间 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public OutputMes14 selectOutputMes14By采样时间(Date 采样时间)
    {
        return outputMes14Mapper.selectOutputMes14By采样时间(采样时间);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param outputMes14 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<OutputMes14> selectOutputMes14List(OutputMes14 outputMes14)
    {
        return outputMes14Mapper.selectOutputMes14List(outputMes14);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param outputMes14 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertOutputMes14(OutputMes14 outputMes14)
    {
        return outputMes14Mapper.insertOutputMes14(outputMes14);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param outputMes14 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateOutputMes14(OutputMes14 outputMes14)
    {
        return outputMes14Mapper.updateOutputMes14(outputMes14);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param 采样时间s 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteOutputMes14By采样时间s(Date[] 采样时间s)
    {
        return outputMes14Mapper.deleteOutputMes14By采样时间s(采样时间s);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param 采样时间 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteOutputMes14By采样时间(Date 采样时间)
    {
        return outputMes14Mapper.deleteOutputMes14By采样时间(采样时间);
    }
}
