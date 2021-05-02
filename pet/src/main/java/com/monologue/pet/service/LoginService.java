package com.monologue.pet.service;

import com.alibaba.fastjson.JSONObject;
import com.monologue.pet.mapper.LoginMapper;
import com.monologue.pet.model.Login;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class LoginService {
    @Resource
    private LoginMapper loginMapper;

    public String loginPet(Login login){
        JSONObject jsonObject=new JSONObject();
        if(login.getEnabled().equals("1")){
            if(loginMapper.getUsername(login)!=null){
                if(loginMapper.getUserPwd(login)!=null){
                    jsonObject.put("res",0);
                    jsonObject.put("msg","登录成功");
                }
                else{
                    jsonObject.put("res",2);
                    jsonObject.put("msg","密码错误");
                }
            }
            else{
                jsonObject.put("res",1);
                jsonObject.put("msg","用户名不存在");
            }
        }
        else{

                jsonObject.put("res",1);
                jsonObject.put("msg","用户名不存在");
        }
        return jsonObject.toJSONString();
    }
}
