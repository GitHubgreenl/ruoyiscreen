package com.ruoyi.screen.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 lishi_mes5
 * 
 * @author ruoyi
 * @date 2025-03-26
 */
public class LishiMes5 extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long mIindex;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date 采样时间;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long countGet;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date vDate1;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String XMCPBH337;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long XMESBTKZQD38;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long XMESBTKYQD39;

    public void setmIindex(Long mIindex) 
    {
        this.mIindex = mIindex;
    }

    public Long getmIindex() 
    {
        return mIindex;
    }
    public void set采样时间(Date 采样时间) 
    {
        this.采样时间 = 采样时间;
    }

    public Date get采样时间() 
    {
        return 采样时间;
    }
    public void setCountGet(Long countGet) 
    {
        this.countGet = countGet;
    }

    public Long getCountGet() 
    {
        return countGet;
    }
    public void setvDate1(Date vDate1) 
    {
        this.vDate1 = vDate1;
    }

    public Date getvDate1() 
    {
        return vDate1;
    }
    public void setXMCPBH337(String XMCPBH337) 
    {
        this.XMCPBH337 = XMCPBH337;
    }

    public String getXMCPBH337() 
    {
        return XMCPBH337;
    }
    public void setXMESBTKZQD38(Long XMESBTKZQD38) 
    {
        this.XMESBTKZQD38 = XMESBTKZQD38;
    }

    public Long getXMESBTKZQD38() 
    {
        return XMESBTKZQD38;
    }
    public void setXMESBTKYQD39(Long XMESBTKYQD39) 
    {
        this.XMESBTKYQD39 = XMESBTKYQD39;
    }

    public Long getXMESBTKYQD39() 
    {
        return XMESBTKYQD39;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("mIindex", getmIindex())
            .append("采样时间", get采样时间())
            .append("countGet", getCountGet())
            .append("vDate1", getvDate1())
            .append("XMCPBH337", getXMCPBH337())
            .append("XMESBTKZQD38", getXMESBTKZQD38())
            .append("XMESBTKYQD39", getXMESBTKYQD39())
            .toString();
    }
}
