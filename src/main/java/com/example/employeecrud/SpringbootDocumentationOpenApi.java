package com.example.employeecrud;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "Employee CRUD API",
				version = "1.0",
				description = "This API allows you to perform CRUD operations on employee data.",
				contact = @Contact(
						name = "Pavan Uppuluri",
						email = "pavanuppu2016@gmail.com",
						url = "https://www.example.com"
				),
				license = @License(
						name = "MIT License",
						url = "https://opensource.org/licenses/MIT"
				)
		),
		tags = {
				@Tag(name = "Employee", description = "Operations related to employees"),
				@Tag(name = "CRUD", description = "Create, Read, Update, and Delete employee data")
		}
)
public class SpringbootDocumentationOpenApi {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDocumentationOpenApi.class, args);
	}

}
