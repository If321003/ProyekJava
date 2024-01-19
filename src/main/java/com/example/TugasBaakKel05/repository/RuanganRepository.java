package com.example.TugasBaakKel05.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.TugasBaakKel05.model.Ruangan;

@Repository
public interface RuanganRepository extends JpaRepository<Ruangan, Long> {
    List<Ruangan> findByNamaRuanganContaining(String namaRuangan);
}

