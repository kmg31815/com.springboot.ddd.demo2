package org.example.repository;

import org.example.model.PointTypeEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * @SpringBootTest 會啟用 JPA (console 可看到 HikariPool)
 * <p>
 * HikariPool 是一個開源數據庫連接池管理工具
 */
@SpringBootTest
public class PointTypeJPARepositoryTest {
    @Autowired
    private PointTypeJPARepository repository;

    @Test
    void repositoryShouldNotBeNull() {
        assertNotNull(repository);
    }

    @Test
    void savePointTypeAndCheck() {
        PointTypeEntity pointType = repository.save(new PointTypeEntity("JAVA", "JAVA Web"));
        System.out.println("TypeId: " + pointType.getTypeId());
        assertThat(repository.findById(pointType.getTypeId())).isNotNull();
    }
}
