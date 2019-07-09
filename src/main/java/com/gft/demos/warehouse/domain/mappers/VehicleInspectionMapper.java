package com.gft.demos.warehouse.domain.mappers;

import com.gft.demos.warehouse.domain.entities.VehicleInspection;
import com.gft.demos.warehouse.domain.requests.VehicleInspectionRequest;
import com.gft.demos.warehouse.utils.mappers.InnerMapper;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;

@Component
public class VehicleInspectionMapper implements InnerMapper<VehicleInspection, VehicleInspectionRequest> {

    @Override
    public VehicleInspection mapToInner(final VehicleInspectionRequest outer) {
        final VehicleInspection inner = new VehicleInspection();
        inner.setDate(outer.getDate());
        inner.setDescription(outer.getDescription());
        inner.setKilometers(outer.getKilometers());
        inner.setPickupDate(outer.getPickupDate());
        inner.setPrice(outer.getPrice());
        inner.setShortDescription(outer.getShortDescription());
        inner.setVehicleId(outer.getVehicleId());
        return inner;
    }


    public void updateToInner(@NotNull VehicleInspection inner, @NotNull VehicleInspectionRequest outer) {
        inner.setDescription(outer.getDescription());
        inner.setKilometers(outer.getKilometers());
        inner.setPickupDate(outer.getPickupDate());
        inner.setPrice(outer.getPrice());
        inner.setShortDescription(outer.getShortDescription());
        inner.setDate(outer.getDate());
    }
}
