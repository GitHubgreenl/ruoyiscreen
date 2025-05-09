package com.ruoyi.screen.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 大屏对象 lishi_mes1
 * 
 * @author ruoyi
 * @date 2025-03-19
 */
public class LishiMes1 extends BaseEntity
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
    private Long XMSLRCL2;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long XMMFRCL3;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long XMSLRCL4;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long XMSNRCL5;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long XMYRFDLRCL6;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long XMSLCLYLJ7;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long MMFCLYLJ8;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long SMLCLYLJ9;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long SMNCLYLJ10;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long XMYRFDLRCL11;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long XMRXH12;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long XMSLRXH13;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long XMMFRXH14;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long XMSNRXH15;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long XMYRFDLRXH16;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long XMSLKC17;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long XMMFKC18;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long XMSLKC19;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long XMSNKC20;

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
    public void setXMSLRCL2(Long XMSLRCL2) 
    {
        this.XMSLRCL2 = XMSLRCL2;
    }

    public Long getXMSLRCL2() 
    {
        return XMSLRCL2;
    }
    public void setXMMFRCL3(Long XMMFRCL3) 
    {
        this.XMMFRCL3 = XMMFRCL3;
    }

    public Long getXMMFRCL3() 
    {
        return XMMFRCL3;
    }
    public void setXMSLRCL4(Long XMSLRCL4) 
    {
        this.XMSLRCL4 = XMSLRCL4;
    }

    public Long getXMSLRCL4() 
    {
        return XMSLRCL4;
    }
    public void setXMSNRCL5(Long XMSNRCL5) 
    {
        this.XMSNRCL5 = XMSNRCL5;
    }

    public Long getXMSNRCL5() 
    {
        return XMSNRCL5;
    }
    public void setXMYRFDLRCL6(Long XMYRFDLRCL6) 
    {
        this.XMYRFDLRCL6 = XMYRFDLRCL6;
    }

    public Long getXMYRFDLRCL6() 
    {
        return XMYRFDLRCL6;
    }
    public void setXMSLCLYLJ7(Long XMSLCLYLJ7) 
    {
        this.XMSLCLYLJ7 = XMSLCLYLJ7;
    }

    public Long getXMSLCLYLJ7() 
    {
        return XMSLCLYLJ7;
    }
    public void setMMFCLYLJ8(Long MMFCLYLJ8) 
    {
        this.MMFCLYLJ8 = MMFCLYLJ8;
    }

    public Long getMMFCLYLJ8() 
    {
        return MMFCLYLJ8;
    }
    public void setSMLCLYLJ9(Long SMLCLYLJ9) 
    {
        this.SMLCLYLJ9 = SMLCLYLJ9;
    }

    public Long getSMLCLYLJ9() 
    {
        return SMLCLYLJ9;
    }
    public void setSMNCLYLJ10(Long SMNCLYLJ10) 
    {
        this.SMNCLYLJ10 = SMNCLYLJ10;
    }

    public Long getSMNCLYLJ10() 
    {
        return SMNCLYLJ10;
    }
    public void setXMYRFDLRCL11(Long XMYRFDLRCL11) 
    {
        this.XMYRFDLRCL11 = XMYRFDLRCL11;
    }

    public Long getXMYRFDLRCL11() 
    {
        return XMYRFDLRCL11;
    }
    public void setXMRXH12(Long XMRXH12) 
    {
        this.XMRXH12 = XMRXH12;
    }

    public Long getXMRXH12() 
    {
        return XMRXH12;
    }
    public void setXMSLRXH13(Long XMSLRXH13) 
    {
        this.XMSLRXH13 = XMSLRXH13;
    }

    public Long getXMSLRXH13() 
    {
        return XMSLRXH13;
    }
    public void setXMMFRXH14(Long XMMFRXH14) 
    {
        this.XMMFRXH14 = XMMFRXH14;
    }

    public Long getXMMFRXH14() 
    {
        return XMMFRXH14;
    }
    public void setXMSNRXH15(Long XMSNRXH15) 
    {
        this.XMSNRXH15 = XMSNRXH15;
    }

    public Long getXMSNRXH15() 
    {
        return XMSNRXH15;
    }
    public void setXMYRFDLRXH16(Long XMYRFDLRXH16) 
    {
        this.XMYRFDLRXH16 = XMYRFDLRXH16;
    }

    public Long getXMYRFDLRXH16() 
    {
        return XMYRFDLRXH16;
    }
    public void setXMSLKC17(Long XMSLKC17) 
    {
        this.XMSLKC17 = XMSLKC17;
    }

    public Long getXMSLKC17() 
    {
        return XMSLKC17;
    }
    public void setXMMFKC18(Long XMMFKC18) 
    {
        this.XMMFKC18 = XMMFKC18;
    }

    public Long getXMMFKC18() 
    {
        return XMMFKC18;
    }
    public void setXMSLKC19(Long XMSLKC19) 
    {
        this.XMSLKC19 = XMSLKC19;
    }

    public Long getXMSLKC19() 
    {
        return XMSLKC19;
    }
    public void setXMSNKC20(Long XMSNKC20) 
    {
        this.XMSNKC20 = XMSNKC20;
    }

    public Long getXMSNKC20() 
    {
        return XMSNKC20;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("mIindex", getmIindex())
            .append("采样时间", get采样时间())
            .append("countGet", getCountGet())
            .append("vDate1", getvDate1())
            .append("XMSLRCL2", getXMSLRCL2())
            .append("XMMFRCL3", getXMMFRCL3())
            .append("XMSLRCL4", getXMSLRCL4())
            .append("XMSNRCL5", getXMSNRCL5())
            .append("XMYRFDLRCL6", getXMYRFDLRCL6())
            .append("XMSLCLYLJ7", getXMSLCLYLJ7())
            .append("MMFCLYLJ8", getMMFCLYLJ8())
            .append("SMLCLYLJ9", getSMLCLYLJ9())
            .append("SMNCLYLJ10", getSMNCLYLJ10())
            .append("XMYRFDLRCL11", getXMYRFDLRCL11())
            .append("XMRXH12", getXMRXH12())
            .append("XMSLRXH13", getXMSLRXH13())
            .append("XMMFRXH14", getXMMFRXH14())
            .append("XMSNRXH15", getXMSNRXH15())
            .append("XMYRFDLRXH16", getXMYRFDLRXH16())
            .append("XMSLKC17", getXMSLKC17())
            .append("XMMFKC18", getXMMFKC18())
            .append("XMSLKC19", getXMSLKC19())
            .append("XMSNKC20", getXMSNKC20())
            .toString();
    }
}
