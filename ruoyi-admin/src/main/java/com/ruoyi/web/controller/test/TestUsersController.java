package com.ruoyi.web.controller.test;

import java.util.List;

import com.ruoyi.web.pojo.test.TestUsers;
import com.ruoyi.web.service.test.ITestUsersService;
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
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 测试用户Controller
 * 
 * @author ruoyi
 * @date 2020-12-13
 */
@RestController
@RequestMapping("/test/users")
public class TestUsersController extends BaseController
{
    @Autowired
    private ITestUsersService testUsersService;

    /**
     * 查询测试用户列表
     */
    @PreAuthorize("@ss.hasPermi('test:users:list')")
    @GetMapping("/list")
    public TableDataInfo list(TestUsers testUsers)
    {
        startPage();
        List<TestUsers> list = testUsersService.selectTestUsersList(testUsers);
        return getDataTable(list);
    }

    /**
     * 导出测试用户列表
     */
    @PreAuthorize("@ss.hasPermi('test:users:export')")
    @Log(title = "测试用户", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(TestUsers testUsers)
    {
        List<TestUsers> list = testUsersService.selectTestUsersList(testUsers);
        ExcelUtil<TestUsers> util = new ExcelUtil<TestUsers>(TestUsers.class);
        return util.exportExcel(list, "users");
    }

    /**
     * 获取测试用户详细信息
     */
    @PreAuthorize("@ss.hasPermi('test:users:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(testUsersService.selectTestUsersById(id));
    }

    /**
     * 新增测试用户
     */
    @PreAuthorize("@ss.hasPermi('test:users:add')")
    @Log(title = "测试用户", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TestUsers testUsers)
    {
        return toAjax(testUsersService.insertTestUsers(testUsers));
    }

    /**
     * 修改测试用户
     */
    @PreAuthorize("@ss.hasPermi('test:users:edit')")
    @Log(title = "测试用户", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TestUsers testUsers)
    {
        return toAjax(testUsersService.updateTestUsers(testUsers));
    }

    /**
     * 删除测试用户
     */
    @PreAuthorize("@ss.hasPermi('test:users:remove')")
    @Log(title = "测试用户", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(testUsersService.deleteTestUsersByIds(ids));
    }
}
