package com.ruoyi.screen.service;

import java.util.Date;
import java.util.List;
import com.ruoyi.screen.domain.OutputMes9;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2025-03-26
 */
public interface IOutputMes9Service 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param 采样时间 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public OutputMes9 selectOutputMes9By采样时间(Date 采样时间);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param outputMes9 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<OutputMes9> selectOutputMes9List(OutputMes9 outputMes9);

    /**
     * 新增【请填写功能名称】
     * 
     * @param outputMes9 【请填写功能名称】
     * @return 结果
     */
    public int insertOutputMes9(OutputMes9 outputMes9);

    /**
     * 修改【请填写功能名称】
     * 
     * @param outputMes9 【请填写功能名称】
     * @return 结果
     */
    public int updateOutputMes9(OutputMes9 outputMes9);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param 采样时间s 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteOutputMes9By采样时间s(Date[] 采样时间s);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param 采样时间 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteOutputMes9By采样时间(Date 采样时间);
}
