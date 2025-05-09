package com.ruoyi.screen.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.screen.mapper.LishiMes1Mapper;
import com.ruoyi.screen.domain.LishiMes1;
import com.ruoyi.screen.service.ILishiMes1Service;

/**
 * 大屏Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-03-19
 */
@Service
public class LishiMes1ServiceImpl implements ILishiMes1Service 
{
    @Autowired
    private LishiMes1Mapper lishiMes1Mapper;

    /**
     * 查询大屏
     * 
     * @param mIindex 大屏主键
     * @return 大屏
     */
    @Override
    public LishiMes1 selectLishiMes1ByMIindex(Long mIindex)
    {
        return lishiMes1Mapper.selectLishiMes1ByMIindex(mIindex);
    }

    /**
     * 查询大屏列表
     * 
     * @param lishiMes1 大屏
     * @return 大屏
     */
    @Override
    public List<LishiMes1> selectLishiMes1List(LishiMes1 lishiMes1)
    {
        return lishiMes1Mapper.selectLishiMes1List(lishiMes1);
    }

    /**
     * 新增大屏
     * 
     * @param lishiMes1 大屏
     * @return 结果
     */
    @Override
    public int insertLishiMes1(LishiMes1 lishiMes1)
    {
        return lishiMes1Mapper.insertLishiMes1(lishiMes1);
    }

    /**
     * 修改大屏
     * 
     * @param lishiMes1 大屏
     * @return 结果
     */
    @Override
    public int updateLishiMes1(LishiMes1 lishiMes1)
    {
        return lishiMes1Mapper.updateLishiMes1(lishiMes1);
    }

    /**
     * 批量删除大屏
     * 
     * @param mIindexs 需要删除的大屏主键
     * @return 结果
     */
    @Override
    public int deleteLishiMes1ByMIindexs(Long[] mIindexs)
    {
        return lishiMes1Mapper.deleteLishiMes1ByMIindexs(mIindexs);
    }

    /**
     * 删除大屏信息
     * 
     * @param mIindex 大屏主键
     * @return 结果
     */
    @Override
    public int deleteLishiMes1ByMIindex(Long mIindex)
    {
        return lishiMes1Mapper.deleteLishiMes1ByMIindex(mIindex);
    }
}
