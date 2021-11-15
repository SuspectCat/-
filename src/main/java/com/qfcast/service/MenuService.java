package com.qfcast.service;

import com.qfcast.commons.MenuHome;
import com.qfcast.pojo.Menu;

import java.util.List;

public interface MenuService {
    MenuHome getMenuTreeAll(Integer parentId);
}
