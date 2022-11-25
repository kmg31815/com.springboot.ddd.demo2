package org.example.common.repository;

import org.example.PointType;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PointTypeRepository {
    Optional<PointType> findById(UUID id);

    UUID save(PointType pointType);

    List<PointType> getAll();
}
