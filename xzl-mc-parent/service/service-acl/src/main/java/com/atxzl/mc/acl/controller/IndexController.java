package com.atxzl.mc.acl.controller;

import com.atxzl.mc.common.result.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


@RestController
@RequestMapping("/admin/acl/index/")
public class IndexController {
    //1 login
    @PostMapping("login")
    public Result login(){
        Map<String,String> map = new HashMap<>();
        map.put("token","token-admin");
        return Result.ok(map);
    }
    //2 getInfo
    @GetMapping("info")
    public Result info(){
        Map<String,String> map = new HashMap<>();
        map.put("name","xzl");
        map.put("avatar","https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif");
        return Result.ok(map);
    }
    //3 logout
    @PostMapping("logout")
    public Result logout(){
        return Result.ok(null);
    }
}
