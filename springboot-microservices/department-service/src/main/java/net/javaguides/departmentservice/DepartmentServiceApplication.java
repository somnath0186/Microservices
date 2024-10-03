package net.javaguides.departmentservice;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.extensions.Extension;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import jdk.jfr.Description;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition(

		info = @Info(title = "Department service rest apis",description = "Department service REST api documentation"
		,version = "v1.0", contact = @Contact(name = "somnath ",email = "somnath317@gmail.com",url = "https://www.javabysomnath.com"),
		license  =@License(name = "Apache 2.0",url = "http://www.javabysomnath.com")
		),
		externalDocs = @ExternalDocumentation(description = "Department Service	",
		url = "http://www.javabysomnath.com"
		)


)
@SpringBootApplication
public class DepartmentServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(DepartmentServiceApplication.class, args);
	}

}
