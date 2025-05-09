package com.ruoyi.screen.mapper;

import java.util.List;
import com.ruoyi.screen.domain.LishiMes15;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2025-03-26
 */
public interface LishiMes15Mapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param mIindex 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public LishiMes15 selectLishiMes15ByMIindex(Long mIindex);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param lishiMes15 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<LishiMes15> selectLishiMes15List(LishiMes15 lishiMes15);

    /**
     * 新增【请填写功能名称】
     * 
     * @param lishiMes15 【请填写功能名称】
     * @return 结果
     */
    public int insertLishiMes15(LishiMes15 lishiMes15);

    /**
     * 修改【请填写功能名称】
     * 
     * @param lishiMes15 【请填写功能名称】
     * @return 结果
     */
    public int updateLishiMes15(LishiMes15 lishiMes15);

    /**
     * 删除【请填写功能名称】
     * 
     * @param mIindex 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteLishiMes15ByMIindex(Long mIindex);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param mIindexs 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteLishiMes15ByMIindexs(Long[] mIindexs);
}
