package com.xj.jasypt.util;

import org.jasypt.util.text.BasicTextEncryptor;
import org.springframework.stereotype.Component;

@Component
public class JasyptUtil {

    private BasicTextEncryptor encryptor;
    public JasyptUtil(){
        encryptor = new BasicTextEncryptor();
        encryptor.setPassword("123");//设置加密盐值
    }

    /**
     *  jasypt 的加密方法
     * @param msg 需要加密的信息
     * @return 加密后的字符串
     */
    public String encrypt(String msg){
        return encryptor.encrypt(msg);
    }

    /**
     * jasypt 的解密方法
     * @param encryptMsg 加密后的字符串
     * @return 解密后的数据
     */
    public String decrypt(String encryptMsg){
        return encryptor.decrypt(encryptMsg);
    }


}
