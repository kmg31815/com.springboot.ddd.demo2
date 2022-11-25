package org.example.repository;

import org.example.PointType;
import org.example.common.repository.PointTypeRepository;
import org.example.model.PointTypeEntity;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class PointTypeDBRepository implements PointTypeRepository {

    @Autowired
    private PointTypeJPARepository repository;

    @Override
    public Optional<PointType> findById(UUID id) {
        Optional<PointTypeEntity> pointTypeEntityOptional = repository.findById(id);
        Optional<PointType> pointTypeOptional = Optional.empty();

        if (pointTypeEntityOptional.isPresent()) {
            PointTypeEntity pointTypeEntity = pointTypeEntityOptional.get();
            PointType pointType = new PointType();
            BeanUtils.copyProperties(pointTypeEntity, pointType);
            pointTypeOptional = Optional.ofNullable(pointType);
        }

        return pointTypeOptional;
    }

    @Override
    public UUID save(PointType pointType) {
        PointTypeEntity pointTypeEntity = repository.save(
                new PointTypeEntity(pointType.getType(), pointType.getDescription())
        );

        return pointTypeEntity.getTypeId();
    }

    @Override
    public List<PointType> getAll() {
        List<PointType> types = new ArrayList<>();

        for (PointTypeEntity type : repository.findAll()) {
            PointType pointType = new PointType();
            BeanUtils.copyProperties(type, pointType);
            types.add(pointType);
        }

        return types;
    }
}
