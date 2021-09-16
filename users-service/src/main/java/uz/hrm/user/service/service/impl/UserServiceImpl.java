package uz.hrm.user.service.service.impl;

import org.springframework.stereotype.Service;
import uz.hrm.user.service.mapper.UserMapper;
import uz.hrm.user.service.repository.UserRepository;
import uz.hrm.user.service.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    public UserServiceImpl(UserRepository repository, UserMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    private UserRepository repository;
    private UserMapper mapper;



}
