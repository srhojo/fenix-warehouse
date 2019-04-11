package com.hojo.fenix.warehouse.domain.mappers;

import com.hojo.fenix.warehouse.domain.cdm.Quantity;
import com.hojo.fenix.warehouse.domain.cdm.enums.UnitiesEnum;
import com.hojo.fenix.warehouse.domain.entities.QuantityEmbeddableEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class QuantityMapperTest {

    @InjectMocks
    private QuantityMapper quantityMapper;

    @Test
    public void mapToInner() {
        //Given
        Quantity outer = new Quantity();
        outer.setUnities(UnitiesEnum.KILOGRAMS);
        outer.setValue(234f);
        //When
        QuantityEmbeddableEntity inner = quantityMapper.mapToInner(outer);

        //Then
        assertEquals(outer.getUnities(),inner.getUnities());
        assertEquals(outer.getValue(),inner.getValue());
    }
}