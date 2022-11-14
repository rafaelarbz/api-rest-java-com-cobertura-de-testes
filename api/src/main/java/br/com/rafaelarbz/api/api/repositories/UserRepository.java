package br.com.rafaelarbz.api.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.rafaelarbz.api.api.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    
}
