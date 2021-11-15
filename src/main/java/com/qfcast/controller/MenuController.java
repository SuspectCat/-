package com.qfcast.controller;

import com.qfcast.commons.MenuHome;
import com.qfcast.pojo.Menu;
import com.qfcast.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin //允许跨域访问
public class MenuController {
    @Autowired
    private MenuService menuService;
    @RequestMapping("/menu/tree")
    public MenuHome loadMenuTree(int parentId){
        return menuService.getMenuTreeAll(parentId);
    }
}
