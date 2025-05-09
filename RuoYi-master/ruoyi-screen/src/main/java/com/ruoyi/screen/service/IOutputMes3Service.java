package com.ruoyi.screen.service;

import java.util.Date;
import java.util.List;
import com.ruoyi.screen.domain.OutputMes3;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2025-03-26
 */
public interface IOutputMes3Service 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param 采样时间 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public OutputMes3 selectOutputMes3By采样时间(Date 采样时间);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param outputMes3 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<OutputMes3> selectOutputMes3List(OutputMes3 outputMes3);

    /**
     * 新增【请填写功能名称】
     * 
     * @param outputMes3 【请填写功能名称】
     * @return 结果
     */
    public int insertOutputMes3(OutputMes3 outputMes3);

    /**
     * 修改【请填写功能名称】
     * 
     * @param outputMes3 【请填写功能名称】
     * @return 结果
     */
    public int updateOutputMes3(OutputMes3 outputMes3);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param 采样时间s 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteOutputMes3By采样时间s(Date[] 采样时间s);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param 采样时间 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteOutputMes3By采样时间(Date 采样时间);
}
