package com.ruoyi.screen.mapper;

import java.util.Date;
import java.util.List;
import com.ruoyi.screen.domain.OutputMes13;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2025-03-26
 */
public interface OutputMes13Mapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param 采样时间 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public OutputMes13 selectOutputMes13By采样时间(Date 采样时间);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param outputMes13 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<OutputMes13> selectOutputMes13List(OutputMes13 outputMes13);

    /**
     * 新增【请填写功能名称】
     * 
     * @param outputMes13 【请填写功能名称】
     * @return 结果
     */
    public int insertOutputMes13(OutputMes13 outputMes13);

    /**
     * 修改【请填写功能名称】
     * 
     * @param outputMes13 【请填写功能名称】
     * @return 结果
     */
    public int updateOutputMes13(OutputMes13 outputMes13);

    /**
     * 删除【请填写功能名称】
     * 
     * @param 采样时间 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteOutputMes13By采样时间(Date 采样时间);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param 采样时间s 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteOutputMes13By采样时间s(Date[] 采样时间s);

    public List<OutputMes13> getEquipment();
}
