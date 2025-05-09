package com.ruoyi.screen.service.impl;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.screen.mapper.OutputMes13Mapper;
import com.ruoyi.screen.domain.OutputMes13;
import com.ruoyi.screen.service.IOutputMes13Service;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-03-26
 */
@Service
public class OutputMes13ServiceImpl implements IOutputMes13Service 
{
    @Autowired
    private OutputMes13Mapper outputMes13Mapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param 采样时间 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public OutputMes13 selectOutputMes13By采样时间(Date 采样时间)
    {
        return outputMes13Mapper.selectOutputMes13By采样时间(采样时间);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param outputMes13 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<OutputMes13> selectOutputMes13List(OutputMes13 outputMes13)
    {
        return outputMes13Mapper.selectOutputMes13List(outputMes13);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param outputMes13 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertOutputMes13(OutputMes13 outputMes13)
    {
        return outputMes13Mapper.insertOutputMes13(outputMes13);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param outputMes13 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateOutputMes13(OutputMes13 outputMes13)
    {
        return outputMes13Mapper.updateOutputMes13(outputMes13);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param 采样时间s 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteOutputMes13By采样时间s(Date[] 采样时间s)
    {
        return outputMes13Mapper.deleteOutputMes13By采样时间s(采样时间s);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param 采样时间 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteOutputMes13By采样时间(Date 采样时间)
    {
        return outputMes13Mapper.deleteOutputMes13By采样时间(采样时间);
    }



    @Override
    public List<OutputMes13> getEquipment() {
       return outputMes13Mapper.getEquipment();
    }
}
