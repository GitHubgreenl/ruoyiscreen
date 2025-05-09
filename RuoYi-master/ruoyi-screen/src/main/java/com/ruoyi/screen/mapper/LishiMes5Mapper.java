package com.ruoyi.screen.mapper;

import java.util.List;
import com.ruoyi.screen.domain.LishiMes5;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2025-03-26
 */
public interface LishiMes5Mapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param mIindex 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public LishiMes5 selectLishiMes5ByMIindex(Long mIindex);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param lishiMes5 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<LishiMes5> selectLishiMes5List(LishiMes5 lishiMes5);

    /**
     * 新增【请填写功能名称】
     * 
     * @param lishiMes5 【请填写功能名称】
     * @return 结果
     */
    public int insertLishiMes5(LishiMes5 lishiMes5);

    /**
     * 修改【请填写功能名称】
     * 
     * @param lishiMes5 【请填写功能名称】
     * @return 结果
     */
    public int updateLishiMes5(LishiMes5 lishiMes5);

    /**
     * 删除【请填写功能名称】
     * 
     * @param mIindex 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteLishiMes5ByMIindex(Long mIindex);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param mIindexs 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteLishiMes5ByMIindexs(Long[] mIindexs);
}
