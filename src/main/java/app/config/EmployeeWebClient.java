package app.config;

import app.model.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Configuration
public class EmployeeWebClient {

    @Bean
    public WebClient webClient() {
        return WebClient.create("http://localhost:8080");
    }

//    public void consume() {
//
//        Mono<Employee> employeeMono = client.get()
//            .uri("/employees/{id}", "1")
//            .retrieve()
//            .bodyToMono(Employee.class);
//
//        employeeMono.subscribe(System.out::println);
//
//        Flux<Employee> employeeFlux = client.get()
//            .uri("/employees")
//            .retrieve()
//            .bodyToFlux(Employee.class);
//
//        employeeFlux.subscribe(System.out::println);
//    }
}
