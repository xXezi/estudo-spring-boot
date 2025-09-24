package com.localxezi.arquiteturaspring.montadora.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.localxezi.arquiteturaspring.montadora.Motor;
import com.localxezi.arquiteturaspring.montadora.TipoMotor;

@Configuration
public class MontadoraConfiguration {
	
	@Bean(name = "motorAspirado")
	Motor motorAspirado() {
		var motor = new Motor();
		motor.setCavalos(120);
		motor.setCilindros(4);
		motor.setModelo("XPTO-0");
		motor.setLitragem(2.0);
		motor.setTipo(TipoMotor.ASPIRADO);
		return motor;
	}
	
	@Bean(name = "motorEletrico")
	Motor motorEletrico() {
		var motor = new Motor();
		motor.setCavalos(110);
		motor.setCilindros(3);
		motor.setModelo("TH-40");
		motor.setLitragem(1.4);
		motor.setTipo(TipoMotor.ELETRICO);
		return motor;
	}
	
	@Bean(name = "motorTurbo")
	Motor motorTurbo() {
		var motor = new Motor();
		motor.setCavalos(180);
		motor.setCilindros(4);
		motor.setModelo("XPTO-0");
		motor.setLitragem(1.5);
		motor.setTipo(TipoMotor.TURBO);
		return motor;
	}
}