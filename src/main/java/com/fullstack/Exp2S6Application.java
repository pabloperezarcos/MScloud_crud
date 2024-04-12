package com.fullstack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication; // marca la clase principal de la aplicación Spring Boot
import org.springframework.context.annotation.ComponentScan; // especifica los paquetes a escanear en busca de componentes de Spring

@SpringBootApplication
// Usamos la herramienta para que busque en los directorios "CasoA" y "CasoB" para poder trabajar con ambos casos con nuestro archivo main.
@ComponentScan(basePackages = {"com.fullstack.CasoA", "com.fullstack.CasoB"})
public class Exp2S6Application {

	public static void main(String[] args) { // Método principal que inicia la aplicación
		SpringApplication.run(Exp2S6Application.class, args); // Método para iniciar la aplicación Spring Boot
	}

}
