package cn.unicom.cz.service.impl;

import cn.unicom.cz.service.TestService;
import org.springframework.stereotype.Service;

/**
 * Created by jxisme on 17/10/22.
 */
@Service
public class TestServiceImpl implements TestService {
    public String test() {
        return "test";
    }

}
