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

}
