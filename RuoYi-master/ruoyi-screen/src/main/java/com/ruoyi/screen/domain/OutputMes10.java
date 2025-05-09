package com.ruoyi.screen.domain;

import java.util.Date;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 output_mes10
 * 
 * @author ruoyi
 * @date 2025-03-26
 */
public class OutputMes10 extends BaseEntity
{
    private static final long serialVersionUID = 1L;

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
    private Long XMFCAO75;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long XMKH76;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long XMN77;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long XMP78;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String XMCPBH20;

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
    public void setXMFCAO75(Long XMFCAO75) 
    {
        this.XMFCAO75 = XMFCAO75;
    }

    public Long getXMFCAO75() 
    {
        return XMFCAO75;
    }
    public void setXMKH76(Long XMKH76) 
    {
        this.XMKH76 = XMKH76;
    }

    public Long getXMKH76() 
    {
        return XMKH76;
    }
    public void setXMN77(Long XMN77) 
    {
        this.XMN77 = XMN77;
    }

    public Long getXMN77() 
    {
        return XMN77;
    }
    public void setXMP78(Long XMP78) 
    {
        this.XMP78 = XMP78;
    }

    public Long getXMP78() 
    {
        return XMP78;
    }
    public void setXMCPBH20(String XMCPBH20) 
    {
        this.XMCPBH20 = XMCPBH20;
    }

    public String getXMCPBH20() 
    {
        return XMCPBH20;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("采样时间", get采样时间())
            .append("countGet", getCountGet())
            .append("vDate1", getvDate1())
            .append("XMFCAO75", getXMFCAO75())
            .append("XMKH76", getXMKH76())
            .append("XMN77", getXMN77())
            .append("XMP78", getXMP78())
            .append("XMCPBH20", getXMCPBH20())
            .toString();
    }
}
