package com.munamu.munamuinventory.inventory;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class InventoryMsApplication {

	public static void main(String[] args) {
		Dotenv dotenv = Dotenv.configure().directory("./").filename(".env").load();

		dotenv.entries().forEach(entry -> System.setProperty(entry.getKey(), entry.getValue()));

		SpringApplication.run(InventoryMsApplication.class, args);
	}

}
