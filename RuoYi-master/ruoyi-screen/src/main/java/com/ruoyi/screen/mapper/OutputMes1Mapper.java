package com.ruoyi.screen.mapper;

import java.util.Date;
import java.util.List;
import com.ruoyi.screen.domain.OutputMes1;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2025-03-26
 */
public interface OutputMes1Mapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param 采样时间 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public OutputMes1 selectOutputMes1By采样时间(Date 采样时间);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param outputMes1 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<OutputMes1> selectOutputMes1List(OutputMes1 outputMes1);

    public List<String> getProduce();
    /**
     * 新增【请填写功能名称】
     * 
     * @param outputMes1 【请填写功能名称】
     * @return 结果
     */
    public int insertOutputMes1(OutputMes1 outputMes1);

    /**
     * 修改【请填写功能名称】
     * 
     * @param outputMes1 【请填写功能名称】
     * @return 结果
     */
    public int updateOutputMes1(OutputMes1 outputMes1);

    /**
     * 删除【请填写功能名称】
     * 
     * @param 采样时间 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteOutputMes1By采样时间(Date 采样时间);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param 采样时间s 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteOutputMes1By采样时间s(Date[] 采样时间s);
}
