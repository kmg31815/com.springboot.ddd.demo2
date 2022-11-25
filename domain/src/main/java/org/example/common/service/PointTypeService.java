package org.example.common.service;

import org.example.PointType;

import java.util.List;
import java.util.UUID;

public interface PointTypeService {
    UUID createPointType(PointType pointType);

    List<PointType> allTypes();
}
