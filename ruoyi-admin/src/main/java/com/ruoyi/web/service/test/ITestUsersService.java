package com.ruoyi.web.service.test;

import com.ruoyi.web.pojo.test.TestUsers;

import java.util.List;

/**
 * 测试用户Service接口
 * 
 * @author ruoyi
 * @date 2020-12-13
 */
public interface ITestUsersService 
{
    /**
     * 查询测试用户
     * 
     * @param id 测试用户ID
     * @return 测试用户
     */
    public TestUsers selectTestUsersById(Long id);

    /**
     * 查询测试用户列表
     * 
     * @param testUsers 测试用户
     * @return 测试用户集合
     */
    public List<TestUsers> selectTestUsersList(TestUsers testUsers);

    /**
     * 新增测试用户
     * 
     * @param testUsers 测试用户
     * @return 结果
     */
    public int insertTestUsers(TestUsers testUsers);

    /**
     * 修改测试用户
     * 
     * @param testUsers 测试用户
     * @return 结果
     */
    public int updateTestUsers(TestUsers testUsers);

    /**
     * 批量删除测试用户
     * 
     * @param ids 需要删除的测试用户ID
     * @return 结果
     */
    public int deleteTestUsersByIds(Long[] ids);

    /**
     * 删除测试用户信息
     * 
     * @param id 测试用户ID
     * @return 结果
     */
    public int deleteTestUsersById(Long id);
}
