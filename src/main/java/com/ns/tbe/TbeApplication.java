package com.ns.tbe;

import com.ns.tbe.Business.DataLoader;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import javax.xml.crypto.Data;

@SpringBootApplication
public class TbeApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ac = SpringApplication.run(TbeApplication.class, args);
		DataLoader dataLoader= ac.getBean(DataLoader.class);
		dataLoader.saveMember();
		System.exit(0);
	}

}
