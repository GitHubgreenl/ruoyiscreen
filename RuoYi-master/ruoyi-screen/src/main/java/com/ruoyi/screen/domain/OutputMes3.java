package com.ruoyi.screen.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 output_mes3
 * 
 * @author ruoyi
 * @date 2025-03-26
 */
public class OutputMes3 extends BaseEntity
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
    private String XMCPBH129;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long XMBB30;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long XMCD31;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long XMCN32;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long XMZN33;

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
    public void setXMCPBH129(String XMCPBH129) 
    {
        this.XMCPBH129 = XMCPBH129;
    }

    public String getXMCPBH129() 
    {
        return XMCPBH129;
    }
    public void setXMBB30(Long XMBB30) 
    {
        this.XMBB30 = XMBB30;
    }

    public Long getXMBB30() 
    {
        return XMBB30;
    }
    public void setXMCD31(Long XMCD31) 
    {
        this.XMCD31 = XMCD31;
    }

    public Long getXMCD31() 
    {
        return XMCD31;
    }
    public void setXMCN32(Long XMCN32) 
    {
        this.XMCN32 = XMCN32;
    }

    public Long getXMCN32() 
    {
        return XMCN32;
    }
    public void setXMZN33(Long XMZN33) 
    {
        this.XMZN33 = XMZN33;
    }

    public Long getXMZN33() 
    {
        return XMZN33;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("采样时间", get采样时间())
            .append("countGet", getCountGet())
            .append("vDate1", getvDate1())
            .append("XMCPBH129", getXMCPBH129())
            .append("XMBB30", getXMBB30())
            .append("XMCD31", getXMCD31())
            .append("XMCN32", getXMCN32())
            .append("XMZN33", getXMZN33())
            .toString();
    }
}
