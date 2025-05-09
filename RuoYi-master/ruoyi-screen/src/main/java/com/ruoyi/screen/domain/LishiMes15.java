package com.ruoyi.screen.domain;

import java.util.Date;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 lishi_mes15
 * 
 * @author ruoyi
 * @date 2025-03-26
 */
public class LishiMes15 extends BaseEntity
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
    private String XMSLYG0;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long XMLOSS1;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long XMLOSS2;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long XMAL2O33;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long XMFe2O34;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long XMCaO5;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long XMMgO6;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long XMKH7;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long XMN8;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long XMP9;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long XMK2O10;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long XMNa2O11;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long XMSO312;

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
    public void setXMSLYG0(String XMSLYG0) 
    {
        this.XMSLYG0 = XMSLYG0;
    }

    public String getXMSLYG0() 
    {
        return XMSLYG0;
    }
    public void setXMLOSS1(Long XMLOSS1) 
    {
        this.XMLOSS1 = XMLOSS1;
    }

    public Long getXMLOSS1() 
    {
        return XMLOSS1;
    }
    public void setXMLOSS2(Long XMLOSS2) 
    {
        this.XMLOSS2 = XMLOSS2;
    }

    public Long getXMLOSS2() 
    {
        return XMLOSS2;
    }
    public void setXMAL2O33(Long XMAL2O33) 
    {
        this.XMAL2O33 = XMAL2O33;
    }

    public Long getXMAL2O33() 
    {
        return XMAL2O33;
    }
    public void setXMFe2O34(Long XMFe2O34) 
    {
        this.XMFe2O34 = XMFe2O34;
    }

    public Long getXMFe2O34() 
    {
        return XMFe2O34;
    }
    public void setXMCaO5(Long XMCaO5) 
    {
        this.XMCaO5 = XMCaO5;
    }

    public Long getXMCaO5() 
    {
        return XMCaO5;
    }
    public void setXMMgO6(Long XMMgO6) 
    {
        this.XMMgO6 = XMMgO6;
    }

    public Long getXMMgO6() 
    {
        return XMMgO6;
    }
    public void setXMKH7(Long XMKH7) 
    {
        this.XMKH7 = XMKH7;
    }

    public Long getXMKH7() 
    {
        return XMKH7;
    }
    public void setXMN8(Long XMN8) 
    {
        this.XMN8 = XMN8;
    }

    public Long getXMN8() 
    {
        return XMN8;
    }
    public void setXMP9(Long XMP9) 
    {
        this.XMP9 = XMP9;
    }

    public Long getXMP9() 
    {
        return XMP9;
    }
    public void setXMK2O10(Long XMK2O10) 
    {
        this.XMK2O10 = XMK2O10;
    }

    public Long getXMK2O10() 
    {
        return XMK2O10;
    }
    public void setXMNa2O11(Long XMNa2O11) 
    {
        this.XMNa2O11 = XMNa2O11;
    }

    public Long getXMNa2O11() 
    {
        return XMNa2O11;
    }
    public void setXMSO312(Long XMSO312) 
    {
        this.XMSO312 = XMSO312;
    }

    public Long getXMSO312() 
    {
        return XMSO312;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("mIindex", getmIindex())
            .append("采样时间", get采样时间())
            .append("countGet", getCountGet())
            .append("vDate1", getvDate1())
            .append("XMSLYG0", getXMSLYG0())
            .append("XMLOSS1", getXMLOSS1())
            .append("XMLOSS2", getXMLOSS2())
            .append("XMAL2O33", getXMAL2O33())
            .append("XMFe2O34", getXMFe2O34())
            .append("XMCaO5", getXMCaO5())
            .append("XMMgO6", getXMMgO6())
            .append("XMKH7", getXMKH7())
            .append("XMN8", getXMN8())
            .append("XMP9", getXMP9())
            .append("XMK2O10", getXMK2O10())
            .append("XMNa2O11", getXMNa2O11())
            .append("XMSO312", getXMSO312())
            .toString();
    }
}
