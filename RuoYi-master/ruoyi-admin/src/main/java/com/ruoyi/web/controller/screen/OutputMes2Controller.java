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
import com.ruoyi.screen.domain.OutputMes2;
import com.ruoyi.screen.service.IOutputMes2Service;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 【请填写功能名称】Controller
 * 
 * @author ruoyi
 * @date 2025-03-26
 */
@RestController
@RequestMapping("/system/mes2")
public class OutputMes2Controller extends BaseController
{
    @Autowired
    private IOutputMes2Service outputMes2Service;

    /**
     * 查询【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('system:mes2:list')")
    @GetMapping("/list")
    public TableDataInfo list(OutputMes2 outputMes2)
    {
        startPage();
        List<OutputMes2> list = outputMes2Service.selectOutputMes2List(outputMes2);
        return getDataTable(list);
    }

    /**
     * 查询【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('system:mes2:list')")
    @GetMapping("/selectAll")
    public TableDataInfo selectAll(OutputMes2 outputMes2)
    {
        startPage();
        List<OutputMes2> list = outputMes2Service.selectOutputMes2List(outputMes2);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('system:mes2:export')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, OutputMes2 outputMes2)
    {
        List<OutputMes2> list = outputMes2Service.selectOutputMes2List(outputMes2);
        ExcelUtil<OutputMes2> util = new ExcelUtil<OutputMes2>(OutputMes2.class);
        util.exportExcel(response, list, "【请填写功能名称】数据");
    }

    /**
     * 获取【请填写功能名称】详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:mes2:query')")
    @GetMapping(value = "/{采样时间}")
    public AjaxResult getInfo(@PathVariable("采样时间") Date 采样时间)
    {
        return success(outputMes2Service.selectOutputMes2By采样时间(采样时间));
    }

    /**
     * 新增【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:mes2:add')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody OutputMes2 outputMes2)
    {
        return toAjax(outputMes2Service.insertOutputMes2(outputMes2));
    }

    /**
     * 修改【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:mes2:edit')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody OutputMes2 outputMes2)
    {
        return toAjax(outputMes2Service.updateOutputMes2(outputMes2));
    }

    /**
     * 删除【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:mes2:remove')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
	@DeleteMapping("/{采样时间s}")
    public AjaxResult remove(@PathVariable Date[] 采样时间s)
    {
        return toAjax(outputMes2Service.deleteOutputMes2By采样时间s(采样时间s));
    }
}
