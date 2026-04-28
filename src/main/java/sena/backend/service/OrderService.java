package sena.backend.service;

import sena.backend.entity.Order;
import sena.backend.repository.OrderRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    private final OrderRepository repo;
    public OrderService(OrderRepository repo) { this.repo = repo; }

    public List<Order> findAll() { return repo.findAll(); }
    public Optional<Order> findById(Long id) { return repo.findById(id); }
    public Order save(Order order) { return repo.save(order); }
    public void delete(Long id) { repo.deleteById(id); }
}