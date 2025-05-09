package com.ruoyi.screen.domain;

import java.util.Date;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 output_mes9
 * 
 * @author ruoyi
 * @date 2025-03-26
 */
public class OutputMes9 extends BaseEntity
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
    private String XMLY66;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long XMMAR67;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long XMMAD68;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long XMAAD69;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long XMVAD70;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long XMFCAD71;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long XMQL72;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long XMQNETAR73;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long XMQNETAD74;

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
    public void setXMLY66(String XMLY66) 
    {
        this.XMLY66 = XMLY66;
    }

    public String getXMLY66() 
    {
        return XMLY66;
    }
    public void setXMMAR67(Long XMMAR67) 
    {
        this.XMMAR67 = XMMAR67;
    }

    public Long getXMMAR67() 
    {
        return XMMAR67;
    }
    public void setXMMAD68(Long XMMAD68) 
    {
        this.XMMAD68 = XMMAD68;
    }

    public Long getXMMAD68() 
    {
        return XMMAD68;
    }
    public void setXMAAD69(Long XMAAD69) 
    {
        this.XMAAD69 = XMAAD69;
    }

    public Long getXMAAD69() 
    {
        return XMAAD69;
    }
    public void setXMVAD70(Long XMVAD70) 
    {
        this.XMVAD70 = XMVAD70;
    }

    public Long getXMVAD70() 
    {
        return XMVAD70;
    }
    public void setXMFCAD71(Long XMFCAD71) 
    {
        this.XMFCAD71 = XMFCAD71;
    }

    public Long getXMFCAD71() 
    {
        return XMFCAD71;
    }
    public void setXMQL72(Long XMQL72) 
    {
        this.XMQL72 = XMQL72;
    }

    public Long getXMQL72() 
    {
        return XMQL72;
    }
    public void setXMQNETAR73(Long XMQNETAR73) 
    {
        this.XMQNETAR73 = XMQNETAR73;
    }

    public Long getXMQNETAR73() 
    {
        return XMQNETAR73;
    }
    public void setXMQNETAD74(Long XMQNETAD74) 
    {
        this.XMQNETAD74 = XMQNETAD74;
    }

    public Long getXMQNETAD74() 
    {
        return XMQNETAD74;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("采样时间", get采样时间())
            .append("countGet", getCountGet())
            .append("vDate1", getvDate1())
            .append("XMLY66", getXMLY66())
            .append("XMMAR67", getXMMAR67())
            .append("XMMAD68", getXMMAD68())
            .append("XMAAD69", getXMAAD69())
            .append("XMVAD70", getXMVAD70())
            .append("XMFCAD71", getXMFCAD71())
            .append("XMQL72", getXMQL72())
            .append("XMQNETAR73", getXMQNETAR73())
            .append("XMQNETAD74", getXMQNETAD74())
            .toString();
    }
}
