package com.qfcast.mapper;

import com.qfcast.pojo.Menu;

import java.util.List;

public interface MenuMapper {
    List<Menu> findTreeMenu(Integer parentId);
}
