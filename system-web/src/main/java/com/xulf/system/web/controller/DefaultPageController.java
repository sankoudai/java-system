package com.xulf.system.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author : sankoudai
 * @version : created at 2016/3/2
 */
@Controller
@RequestMapping("/web/default")
public class DefaultPageController {
    @RequestMapping("/empty")
    public Object emptyPage(){
        return "cookie/empty_page";
    }
}
