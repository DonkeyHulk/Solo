package com.zgw.blog.service;

import com.zgw.blog.entity.Menu;

import java.util.List;

/**
 * Created by Zhaogw&Lss on 2019/4/24.
 */
public interface MenuService {
    /**
     * 获得菜单列表
     *
     * @return 列表
     */
    List<Menu> listMenu();


    /**
     * 添加菜单项目
     *
     * @param menu 菜单
     */
    Menu insertMenu(Menu menu) ;


    /**
     * 删除菜单项目
     *
     * @param id 菜单ID
     */
    void deleteMenu(Integer id) ;


    /**
     * 根据id获得菜单项目信息
     *
     * @param id 菜单ID
     * @return 菜单
     */

    Menu getMenuById(Integer id);

    /**
     * 更新菜单项目
     *
     * @param menu 菜单
     */
    void updateMenu(Menu menu);



}
