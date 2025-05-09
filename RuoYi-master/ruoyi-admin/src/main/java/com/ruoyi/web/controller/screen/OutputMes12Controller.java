package com.ruoyi.web.controller.screen;

import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.screen.domain.OutputMes12;
import com.ruoyi.screen.service.IOutputMes12Service;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 【请填写功能名称】Controller
 * 
 * @author ruoyi
 * @date 2025-03-26
 */
@RestController
@RequestMapping("/system/mes12")
public class OutputMes12Controller extends BaseController
{
    @Autowired
    private IOutputMes12Service outputMes12Service;

    /**
     * 查询【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('system:mes12:list')")
    @GetMapping("/list")
    public TableDataInfo list(OutputMes12 outputMes12)
    {
        startPage();
        List<OutputMes12> list = outputMes12Service.selectOutputMes12List(outputMes12);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('system:mes12:export')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, OutputMes12 outputMes12)
    {
        List<OutputMes12> list = outputMes12Service.selectOutputMes12List(outputMes12);
        ExcelUtil<OutputMes12> util = new ExcelUtil<OutputMes12>(OutputMes12.class);
        util.exportExcel(response, list, "【请填写功能名称】数据");
    }

    /**
     * 获取【请填写功能名称】详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:mes12:query')")
    @GetMapping(value = "/{采样时间}")
    public AjaxResult getInfo(@PathVariable("采样时间") Date 采样时间)
    {
        return success(outputMes12Service.selectOutputMes12By采样时间(采样时间));
    }

    /**
     * 新增【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:mes12:add')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody OutputMes12 outputMes12)
    {
        return toAjax(outputMes12Service.insertOutputMes12(outputMes12));
    }

    /**
     * 修改【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:mes12:edit')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody OutputMes12 outputMes12)
    {
        return toAjax(outputMes12Service.updateOutputMes12(outputMes12));
    }

    /**
     * 删除【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:mes12:remove')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
	@DeleteMapping("/{采样时间s}")
    public AjaxResult remove(@PathVariable Date[] 采样时间s)
    {
        return toAjax(outputMes12Service.deleteOutputMes12By采样时间s(采样时间s));
    }
}
