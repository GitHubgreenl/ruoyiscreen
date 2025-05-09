package com.ruoyi.screen.mapper;

import java.util.Date;
import java.util.List;
import com.ruoyi.screen.domain.OutputMes6;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2025-03-26
 */
public interface OutputMes6Mapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param 采样时间 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public OutputMes6 selectOutputMes6By采样时间(Date 采样时间);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param outputMes6 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<OutputMes6> selectOutputMes6List(OutputMes6 outputMes6);

    /**
     * 新增【请填写功能名称】
     * 
     * @param outputMes6 【请填写功能名称】
     * @return 结果
     */
    public int insertOutputMes6(OutputMes6 outputMes6);

    /**
     * 修改【请填写功能名称】
     * 
     * @param outputMes6 【请填写功能名称】
     * @return 结果
     */
    public int updateOutputMes6(OutputMes6 outputMes6);

    /**
     * 删除【请填写功能名称】
     * 
     * @param 采样时间 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteOutputMes6By采样时间(Date 采样时间);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param 采样时间s 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteOutputMes6By采样时间s(Date[] 采样时间s);
}
