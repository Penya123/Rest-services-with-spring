package com.jorge.Payroll;

import com.jorge.Payroll.Entiy.Employee;
import com.jorge.Payroll.Respository.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDateBase {
    private static final Logger log = LoggerFactory.getLogger(LoadDateBase.class);

    @Bean
    CommandLineRunner initDateBase(EmployeeRepository repository){
        return args -> {
            log.info("Preloading " + repository.save(new Employee("Andrea Mejía", "CEO")));
            log.info("Preloading " + repository.save(new Employee("Andy Carrillo", "coFounder")));
        };
    }
}
