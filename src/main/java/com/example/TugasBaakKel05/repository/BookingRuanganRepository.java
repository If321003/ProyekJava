package com.example.TugasBaakKel05.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.TugasBaakKel05.model.BookingRuangan;


@Repository
public interface BookingRuanganRepository extends JpaRepository<BookingRuangan, Long> {
	List<BookingRuangan> findByUserId(Long userId);
}
