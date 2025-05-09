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
import com.ruoyi.screen.domain.OutputMes9;
import com.ruoyi.screen.service.IOutputMes9Service;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 【请填写功能名称】Controller
 * 
 * @author ruoyi
 * @date 2025-03-26
 */
@RestController
@RequestMapping("/system/mes9")
public class OutputMes9Controller extends BaseController
{
    @Autowired
    private IOutputMes9Service outputMes9Service;

    /**
     * 查询【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('system:mes9:list')")
    @GetMapping("/list")
    public TableDataInfo list(OutputMes9 outputMes9)
    {
        startPage();
        List<OutputMes9> list = outputMes9Service.selectOutputMes9List(outputMes9);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('system:mes9:export')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, OutputMes9 outputMes9)
    {
        List<OutputMes9> list = outputMes9Service.selectOutputMes9List(outputMes9);
        ExcelUtil<OutputMes9> util = new ExcelUtil<OutputMes9>(OutputMes9.class);
        util.exportExcel(response, list, "【请填写功能名称】数据");
    }

    /**
     * 获取【请填写功能名称】详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:mes9:query')")
    @GetMapping(value = "/{采样时间}")
    public AjaxResult getInfo(@PathVariable("采样时间") Date 采样时间)
    {
        return success(outputMes9Service.selectOutputMes9By采样时间(采样时间));
    }

    /**
     * 新增【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:mes9:add')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody OutputMes9 outputMes9)
    {
        return toAjax(outputMes9Service.insertOutputMes9(outputMes9));
    }

    /**
     * 修改【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:mes9:edit')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody OutputMes9 outputMes9)
    {
        return toAjax(outputMes9Service.updateOutputMes9(outputMes9));
    }

    /**
     * 删除【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:mes9:remove')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
	@DeleteMapping("/{采样时间s}")
    public AjaxResult remove(@PathVariable Date[] 采样时间s)
    {
        return toAjax(outputMes9Service.deleteOutputMes9By采样时间s(采样时间s));
    }
}
