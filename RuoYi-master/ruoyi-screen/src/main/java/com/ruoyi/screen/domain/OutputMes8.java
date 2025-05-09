package com.ruoyi.screen.domain;

import java.util.Date;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 output_mes8
 * 
 * @author ruoyi
 * @date 2025-03-26
 */
public class OutputMes8 extends BaseEntity
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
    private String XMLY56;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String XMMC57;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long XMSF58;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long XMBB59;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long XMLOSS60;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long XMSO361;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long XMMGO62;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long XMAL2O363;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long XMFCAO64;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date XMJC65;

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
    public void setXMLY56(String XMLY56) 
    {
        this.XMLY56 = XMLY56;
    }

    public String getXMLY56() 
    {
        return XMLY56;
    }
    public void setXMMC57(String XMMC57) 
    {
        this.XMMC57 = XMMC57;
    }

    public String getXMMC57() 
    {
        return XMMC57;
    }
    public void setXMSF58(Long XMSF58) 
    {
        this.XMSF58 = XMSF58;
    }

    public Long getXMSF58() 
    {
        return XMSF58;
    }
    public void setXMBB59(Long XMBB59) 
    {
        this.XMBB59 = XMBB59;
    }

    public Long getXMBB59() 
    {
        return XMBB59;
    }
    public void setXMLOSS60(Long XMLOSS60) 
    {
        this.XMLOSS60 = XMLOSS60;
    }

    public Long getXMLOSS60() 
    {
        return XMLOSS60;
    }
    public void setXMSO361(Long XMSO361) 
    {
        this.XMSO361 = XMSO361;
    }

    public Long getXMSO361() 
    {
        return XMSO361;
    }
    public void setXMMGO62(Long XMMGO62) 
    {
        this.XMMGO62 = XMMGO62;
    }

    public Long getXMMGO62() 
    {
        return XMMGO62;
    }
    public void setXMAL2O363(Long XMAL2O363) 
    {
        this.XMAL2O363 = XMAL2O363;
    }

    public Long getXMAL2O363() 
    {
        return XMAL2O363;
    }
    public void setXMFCAO64(Long XMFCAO64) 
    {
        this.XMFCAO64 = XMFCAO64;
    }

    public Long getXMFCAO64() 
    {
        return XMFCAO64;
    }
    public void setXMJC65(Date XMJC65) 
    {
        this.XMJC65 = XMJC65;
    }

    public Date getXMJC65() 
    {
        return XMJC65;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("采样时间", get采样时间())
            .append("countGet", getCountGet())
            .append("vDate1", getvDate1())
            .append("XMLY56", getXMLY56())
            .append("XMMC57", getXMMC57())
            .append("XMSF58", getXMSF58())
            .append("XMBB59", getXMBB59())
            .append("XMLOSS60", getXMLOSS60())
            .append("XMSO361", getXMSO361())
            .append("XMMGO62", getXMMGO62())
            .append("XMAL2O363", getXMAL2O363())
            .append("XMFCAO64", getXMFCAO64())
            .append("XMJC65", getXMJC65())
            .toString();
    }
}
