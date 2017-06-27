package com.zhheng.nosencebase;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.zhheng.nosencebase.dao.CitiesDao;
import com.zhheng.nosencebase.mapper.CitiesMapper;

@SpringBootApplication
public class NosenceBaseApplication implements CommandLineRunner {

	private final CitiesDao citiesdao;
	private final CitiesMapper citiesmapper;
	
	
	public static void main(String[] args) {
		SpringApplication.run(NosenceBaseApplication.class, args);
	}

	public NosenceBaseApplication(CitiesDao citiesdao, CitiesMapper citiesmapper) {
		this.citiesdao = citiesdao;
		this.citiesmapper = citiesmapper;
	}
	
	@Override
	public void run(String... arg0) throws Exception {
		System.out.println(citiesdao.selectCitiesList().get(0).getName());
	}
}
