package br.com.macedo.sistemas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.macedo.sistemas.entities.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, Long>{
	
	List<Hotel> findAll();
	
	Hotel findByCnpj(String cnpj);

}
