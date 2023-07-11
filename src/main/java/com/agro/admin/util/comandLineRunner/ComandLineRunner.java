package com.agro.admin.util.comandLineRunner;

import com.agro.admin.models.entity.Marca;
import com.agro.admin.repository.MarcaRepository;
import com.agro.admin.service.IMarcaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ComandLineRunner implements CommandLineRunner {


	@Autowired
	MarcaRepository repository;
	@Override
	public void run(String... args) throws Exception {



		Marca marca = new Marca();marca.setName("AgroInsumos");
		marca.setDescription("destinada al agro");
		repository.save(marca);

		Marca marca1 = new Marca();
		marca1.setName("Semagro");
		marca1.setDescription("destinada al agro");
		repository.save(marca1);

		Marca marca2 = new Marca();
		marca2.setName("Agroempresa");
		marca2.setDescription("destinada al agro");
		repository.save(marca2);

		Marca marca3 = new Marca();
		marca3.setName("Jmanuel");
		marca3.setDescription("destinada al agro");
		repository.save(marca3);



	}
}
