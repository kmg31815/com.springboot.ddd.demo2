package org.example.config;

import org.example.common.repository.PointTypeRepository;
import org.example.common.service.PointTypeService;
import org.example.common.service.PointTypeServiceImpl;
import org.example.repository.PointTypeDBRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    PointTypeRepository pointTypeRepository() {
//        return new PointTypeMemRepository();
        return new PointTypeDBRepository();
    }

    @Bean
    PointTypeService pointTypeService(PointTypeRepository repository) {
        return new PointTypeServiceImpl(repository);
    }

}
