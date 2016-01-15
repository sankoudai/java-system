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
public class CookieTesterController {
    @RequestMapping("/set")
    public Object setCookie(HttpServletRequest request, HttpServletResponse response){
        Cookie cookie = new Cookie("testerCookie", "abc");
        response.addCookie(cookie);
        return "cookie/getter";
    }
}
