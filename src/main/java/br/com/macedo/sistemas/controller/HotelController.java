package br.com.macedo.sistemas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.macedo.sistemas.entities.Hotel;
import br.com.macedo.sistemas.repository.HotelRepository;
import br.com.macedo.sistemas.responses.ResponseModel;

@CrossOrigin(origins  = "http://localhost:4200")
@RestController
@RequestMapping("/service")
public class HotelController {
	
	@Autowired
	private HotelRepository hotelRepository;

	
	//busca os hoteis cadastrados
	@RequestMapping(value="/hotel", method = RequestMethod.GET)
	public @ResponseBody List<Hotel> getHoteis() {
		
		return this.hotelRepository.findAll();
		
	}
	
	@RequestMapping(value="/hotel", method = RequestMethod.POST)
	public @ResponseBody ResponseModel salvar(@RequestBody Hotel hotel){

		try {
			
			this.hotelRepository.save(hotel);
			
			return new ResponseModel(1,"Registro salvo com sucesso!");
			
		}catch(Exception e) {
			
			return new ResponseModel(0,e.getMessage());			
		}
	}
	
	
}
