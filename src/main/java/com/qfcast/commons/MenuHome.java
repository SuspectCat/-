package com.qfcast.commons;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

@Data
public class MenuHome {
    private HomeInfo homeInfo;
    private LogoInfo logoInfo;
    private Object menuInfo;
}
