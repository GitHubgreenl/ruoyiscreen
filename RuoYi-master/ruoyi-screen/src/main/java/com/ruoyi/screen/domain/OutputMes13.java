package com.ruoyi.screen.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 output_mes13
 * 
 * @author ruoyi
 * @date 2025-03-26
 */
public class OutputMes13 extends BaseEntity
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
    private String XMSB86;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long XMYZSJ87;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long XMYZL88;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long XMTSCL89;

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
    public void setXMSB86(String XMSB86) 
    {
        this.XMSB86 = XMSB86;
    }

    public String getXMSB86() 
    {
        return XMSB86;
    }
    public void setXMYZSJ87(Long XMYZSJ87) 
    {
        this.XMYZSJ87 = XMYZSJ87;
    }

    public Long getXMYZSJ87() 
    {
        return XMYZSJ87;
    }
    public void setXMYZL88(Long XMYZL88) 
    {
        this.XMYZL88 = XMYZL88;
    }

    public Long getXMYZL88() 
    {
        return XMYZL88;
    }
    public void setXMTSCL89(Long XMTSCL89) 
    {
        this.XMTSCL89 = XMTSCL89;
    }

    public Long getXMTSCL89() 
    {
        return XMTSCL89;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("采样时间", get采样时间())
            .append("countGet", getCountGet())
            .append("vDate1", getvDate1())
            .append("XMSB86", getXMSB86())
            .append("XMYZSJ87", getXMYZSJ87())
            .append("XMYZL88", getXMYZL88())
            .append("XMTSCL89", getXMTSCL89())
            .toString();
    }
}
