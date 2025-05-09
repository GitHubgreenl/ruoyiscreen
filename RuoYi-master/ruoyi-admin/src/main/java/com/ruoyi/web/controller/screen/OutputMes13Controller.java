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
import com.ruoyi.screen.domain.OutputMes13;
import com.ruoyi.screen.service.IOutputMes13Service;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 【请填写功能名称】Controller
 * 
 * @author ruoyi
 * @date 2025-03-26
 */
@RestController
@RequestMapping("/screen/mes13")
public class OutputMes13Controller extends BaseController
{
    @Autowired
    private IOutputMes13Service outputMes13Service;

    /**
     * 查询【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('system:mes13:list')")
    @GetMapping("/list")
    public TableDataInfo list(OutputMes13 outputMes13)
    {
        startPage();
        List<OutputMes13> list = outputMes13Service.selectOutputMes13List(outputMes13);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('system:mes13:export')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, OutputMes13 outputMes13)
    {
        List<OutputMes13> list = outputMes13Service.selectOutputMes13List(outputMes13);
        ExcelUtil<OutputMes13> util = new ExcelUtil<OutputMes13>(OutputMes13.class);
        util.exportExcel(response, list, "【请填写功能名称】数据");
    }

    /**
     * 获取【请填写功能名称】详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:mes13:query')")
    @GetMapping(value = "/{采样时间}")
    public AjaxResult getInfo(@PathVariable("采样时间") Date 采样时间)
    {
        return success(outputMes13Service.selectOutputMes13By采样时间(采样时间));
    }

    /**
     * 新增【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:mes13:add')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody OutputMes13 outputMes13)
    {
        return toAjax(outputMes13Service.insertOutputMes13(outputMes13));
    }

    /**
     * 修改【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:mes13:edit')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody OutputMes13 outputMes13)
    {
        return toAjax(outputMes13Service.updateOutputMes13(outputMes13));
    }

    /**
     * 删除【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:mes13:remove')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
	@DeleteMapping("/{采样时间s}")
    public AjaxResult remove(@PathVariable Date[] 采样时间s)
    {
        return toAjax(outputMes13Service.deleteOutputMes13By采样时间s(采样时间s));
    }

    @PreAuthorize("@ss.hasPermi('system:mes13:getEquipment')")
    @GetMapping("/getEquipment")
    public TableDataInfo getEquipment(OutputMes13 outputMes13)
    {
        List<OutputMes13> list = outputMes13Service.selectOutputMes13List(outputMes13);
        return getDataTable(list);
    }
}
