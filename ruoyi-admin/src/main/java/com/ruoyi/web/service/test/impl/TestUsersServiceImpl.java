package com.ruoyi.web.service.test.impl;

import java.util.List;

import com.ruoyi.web.mapper.test.TestUsersMapper;
import com.ruoyi.web.pojo.test.TestUsers;
import com.ruoyi.web.service.test.ITestUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 测试用户Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-12-13
 */
@Service
public class TestUsersServiceImpl implements ITestUsersService
{
    @Autowired
    private TestUsersMapper testUsersMapper;

    /**
     * 查询测试用户
     * 
     * @param id 测试用户ID
     * @return 测试用户
     */
    @Override
    public TestUsers selectTestUsersById(Long id)
    {
        return testUsersMapper.selectTestUsersById(id);
    }

    /**
     * 查询测试用户列表
     * 
     * @param testUsers 测试用户
     * @return 测试用户
     */
    @Override
    public List<TestUsers> selectTestUsersList(TestUsers testUsers)
    {
        return testUsersMapper.selectTestUsersList(testUsers);
    }

    /**
     * 新增测试用户
     * 
     * @param testUsers 测试用户
     * @return 结果
     */
    @Override
    public int insertTestUsers(TestUsers testUsers)
    {
        return testUsersMapper.insertTestUsers(testUsers);
    }

    /**
     * 修改测试用户
     * 
     * @param testUsers 测试用户
     * @return 结果
     */
    @Override
    public int updateTestUsers(TestUsers testUsers)
    {
        return testUsersMapper.updateTestUsers(testUsers);
    }

    /**
     * 批量删除测试用户
     * 
     * @param ids 需要删除的测试用户ID
     * @return 结果
     */
    @Override
    public int deleteTestUsersByIds(Long[] ids)
    {
        return testUsersMapper.deleteTestUsersByIds(ids);
    }

    /**
     * 删除测试用户信息
     * 
     * @param id 测试用户ID
     * @return 结果
     */
    @Override
    public int deleteTestUsersById(Long id)
    {
        return testUsersMapper.deleteTestUsersById(id);
    }
}
