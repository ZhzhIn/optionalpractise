package org.example;/**
 * @author zhzh.yin
 * @create 2020-11-30 18:11
 */

import org.junit.Test;

/**
 * 〈test class 〉
 *
 * @author zhzh.yin
 * @create 2020/11/30
 */
public class TestOptional {
    //NullPointer
    @Test
    public void test1(){
        User user = new User();
        System.out.println(user.getAddress().getCountry().toUpperCase());
    }
    //常规判空
    @Test
    public void test2(){
        User user = new User();
        if(user!=null){
            Address address = user.getAddress();
            if(address!=null){
                String country = address.getCountry();
                System.out.println(country);
            }
        }
    }
}
