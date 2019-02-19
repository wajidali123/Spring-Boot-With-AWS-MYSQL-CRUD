/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aws.spring.boot.SpringbootAWSDemo.service;

import aws.spring.boot.SpringbootAWSDemo.bean.User;
import aws.spring.boot.SpringbootAWSDemo.repo.Repo;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author wajid
 */
@Service
public class UserService {
    @Autowired
    private Repo repo;
    public List<User> getAllUsers(){
        List<User> list = repo.findAll();
        return list;
    }
    
    public User findOne(int id){
        User user = repo.findOne(id);
        return user;
    }
    
    public User delete(int id){
        User user = repo.findOne(id);
        repo.delete(id);
        return user;
    }
    public List<User> save(User user){
        repo.save(user);
        return repo.findAll();
    }
}
