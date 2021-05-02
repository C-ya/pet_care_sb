package com.monologue.pet.mapper;

import com.monologue.pet.model.UserLogin;
import com.monologue.pet.model.Login;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoginMapper {
    String getUsername(Login login);

    UserLogin getUserPwd(Login login);
}
