package com.atxzl.mc.acl.controller;

import com.atxzl.mc.common.result.Result;
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
        return Result.ok(null);
    }
    //2 getInfo

    //3 logout
}
