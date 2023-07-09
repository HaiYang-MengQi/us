package com.experience.tool;

import java.util.Random;

public class Create_Account {
    private  String account;
    public String your_Account(){
        Random random=new Random();
        account=String.valueOf(1000000+random.nextInt(9999999));
        return account;
    }
}
