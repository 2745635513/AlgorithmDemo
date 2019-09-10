package com.frace.cn.sudden_whimsy;

import javax.security.auth.AuthPermission;
import javax.security.auth.Subject;
import java.security.Permission;
import java.security.PermissionCollection;
import java.security.Policy;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by frace on 2019/9/6 15:57
 */
public class StudySubject {


    public static void main(String[] args) {
        Subject subject=new Subject();
        //建具有指定名称的新AuthPermission。该名称是AuthPermission的符号名称。
        AuthPermission authPermission = new AuthPermission("frace");
//        Permission permission= AuthPermission.class.getField("setPolicy");
//        SecurityManager.checkPermission(permission);
//        PermissionCollection perms = policy.getPermissions(policy);
//        System.out.println("policy :"+Policy.setPolicy());

        subject.setReadOnly();
        try {
            subject.setReadOnly();
        }catch (SecurityException e){
            System.out.println(e.toString());
        }
        List<String> list = new ArrayList<>();

        System.out.println(subject.isReadOnly());
        System.out.println(subject.getPrincipals());
    }
}
