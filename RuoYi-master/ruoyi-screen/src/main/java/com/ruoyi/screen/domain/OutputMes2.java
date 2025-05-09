package com.ruoyi.screen.domain;

import java.util.Date;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 output_mes2
 * 
 * @author ruoyi
 * @date 2025-03-26
 */
public class OutputMes2 extends BaseEntity
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
    private Long XMYTKLWHL21;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long XMYWYSKLWHL22;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long XMYDYHW23;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long XMYEYHL24;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long XMPAL25;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long XMRTPFL26;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long XMTPFLNLJ27;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long XMSLTPFLQD28;

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
    public void setXMYTKLWHL21(Long XMYTKLWHL21) 
    {
        this.XMYTKLWHL21 = XMYTKLWHL21;
    }

    public Long getXMYTKLWHL21() 
    {
        return XMYTKLWHL21;
    }
    public void setXMYWYSKLWHL22(Long XMYWYSKLWHL22) 
    {
        this.XMYWYSKLWHL22 = XMYWYSKLWHL22;
    }

    public Long getXMYWYSKLWHL22() 
    {
        return XMYWYSKLWHL22;
    }
    public void setXMYDYHW23(Long XMYDYHW23) 
    {
        this.XMYDYHW23 = XMYDYHW23;
    }

    public Long getXMYDYHW23() 
    {
        return XMYDYHW23;
    }
    public void setXMYEYHL24(Long XMYEYHL24) 
    {
        this.XMYEYHL24 = XMYEYHL24;
    }

    public Long getXMYEYHL24() 
    {
        return XMYEYHL24;
    }
    public void setXMPAL25(Long XMPAL25) 
    {
        this.XMPAL25 = XMPAL25;
    }

    public Long getXMPAL25() 
    {
        return XMPAL25;
    }
    public void setXMRTPFL26(Long XMRTPFL26) 
    {
        this.XMRTPFL26 = XMRTPFL26;
    }

    public Long getXMRTPFL26() 
    {
        return XMRTPFL26;
    }
    public void setXMTPFLNLJ27(Long XMTPFLNLJ27) 
    {
        this.XMTPFLNLJ27 = XMTPFLNLJ27;
    }

    public Long getXMTPFLNLJ27() 
    {
        return XMTPFLNLJ27;
    }
    public void setXMSLTPFLQD28(Long XMSLTPFLQD28) 
    {
        this.XMSLTPFLQD28 = XMSLTPFLQD28;
    }

    public Long getXMSLTPFLQD28() 
    {
        return XMSLTPFLQD28;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("采样时间", get采样时间())
            .append("countGet", getCountGet())
            .append("vDate1", getvDate1())
            .append("XMYTKLWHL21", getXMYTKLWHL21())
            .append("XMYWYSKLWHL22", getXMYWYSKLWHL22())
            .append("XMYDYHW23", getXMYDYHW23())
            .append("XMYEYHL24", getXMYEYHL24())
            .append("XMPAL25", getXMPAL25())
            .append("XMRTPFL26", getXMRTPFL26())
            .append("XMTPFLNLJ27", getXMTPFLNLJ27())
            .append("XMSLTPFLQD28", getXMSLTPFLQD28())
            .toString();
    }
}
