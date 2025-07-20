package br.com.alura.Screenmatch;

import br.com.alura.Screenmatch.Service.ConsumoApi;
import br.com.alura.Screenmatch.Service.ConverterDados;
import br.com.alura.Screenmatch.model.DadosSerie;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args); // Inicia a aplicação Spring Boot
	}

	@Override
	public void run(String... args) throws Exception {
		var consumoApi = new ConsumoApi();

		var json = consumoApi.obterDados("https://www.omdbapi.com/?t=gilmore+girls&&apikey=7f5c3c42");
		//System.out.println(json);

		ConverterDados conversor = new ConverterDados();// Cria uma instância do conversor de dados

		DadosSerie dados = conversor.obterDados(json, DadosSerie.class); // Converte o JSON para o tipo DadosSerie
		System.out.println(dados);
	}
}
