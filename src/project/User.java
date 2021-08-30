/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 * Class used to store current user data
 * @author Aditya Upadhye
 */
public class User {    
    
    static int id;
    static String username;
    static String password;
    static String name;
    
    static void initialize(int id, String username, String password, String name){
        User.id=id;
        User.username=username;
        User.password=password;
        User.name=name;
    }
    
}
