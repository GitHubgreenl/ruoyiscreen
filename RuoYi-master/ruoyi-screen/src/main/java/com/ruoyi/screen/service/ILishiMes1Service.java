package com.ruoyi.screen.service;

import java.util.List;
import com.ruoyi.screen.domain.LishiMes1;

/**
 * 大屏Service接口
 * 
 * @author ruoyi
 * @date 2025-03-19
 */
public interface ILishiMes1Service 
{
    /**
     * 查询大屏
     * 
     * @param mIindex 大屏主键
     * @return 大屏
     */
    public LishiMes1 selectLishiMes1ByMIindex(Long mIindex);

    /**
     * 查询大屏列表
     * 
     * @param lishiMes1 大屏
     * @return 大屏集合
     */
    public List<LishiMes1> selectLishiMes1List(LishiMes1 lishiMes1);

    /**
     * 新增大屏
     * 
     * @param lishiMes1 大屏
     * @return 结果
     */
    public int insertLishiMes1(LishiMes1 lishiMes1);

    /**
     * 修改大屏
     * 
     * @param lishiMes1 大屏
     * @return 结果
     */
    public int updateLishiMes1(LishiMes1 lishiMes1);

    /**
     * 批量删除大屏
     * 
     * @param mIindexs 需要删除的大屏主键集合
     * @return 结果
     */
    public int deleteLishiMes1ByMIindexs(Long[] mIindexs);

    /**
     * 删除大屏信息
     * 
     * @param mIindex 大屏主键
     * @return 结果
     */
    public int deleteLishiMes1ByMIindex(Long mIindex);
}
