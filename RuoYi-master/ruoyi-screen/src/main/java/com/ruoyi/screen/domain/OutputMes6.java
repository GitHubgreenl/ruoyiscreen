package com.ruoyi.screen.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

import java.util.Date;

/**
 * 【请填写功能名称】对象 output_mes6
 * 
 * @author ruoyi
 * @date 2025-03-26
 */
public class OutputMes6 extends BaseEntity
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
    private Long XMSLDH40;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long XMSLMH41;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long XMSLDSLFDL42;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long XMSLCNH43;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long XMSNDH44;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long XMSNMH45;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long XMSNDSLFDL46;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long XMSNNH47;

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
    public void setXMSLDH40(Long XMSLDH40) 
    {
        this.XMSLDH40 = XMSLDH40;
    }

    public Long getXMSLDH40() 
    {
        return XMSLDH40;
    }
    public void setXMSLMH41(Long XMSLMH41) 
    {
        this.XMSLMH41 = XMSLMH41;
    }

    public Long getXMSLMH41() 
    {
        return XMSLMH41;
    }
    public void setXMSLDSLFDL42(Long XMSLDSLFDL42) 
    {
        this.XMSLDSLFDL42 = XMSLDSLFDL42;
    }

    public Long getXMSLDSLFDL42() 
    {
        return XMSLDSLFDL42;
    }
    public void setXMSLCNH43(Long XMSLCNH43) 
    {
        this.XMSLCNH43 = XMSLCNH43;
    }

    public Long getXMSLCNH43() 
    {
        return XMSLCNH43;
    }
    public void setXMSNDH44(Long XMSNDH44) 
    {
        this.XMSNDH44 = XMSNDH44;
    }

    public Long getXMSNDH44() 
    {
        return XMSNDH44;
    }
    public void setXMSNMH45(Long XMSNMH45) 
    {
        this.XMSNMH45 = XMSNMH45;
    }

    public Long getXMSNMH45() 
    {
        return XMSNMH45;
    }
    public void setXMSNDSLFDL46(Long XMSNDSLFDL46) 
    {
        this.XMSNDSLFDL46 = XMSNDSLFDL46;
    }

    public Long getXMSNDSLFDL46() 
    {
        return XMSNDSLFDL46;
    }
    public void setXMSNNH47(Long XMSNNH47) 
    {
        this.XMSNNH47 = XMSNNH47;
    }

    public Long getXMSNNH47() 
    {
        return XMSNNH47;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("采样时间", get采样时间())
            .append("countGet", getCountGet())
            .append("vDate1", getvDate1())
            .append("XMSLDH40", getXMSLDH40())
            .append("XMSLMH41", getXMSLMH41())
            .append("XMSLDSLFDL42", getXMSLDSLFDL42())
            .append("XMSLCNH43", getXMSLCNH43())
            .append("XMSNDH44", getXMSNDH44())
            .append("XMSNMH45", getXMSNMH45())
            .append("XMSNDSLFDL46", getXMSNDSLFDL46())
            .append("XMSNNH47", getXMSNNH47())
            .toString();
    }
}
