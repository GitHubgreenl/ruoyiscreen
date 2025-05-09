package com.ruoyi.screen.service;

import java.util.Date;
import java.util.List;
import com.ruoyi.screen.domain.OutputMes12;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2025-03-26
 */
public interface IOutputMes12Service 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param 采样时间 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public OutputMes12 selectOutputMes12By采样时间(Date 采样时间);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param outputMes12 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<OutputMes12> selectOutputMes12List(OutputMes12 outputMes12);

    /**
     * 新增【请填写功能名称】
     * 
     * @param outputMes12 【请填写功能名称】
     * @return 结果
     */
    public int insertOutputMes12(OutputMes12 outputMes12);

    /**
     * 修改【请填写功能名称】
     * 
     * @param outputMes12 【请填写功能名称】
     * @return 结果
     */
    public int updateOutputMes12(OutputMes12 outputMes12);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param 采样时间s 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteOutputMes12By采样时间s(Date[] 采样时间s);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param 采样时间 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteOutputMes12By采样时间(Date 采样时间);
}
