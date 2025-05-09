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
import com.ruoyi.screen.domain.LishiMes1;
import com.ruoyi.screen.service.ILishiMes1Service;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 大屏Controller
 * 
 * @author ruoyi
 * @date 2025-03-19
 */
@RestController
@RequestMapping("/screen/platform")
public class LishiMes1Controller extends BaseController
{
    @Autowired
    private ILishiMes1Service lishiMes1Service;

    /**
     * 查询大屏列表
     */
    @PreAuthorize("@ss.hasPermi('screen:platform:list')")
    @GetMapping("/list")
    public TableDataInfo list(LishiMes1 lishiMes1)
    {
        startPage();
        List<LishiMes1> list = lishiMes1Service.selectLishiMes1List(lishiMes1);
        return getDataTable(list);
    }

    /**
     * 导出大屏列表
     */
    @PreAuthorize("@ss.hasPermi('screen:platform:export')")
    @Log(title = "大屏", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, LishiMes1 lishiMes1)
    {
        List<LishiMes1> list = lishiMes1Service.selectLishiMes1List(lishiMes1);
        ExcelUtil<LishiMes1> util = new ExcelUtil<LishiMes1>(LishiMes1.class);
        util.exportExcel(response, list, "大屏数据");
    }

    /**
     * 获取大屏详细信息
     */
    @PreAuthorize("@ss.hasPermi('screen:platform:query')")
    @GetMapping(value = "/{mIindex}")
    public AjaxResult getInfo(@PathVariable("mIindex") Long mIindex)
    {
        return success(lishiMes1Service.selectLishiMes1ByMIindex(mIindex));
    }

    /**
     * 新增大屏
     */
    @PreAuthorize("@ss.hasPermi('screen:platform:add')")
    @Log(title = "大屏", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody LishiMes1 lishiMes1)
    {
        return toAjax(lishiMes1Service.insertLishiMes1(lishiMes1));
    }

    /**
     * 修改大屏
     */
    @PreAuthorize("@ss.hasPermi('screen:platform:edit')")
    @Log(title = "大屏", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody LishiMes1 lishiMes1)
    {
        return toAjax(lishiMes1Service.updateLishiMes1(lishiMes1));
    }

    /**
     * 删除大屏
     */
    @PreAuthorize("@ss.hasPermi('screen:platform:remove')")
    @Log(title = "大屏", businessType = BusinessType.DELETE)
	@DeleteMapping("/{mIindexs}")
    public AjaxResult remove(@PathVariable Long[] mIindexs)
    {
        return toAjax(lishiMes1Service.deleteLishiMes1ByMIindexs(mIindexs));
    }
}
