package com.lw.nacos.client.controller;

import com.lw.nacos.client.feign.NacosServerFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
@RestController
@RequestMapping("/clients")
public class UserClientController {
    @Autowired
    RestTemplate restTemplate;
    /*@Autowired
    NacosServerFeign nacosServerFeign;*/
    @GetMapping("/{username}")
    public String getInfoByUsername(@PathVariable String username){

       return  restTemplate.getForObject("http://nacos-demo-server/servers/userInfo/"+username,String.class);
      /* return  nacosServerFeign.getInfoByUsername(username);*/
    }
    @GetMapping
    public String test(){
        return "hello";
    }


}
