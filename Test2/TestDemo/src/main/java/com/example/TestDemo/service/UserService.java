package com.example.TestDemo.service;

import com.example.TestDemo.dto.Userdto;
import com.example.TestDemo.entity.User;
import com.example.TestDemo.repo.UserRepo;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.soap.SOAPBinding;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserService {
    @Autowired
    private UserRepo userRepo;
    @Autowired
    private ModelMapper modelMapper;

    public Userdto SaveUser(Userdto userdto){
        userRepo.save(modelMapper.map(userdto, User.class));
        return userdto;
    }

    public List<Userdto> getAllUsers(){
        List<User>userList=userRepo.findAll();
        return modelMapper.map(userList,new TypeToken<List<Userdto>>(){}.getType());
    }

    public Userdto updateUser(Userdto userdto){
        userRepo.save(modelMapper.map(userdto,User.class));
        return userdto;
    }

    public boolean deleteUser(Userdto userdto){
        userRepo.delete(modelMapper.map(userdto,User.class));
        return true;
    }

    //custom quary
    //User id > User  Details
    //select * from user whers id = 1
    public Userdto getUserid(String UserId){
       User user = userRepo.getUserid(UserId);
       return modelMapper.map(user,Userdto.class);
    }

    //User id ,address > User Details
    //select * from user where id= 2 and address ="Galgamuwa"
    public Userdto getUseridAndaddress(String UserId,String address){
        User user = userRepo.getUseridAndaddress(UserId,address);
        return modelMapper.map(user,Userdto.class);
    }

}
