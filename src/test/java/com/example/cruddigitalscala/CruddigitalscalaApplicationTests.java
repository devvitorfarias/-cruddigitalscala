package com.example.cruddigitalscala;

import com.example.cruddigitalscala.model.Product;
import com.example.cruddigitalscala.repository.ProductRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class CruddigitalscalaApplicationTests {

	@Autowired
	private TestRestTemplate restTemplate;

	@Autowired
	private ProductRepository productRepository;

	@BeforeEach
	void setUp() {
		productRepository.deleteAll(); // Limpa os dados antes dos testes
	}

	@Test
	void testCreateProduct() {
		Product product = new Product();
		product.setName("Produto Teste");
		product.setPrice(100.0);
		product.setDescription("Descrição Teste");

		ResponseEntity<Product> response = restTemplate.postForEntity("/api/productos", product, Product.class);

		assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
		assertThat(response.getBody()).isNotNull();
		assertThat(response.getBody().getName()).isEqualTo("Produto Teste");
	}

	@Test
	void testGetAllProducts() {
		Product product = new Product();
		product.setName("Produto 1");
		product.setPrice(50.0);
		product.setDescription("Teste");

		productRepository.save(product); // Adiciona um produto no banco

		ResponseEntity<Product[]> response = restTemplate.getForEntity("/api/productos", Product[].class);

		assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
		assertThat(response.getBody()).hasSize(1);
	}
}
