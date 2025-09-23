package com.localxezi.arquiteturaspring.montadora.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.localxezi.arquiteturaspring.montadora.CarroStatus;
import com.localxezi.arquiteturaspring.montadora.Chave;
import com.localxezi.arquiteturaspring.montadora.HondaHRV;
import com.localxezi.arquiteturaspring.montadora.Motor;

@RestController
@RequestMapping("/carros")
public class TesteFabricaController {
	
	@Autowired
	private Motor motor;
	
	@PostMapping
	public CarroStatus ligarCarro(@RequestBody Chave chave) {
		var carro = new HondaHRV(motor);
		return carro.darIgnicao(chave);
	}
}