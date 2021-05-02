package com.monologue.pet.model;

public class Login {
    private String username;
    private String password;
    private String enabled;

    @Override
    public String toString() {
        return "login{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", enabled='" + enabled + '\'' +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public String getPwd() {
        return password;
    }

    public String getEnabled() {
        return enabled;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPwd(String password) {
        this.password = password;
    }

    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }
}
