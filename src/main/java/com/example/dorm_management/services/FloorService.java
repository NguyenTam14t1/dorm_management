package com.example.dorm_management.services;

import com.example.dorm_management.entities.Floor;

import java.util.List;

public interface FloorService  {

    List<Floor> findFloorsByAreaId(Integer areaId);
}
