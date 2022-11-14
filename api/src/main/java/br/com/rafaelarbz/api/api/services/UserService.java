package br.com.rafaelarbz.api.api.services;

import br.com.rafaelarbz.api.api.domain.User;

public interface UserService {
    
    User findById(Integer id);
}
