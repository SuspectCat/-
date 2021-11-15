package com.qfcast.service.impl;

import com.qfcast.commons.HomeInfo;
import com.qfcast.commons.LogoInfo;
import com.qfcast.commons.MenuHome;
import com.qfcast.mapper.MenuMapper;
import com.qfcast.pojo.Menu;
import com.qfcast.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MenuServiceImpl implements MenuService {
    @Autowired
    private MenuMapper menuMapper;
    @Override
    public MenuHome getMenuTreeAll(Integer parentId) {
        List<Menu> treeMenu = menuMapper.findTreeMenu(parentId);
        MenuHome home=new MenuHome();
        HomeInfo homeInfo=new HomeInfo();
        LogoInfo logoInfo=new LogoInfo();
        homeInfo.setHref("page/welcome-1.html?t=1");
        homeInfo.setTitle("首页");
        logoInfo.setHref("");
        logoInfo.setImage("images/logo.png");
        logoInfo.setTitle("MINI LAYUI");
        home.setHomeInfo(homeInfo);
        home.setLogoInfo(logoInfo);
        home.setMenuInfo(treeMenu);
        return home;
    }
}
