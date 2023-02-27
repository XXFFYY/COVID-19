package com.hhxx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Date: 2023/2/26 21:15
 * @Author: XieFeiYu
 * @Email: 32096231@qq.com
 * @Description:
 */

@Controller
public class TuserAction {
    
    /**
     * 跳转页面
     * @param go
     * @return
     */
    @RequestMapping("/go")
    public String go(String go){
        return go;
    }
    
    /**
     * 登录
     * @param username
     * @param password
     * @return
     */
    @RequestMapping("/login")
    public String login(String username,String password){
        
        return "login";
    }
}
