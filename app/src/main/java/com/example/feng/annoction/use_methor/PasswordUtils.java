package com.example.feng.annoction.use_methor;

import java.lang.reflect.Method;

public class PasswordUtils {
    @UseCase(id = "54", description = "Passwords must contain at least one numeric")
    public boolean validatePassword(String password) {
        return (password.matches("\\w*\\d\\w*"));
    }

    @UseCase(id = "55")
    public  String encryptPassword(String password) {
        return new StringBuilder(password).reverse().toString();
    }

    public static void main(String[] args) {
        //获取方法上注入的值
        try {
            Method method = PasswordUtils.class.getDeclaredMethod("validatePassword", String.class);
            UseCase useCase = method.getAnnotation(UseCase.class);
            System.out.println(useCase.id());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        //获取所有方法的注入值
//        Method[] methods = PasswordUtils.class.getMethods();
//        for(Method method : methods){
//            if(method.isAnnotationPresent(UseCase.class)){
//                UseCase name = method.getAnnotation(UseCase.class);
//                System.out.println("firstName:" + name.id());
//            }
//        }
    }


}