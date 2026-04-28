package sena.backend.service;

import sena.backend.entity.User;
import sena.backend.repository.UserRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository repo;
    public UserService(UserRepository repo) { this.repo = repo; }

    public List<User> findAll() { return repo.findAll(); }
    public Optional<User> findById(Long id) { return repo.findById(id); }
    public User save(User user) { return repo.save(user); }
    public void delete(Long id) { repo.deleteById(id); }
}