/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aws.spring.boot.SpringbootAWSDemo.controller;
import aws.spring.boot.SpringbootAWSDemo.bean.User;
import aws.spring.boot.SpringbootAWSDemo.service.UserService;
import java.util.ArrayList;
import java.util.List;
import javax.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
/**
 *
 * @author wajid
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/all")
    public List<User> getall(){
        List<User> list = new ArrayList<>();
        list =  userService.getAllUsers();
        return list;
    }
    
    @RequestMapping(value="/save", method=RequestMethod.POST)
    public void save(@RequestBody User user){
        userService.save(user);
    }
    @RequestMapping(value="/delete/{id}")
    public void delete(@PathVariable int id){
        userService.delete(id);
    }
    
    @RequestMapping(value="/update/{id}",method = RequestMethod.POST)
    public User update(@RequestBody User user, @PathVariable int id){
        User updated = new User();
        try{
        updated = userService.findOne(id);
        if(updated!=null && id != updated.getId()){
//            updated.setId(id);
//            updated.setFname(user.getFname());
//            updated.setLname(user.getLname());
//            updated.setDept(user.getDept());
//            updated.setDegree(user.getDegree());
//            updated.setInstitute(user.getInstitute());
            userService.save(user);
        }
        else{
            updated.setId(id);
            updated.setFname(user.getFname());
            updated.setLname(user.getLname());
            updated.setDept(user.getDept());
            updated.setDegree(user.getDegree());
            updated.setInstitute(user.getInstitute());
            userService.save(updated);
        }
        }
        catch(Exception e){
            System.out.println("Can not find User with this ID!!!");
        }
        return updated;
    }
}
