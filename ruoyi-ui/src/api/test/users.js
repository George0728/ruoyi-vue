import request from '@/utils/request'

// 查询测试用户列表
export function listUsers(query) {
  return request({
    url: '/test/users/list',
    method: 'get',
    params: query
  })
}

// 查询测试用户详细
export function getUsers(id) {
  return request({
    url: '/test/users/' + id,
    method: 'get'
  })
}

// 新增测试用户
export function addUsers(data) {
  return request({
    url: '/test/users',
    method: 'post',
    data: data
  })
}

// 修改测试用户
export function updateUsers(data) {
  return request({
    url: '/test/users',
    method: 'put',
    data: data
  })
}

// 删除测试用户
export function delUsers(id) {
  return request({
    url: '/test/users/' + id,
    method: 'delete'
  })
}

// 导出测试用户
export function exportUsers(query) {
  return request({
    url: '/test/users/export',
    method: 'get',
    params: query
  })
}