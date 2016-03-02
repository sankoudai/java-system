package com.xulf.system.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by xuliufeng on 2016/1/14.
 */
@RequestMapping("/web/cookie")
@Controller
public class CookieController {
    @RequestMapping("/set")
    public Object setCookie(HttpServletRequest request, HttpServletResponse response){
        Cookie cookie = new Cookie("testerCookie", "abc");
        response.addCookie(cookie);
        return "cookie/getter";
    }

    /**
     * 测试设置cookie之后， 重定向
     * 测试结果:（可以做到）
     * @param request
     * @param response
     * @return
     */
    @RequestMapping("/set/redirect")
    public Object setCookieAndRedirect(HttpServletRequest request, HttpServletResponse response){
        Cookie cookie = new Cookie("setRedirectCookie", "abc");
        response.addCookie(cookie);
        return "redirect:/web/default/empty";
    }
}
