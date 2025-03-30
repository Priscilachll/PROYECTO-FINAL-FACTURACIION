package com.proyecto2.API.Rest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LineaDeVentaRepository extends JpaRepository<LineaDeVenta, Long> {
}