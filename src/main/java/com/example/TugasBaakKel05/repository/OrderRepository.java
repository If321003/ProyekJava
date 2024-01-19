package com.example.TugasBaakKel05.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.TugasBaakKel05.model.Order;
import com.example.TugasBaakKel05.model.Surat;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
	List<Order> findByUserId(Long userId);
}
