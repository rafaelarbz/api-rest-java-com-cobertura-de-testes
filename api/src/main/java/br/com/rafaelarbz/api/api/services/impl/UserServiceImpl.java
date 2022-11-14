package br.com.rafaelarbz.api.api.services.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rafaelarbz.api.api.domain.User;
import br.com.rafaelarbz.api.api.repositories.UserRepository;
import br.com.rafaelarbz.api.api.services.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public User findById(Integer id) {
        Optional<User> obj = repository.findById(id);
        return obj.orElse(null);
    }
    
}
