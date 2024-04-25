package com.onboarding.onboardingAPI;

import com.onboarding.onboardingAPI.module.client.entity.ClientEntity;
import com.onboarding.onboardingAPI.module.client.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OnboardingApiApplication implements CommandLineRunner {

	@Autowired
	public ClientRepository clientRepository;

	public static void main(String[] args) {

		SpringApplication.run(OnboardingApiApplication.class, args);
		System.out.println("onBoarding");

	}

	@Override
	public void run(String... args) throws Exception {

		ClientEntity clientTest = new ClientEntity();


		/*clientTest.setIdUsuario("12");
		clientTest.setNombre("David Javier");
		clientTest.setApellidoPaterno("Gonzalez");
		clientTest.setApellidoMaterno("Xicotencatl");
		clientTest.setEdad("32");
		clientTest.setTelefono("5521320331");
		clientTest.setEmail("david.gonzalez@boldmoves.mx");
		clientTest.setCalle("10ma jose clemente orozco");
		clientTest.setNumeroInterior("21");
		clientTest.setNumeroExterior("100");
		clientTest.setEstado("Ciudad de Mexico");
		clientTest.setMunicipio("Iztapalapa");
		clientTest.setCiudad("Iztapalapa");
		clientTest.setColonia("Iztapalapa");
		clientTest.setCodigo_postal("09970");
		clientTest.setLinkDireccion("asdasdasadasdasdas");
		clientTest.setMontoCredito("10000");
		clientTest.setTazaCredito("15");
		clientTest.setMesesCredito("36");

		System.out.println(clientTest);

		clientRepository.save(clientTest);*/


	}
}
