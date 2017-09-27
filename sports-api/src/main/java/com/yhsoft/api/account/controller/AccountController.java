package com.yhsoft.api.account.controller;

import com.yhsoft.api.account.service.AccountService;
import com.yhsoft.api.util.CommonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/account")
public class AccountController {
   /* @Autowired
    private AccountService accountService;*/

    //简单的后台接口，用于测试
    @RequestMapping("/info")
    public Object info(){
        Map<String,Object> map = new HashMap<>();
        map.put("info","hello hello hello");
        return map;
    }
   /* *//**
     * 通过spring data jpa 调用方法 api :localhost:8099/users/byname?username=xxx
     *
     * @param request
     * @return
     *//*
    @RequestMapping(value = "/byname", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<Object> getUser(HttpServletRequest request) {
        Map<String, Object> map = CommonUtil.getParameterMap(request);
        String username = (String) map.get("username");
        return new ResponseEntity<>(accountService.getUserByName(username), HttpStatus.OK);
    }*/
}
