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
import com.ruoyi.screen.domain.Outputtable;
import com.ruoyi.screen.service.IOutputtableService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 【请填写功能名称】Controller
 * 
 * @author ruoyi
 * @date 2025-03-26
 */
@RestController
@RequestMapping("/system/outputtable")
public class OutputtableController extends BaseController
{
    @Autowired
    private IOutputtableService outputtableService;

    /**
     * 查询【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('system:outputtable:list')")
    @GetMapping("/list")
    public TableDataInfo list(Outputtable outputtable)
    {
        startPage();
        List<Outputtable> list = outputtableService.selectOutputtableList(outputtable);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('system:outputtable:export')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Outputtable outputtable)
    {
        List<Outputtable> list = outputtableService.selectOutputtableList(outputtable);
        ExcelUtil<Outputtable> util = new ExcelUtil<Outputtable>(Outputtable.class);
        util.exportExcel(response, list, "【请填写功能名称】数据");
    }

    /**
     * 获取【请填写功能名称】详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:outputtable:query')")
    @GetMapping(value = "/{采样时间}")
    public AjaxResult getInfo(@PathVariable("采样时间") Date 采样时间)
    {
        return success(outputtableService.selectOutputtableBy采样时间(采样时间));
    }

    /**
     * 新增【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:outputtable:add')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Outputtable outputtable)
    {
        return toAjax(outputtableService.insertOutputtable(outputtable));
    }

    /**
     * 修改【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:outputtable:edit')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Outputtable outputtable)
    {
        return toAjax(outputtableService.updateOutputtable(outputtable));
    }

    /**
     * 删除【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:outputtable:remove')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
	@DeleteMapping("/{采样时间s}")
    public AjaxResult remove(@PathVariable Date[] 采样时间s)
    {
        return toAjax(outputtableService.deleteOutputtableBy采样时间s(采样时间s));
    }
}
