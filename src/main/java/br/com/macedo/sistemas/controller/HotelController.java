package br.com.macedo.sistemas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.macedo.sistemas.entities.Hotel;
import br.com.macedo.sistemas.repository.HotelRepository;

@RestController
@RequestMapping("/api/hotel")
public class HotelController {
	
	@Autowired
	private HotelRepository hotelRepository;

	
	@GetMapping("/")
	public List<Hotel> buscaHoteis() {
		
		return hotelRepository.findAll();
		
	}
	
	@GetMapping(value = "/{nome}")
	public String exemplo(@PathVariable("nome") String nome) {
		return "Oi Meu Chapa" + nome;
	}
	
	
	
}
