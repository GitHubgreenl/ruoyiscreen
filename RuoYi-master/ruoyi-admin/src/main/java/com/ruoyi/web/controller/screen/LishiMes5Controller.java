package com.ruoyi.web.controller.screen;

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
import com.ruoyi.screen.domain.LishiMes5;
import com.ruoyi.screen.service.ILishiMes5Service;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 【请填写功能名称】Controller
 * 
 * @author ruoyi
 * @date 2025-03-26
 */
@RestController
@RequestMapping("/system/mes5")
public class LishiMes5Controller extends BaseController
{
    @Autowired
    private ILishiMes5Service lishiMes5Service;

    /**
     * 查询【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('system:mes5:list')")
    @GetMapping("/list")
    public TableDataInfo list(LishiMes5 lishiMes5)
    {
        startPage();
        List<LishiMes5> list = lishiMes5Service.selectLishiMes5List(lishiMes5);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('system:mes5:export')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, LishiMes5 lishiMes5)
    {
        List<LishiMes5> list = lishiMes5Service.selectLishiMes5List(lishiMes5);
        ExcelUtil<LishiMes5> util = new ExcelUtil<LishiMes5>(LishiMes5.class);
        util.exportExcel(response, list, "【请填写功能名称】数据");
    }

    /**
     * 获取【请填写功能名称】详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:mes5:query')")
    @GetMapping(value = "/{mIindex}")
    public AjaxResult getInfo(@PathVariable("mIindex") Long mIindex)
    {
        return success(lishiMes5Service.selectLishiMes5ByMIindex(mIindex));
    }

    /**
     * 新增【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:mes5:add')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody LishiMes5 lishiMes5)
    {
        return toAjax(lishiMes5Service.insertLishiMes5(lishiMes5));
    }

    /**
     * 修改【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:mes5:edit')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody LishiMes5 lishiMes5)
    {
        return toAjax(lishiMes5Service.updateLishiMes5(lishiMes5));
    }

    /**
     * 删除【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:mes5:remove')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
	@DeleteMapping("/{mIindexs}")
    public AjaxResult remove(@PathVariable Long[] mIindexs)
    {
        return toAjax(lishiMes5Service.deleteLishiMes5ByMIindexs(mIindexs));
    }
}
