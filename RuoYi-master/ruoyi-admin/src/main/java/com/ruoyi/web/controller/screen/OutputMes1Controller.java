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
import com.ruoyi.screen.domain.OutputMes1;
import com.ruoyi.screen.service.IOutputMes1Service;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 【请填写功能名称】Controller
 * 
 * @author ruoyi
 * @date 2025-03-26
 */
@RestController
@RequestMapping("/system/mes1")
public class OutputMes1Controller extends BaseController
{
    @Autowired
    private IOutputMes1Service outputMes1Service;

    /**
     * 查询【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('system:mes1:list')")
    @GetMapping("/list")
    public TableDataInfo list(OutputMes1 outputMes1)
    {
        startPage();
        List<OutputMes1> list = outputMes1Service.selectOutputMes1List(outputMes1);
        return getDataTable(list);
    }

    @PreAuthorize("@ss.hasPermi('system:mes1:getproduce')")
    @GetMapping("/getproduce")
    public TableDataInfo getproduce()
    {
        startPage();
        List<List<String>>list = outputMes1Service.getProduce();
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('system:mes1:export')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, OutputMes1 outputMes1)
    {
        List<OutputMes1> list = outputMes1Service.selectOutputMes1List(outputMes1);
        ExcelUtil<OutputMes1> util = new ExcelUtil<OutputMes1>(OutputMes1.class);
        util.exportExcel(response, list, "【请填写功能名称】数据");
    }

    /**
     * 获取【请填写功能名称】详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:mes1:query')")
    @GetMapping(value = "/{采样时间}")
    public AjaxResult getInfo(@PathVariable("采样时间") Date 采样时间)
    {
        return success(outputMes1Service.selectOutputMes1By采样时间(采样时间));
    }

    /**
     * 新增【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:mes1:add')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody OutputMes1 outputMes1)
    {
        return toAjax(outputMes1Service.insertOutputMes1(outputMes1));
    }

    /**
     * 修改【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:mes1:edit')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody OutputMes1 outputMes1)
    {
        return toAjax(outputMes1Service.updateOutputMes1(outputMes1));
    }

    /**
     * 删除【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:mes1:remove')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
	@DeleteMapping("/{采样时间s}")
    public AjaxResult remove(@PathVariable Date[] 采样时间s)
    {
        return toAjax(outputMes1Service.deleteOutputMes1By采样时间s(采样时间s));
    }
}
