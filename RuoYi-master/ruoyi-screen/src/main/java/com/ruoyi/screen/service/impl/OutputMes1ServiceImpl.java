package com.ruoyi.screen.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.screen.mapper.OutputMes1Mapper;
import com.ruoyi.screen.domain.OutputMes1;
import com.ruoyi.screen.service.IOutputMes1Service;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-03-26
 */
@Service
public class OutputMes1ServiceImpl implements IOutputMes1Service 
{
    @Autowired
    private OutputMes1Mapper outputMes1Mapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param 采样时间 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public OutputMes1 selectOutputMes1By采样时间(Date 采样时间)
    {
        return outputMes1Mapper.selectOutputMes1By采样时间(采样时间);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param outputMes1 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<OutputMes1> selectOutputMes1List(OutputMes1 outputMes1)
    {
        return outputMes1Mapper.selectOutputMes1List(outputMes1);
    }
    @Override
    public List<List<String>> getProduce()
    {
        List<String> produce = outputMes1Mapper.getProduce();
        List<List<String>> list= new ArrayList<>();
        list.add(Arrays.asList(produce.get(5),produce.get(10),produce.get(13),produce.get(18)));//生料
        list.add(Arrays.asList(produce.get(4),produce.get(9),produce.get(15),produce.get(19)));//煤粉
        list.add(Arrays.asList(produce.get(3),produce.get(8),produce.get(14),produce.get(20)));//熟料
        list.add(Arrays.asList(produce.get(6),produce.get(11),produce.get(16),produce.get(21)));//水泥
        list.add(Arrays.asList(produce.get(7),produce.get(12),produce.get(17),""));//余热发电量
        return list;
    }


    /**
     * 新增【请填写功能名称】
     * 
     * @param outputMes1 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertOutputMes1(OutputMes1 outputMes1)
    {
        return outputMes1Mapper.insertOutputMes1(outputMes1);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param outputMes1 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateOutputMes1(OutputMes1 outputMes1)
    {
        return outputMes1Mapper.updateOutputMes1(outputMes1);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param 采样时间s 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteOutputMes1By采样时间s(Date[] 采样时间s)
    {
        return outputMes1Mapper.deleteOutputMes1By采样时间s(采样时间s);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param 采样时间 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteOutputMes1By采样时间(Date 采样时间)
    {
        return outputMes1Mapper.deleteOutputMes1By采样时间(采样时间);
    }
}
