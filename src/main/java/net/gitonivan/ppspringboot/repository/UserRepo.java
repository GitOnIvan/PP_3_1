package net.gitonivan.ppspringboot.repository;

import net.gitonivan.ppspringboot.model.User;
import org.springframework.data.repository.Repository;

public interface UserRepo extends Repository<User, Long> {
}
