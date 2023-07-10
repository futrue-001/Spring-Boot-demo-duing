package com.xj.jasypt.controller;

import com.xj.jasypt.util.JasyptUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JasyptController {

    @Autowired
    private JasyptUtil util;

    @RequestMapping("/encrypt")
    public String JasyptEncrypt(String Msg){
        return util.encrypt(Msg);
    }

    @RequestMapping("/decrypt")
    public String JasyptDecrypt(String enMsg){
        return util.decrypt(enMsg);
    }

}
