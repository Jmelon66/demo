package com.springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import com.springmvc.bean.User;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.springmvc.service.UserService;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/user")
class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("/checkid")
    public String selectUser(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String s  = request.getParameter("id");
        if(s==null){
            s  = "admin";
        }
        User user = this.userService.selectUserbyname(s);
        ObjectMapper mapper = new ObjectMapper();
        response.getWriter().write(mapper.writeValueAsString(user));
        response.getWriter().close();
        return  s;
    }
    @RequestMapping("/select")
    public ModelAndView selectUser() throws Exception {
        ModelAndView mv = new ModelAndView();
//        User user = userService.selectUser(1);
        mv.addObject("user", "223");
        mv.setViewName("user");
        return mv;
    }

}