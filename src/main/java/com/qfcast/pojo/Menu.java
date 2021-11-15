package com.qfcast.pojo;

import lombok.Data;

import java.util.Set;

@Data
public class Menu {
    private Integer menuId;
    private Integer parentId;
    private String title;
    private String href;
    private Boolean yesParent;
    private String icon;
    private String target;
    private Integer status;
    private Set<Menu> child; //当前的菜单的孩子
}
