package br.com.macedo.sistemas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.macedo.sistemas.entities.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, Long>{
	
	Hotel findByCnpj(String cnpj);

}
