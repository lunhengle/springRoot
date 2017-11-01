package com.lhl.springRoot;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * helloWorld.
 * Created by lunhengle on 2017/7/10.
 */
@RestController
@EnableAutoConfiguration
public class HelloWorld {
    /**
     * 测试首页.
     *
     * @return 首页测试数据
     */
    @RequestMapping("/")
    String home() {
        return "hello world!";
    }

    /**
     * 测试带参数链接.
     *
     * @param myName 名字
     * @return 带参数链接
     */
    @RequestMapping("/home/{myName}")
    String index(@PathVariable String myName) {
        return "hello " + myName + "!!!";
    }

    /**
     * 测试session共享.
     *
     * @param request  请求
     * @param response 回应
     * @param age      年龄
     * @return session 共享数据
     */
    @RequestMapping("/tsession/{age}")
    @ResponseBody
    public String testSession(HttpServletRequest request, HttpServletResponse response, @PathVariable String age) {
        request.getSession().setAttribute("age", age);
        String a = (String) request.getSession().getAttribute("age");
        return a;
    }
}
