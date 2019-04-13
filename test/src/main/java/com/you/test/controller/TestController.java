package com.you.test.controller;

import com.you.test.bean.TestBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Yuanzuocheng
 * @date 2019/4/12 17:53
 */
@Controller
public class TestController {
    @ResponseBody
    @RequestMapping("/a")
    public TestBean A(){
        TestBean testBean = new TestBean();
        testBean.setName("dasdsad");
        testBean.setAge(18);
        return testBean;
    }
}
