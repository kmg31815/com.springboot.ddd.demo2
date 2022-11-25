package org.example.common.service;

import org.example.PointType;
import org.example.common.repository.PointTypeRepository;

import java.util.List;
import java.util.UUID;

public class PointTypeServiceImpl implements PointTypeService {
    private PointTypeRepository repository;

    public PointTypeServiceImpl(PointTypeRepository repository) {
        this.repository = repository;
    }

    @Override
    public UUID createPointType(PointType pointType) {
        return repository.save(pointType);
    }

    @Override
    public List<PointType> allTypes() {
        return repository.getAll();
    }
}
