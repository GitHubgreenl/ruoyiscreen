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
import com.ruoyi.screen.domain.LishiMes15;
import com.ruoyi.screen.service.ILishiMes15Service;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 【请填写功能名称】Controller
 * 
 * @author ruoyi
 * @date 2025-03-26
 */
@RestController
@RequestMapping("/system/mes15")
public class LishiMes15Controller extends BaseController
{
    @Autowired
    private ILishiMes15Service lishiMes15Service;

    /**
     * 查询【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('system:mes15:list')")
    @GetMapping("/list")
    public TableDataInfo list(LishiMes15 lishiMes15)
    {
        startPage();
        List<LishiMes15> list = lishiMes15Service.selectLishiMes15List(lishiMes15);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('system:mes15:export')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, LishiMes15 lishiMes15)
    {
        List<LishiMes15> list = lishiMes15Service.selectLishiMes15List(lishiMes15);
        ExcelUtil<LishiMes15> util = new ExcelUtil<LishiMes15>(LishiMes15.class);
        util.exportExcel(response, list, "【请填写功能名称】数据");
    }

    /**
     * 获取【请填写功能名称】详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:mes15:query')")
    @GetMapping(value = "/{mIindex}")
    public AjaxResult getInfo(@PathVariable("mIindex") Long mIindex)
    {
        return success(lishiMes15Service.selectLishiMes15ByMIindex(mIindex));
    }

    /**
     * 新增【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:mes15:add')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody LishiMes15 lishiMes15)
    {
        return toAjax(lishiMes15Service.insertLishiMes15(lishiMes15));
    }

    /**
     * 修改【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:mes15:edit')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody LishiMes15 lishiMes15)
    {
        return toAjax(lishiMes15Service.updateLishiMes15(lishiMes15));
    }

    /**
     * 删除【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:mes15:remove')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
	@DeleteMapping("/{mIindexs}")
    public AjaxResult remove(@PathVariable Long[] mIindexs)
    {
        return toAjax(lishiMes15Service.deleteLishiMes15ByMIindexs(mIindexs));
    }
}
