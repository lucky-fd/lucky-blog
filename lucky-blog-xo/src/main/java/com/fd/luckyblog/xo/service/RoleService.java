package com.fd.luckyblog.xo.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.fd.luckyblog.commons.entity.Role;
import com.fd.luckyblog.xo.vo.RoleVO;
import com.fd.luckyblog.base.service.SuperService;

/**
 * 角色表 服务类
 *
 * @author 陌溪
 * @date 2018-09-04
 */
public interface RoleService extends SuperService<Role> {

    /**
     * 获取角色列表
     *
     * @param roleVO
     * @return
     */
    public IPage<Role> getPageList(RoleVO roleVO);

    /**
     * 新增角色
     *
     * @param roleVO
     */
    public String addRole(RoleVO roleVO);

    /**
     * 编辑角色
     *
     * @param roleVO
     */
    public String editRole(RoleVO roleVO);

    /**
     * 删除角色
     *
     * @param roleVO
     */
    public String deleteRole(RoleVO roleVO);

}
