package com.monologue.pet.model;

public class User {
    private Integer id;

    private String username;

    private String password;

    private String userTel;

    private String userEmail;

    private String userFace;

    private String userGen;

    private String userAge;

    private String userBirth;

    private String userAdd;

    private String name;

    private  Boolean enabled;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getUserFace() {
        return userFace;
    }

    public void setUserFace(String userFace) {
        this.userFace = userFace == null ? null : userFace.trim();
    }

    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel == null ? null : userTel.trim();
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    public String getUserGen() {
        return userGen;
    }
    public void setUserGen(String userGen) {
        this.userGen = userGen == null ? null : userGen.trim();
    }

    public String getUserAge() {
        return userAge;
    }
    public void setUserAge(String userAge) {
        this.userAge = userAge;
    }

    public String getUserBirth() {
        return userBirth;
    }
    public void setUserBirth(String userBirth) {
        this.userBirth = userBirth == null ? null : userBirth.trim();
    }

    public String getUserAdd() {
        return userAdd;
    }
    public void setUserAdd(String userAdd) {
        this.userAdd = userAdd == null ? null : userAdd.trim();
    }

    public String getRealName() {
        return name;
    }

    public boolean getEnabled() {
        return enabled;
    }
//    public void setEnabled(Boolean enabled) {
//        this.enabled = enabled;
//    }
}
