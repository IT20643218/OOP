package com.example.TestDemo.service;

import com.example.TestDemo.dto.Userdto;
import com.example.TestDemo.entity.User;
import com.example.TestDemo.repo.UserRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.soap.SOAPBinding;
import javax.transaction.Transactional;

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
}
