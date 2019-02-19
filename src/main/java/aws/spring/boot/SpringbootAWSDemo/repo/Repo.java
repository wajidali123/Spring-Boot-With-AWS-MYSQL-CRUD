/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aws.spring.boot.SpringbootAWSDemo.repo;

import aws.spring.boot.SpringbootAWSDemo.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author wajid
 */
@Repository
public interface Repo extends JpaRepository<User, Integer>{
    
}
