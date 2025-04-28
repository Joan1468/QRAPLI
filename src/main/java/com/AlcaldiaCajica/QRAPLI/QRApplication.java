package com.AlcaldiaCajica.QRAPLI;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.AlcaldiaCajica.QRAPLI.repository")
@EntityScan(basePackages = "com.AlcaldiaCajica.QRAPLI.model")
@OpenAPIDefinition(info = @Info(
		title = "QRAPLI API - Alcaldía de Cajicá",
		version = "1.0",
		description = "API para gestión de equipos tecnológicos con sistema QR - Conectado a Supabase"
))
public class QRApplication {

	public static void main(String[] args) {
		SpringApplication.run(QRApplication.class, args);
	}

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**")
						.allowedOrigins("*") // En producción, reemplazar con dominios específicos
						.allowedMethods("GET", "POST", "PUT", "DELETE", "PATCH", "OPTIONS")
						.allowedHeaders("*")
						.maxAge(3600);
			}
		};
	}
}