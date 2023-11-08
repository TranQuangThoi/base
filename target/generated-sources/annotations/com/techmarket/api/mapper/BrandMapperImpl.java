package com.techmarket.api.mapper;

import com.techmarket.api.dto.brand.BrandDto;
import com.techmarket.api.form.brand.CreateBrandForm;
import com.techmarket.api.form.brand.UpdateBrandForm;
import com.techmarket.api.model.Brand;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-09T00:11:52+0700",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 20.0.2 (Oracle Corporation)"
)
@Component
public class BrandMapperImpl implements BrandMapper {

    @Override
    public Brand fromCreateBrandToEntity(CreateBrandForm createBrandForm) {
        if ( createBrandForm == null ) {
            return null;
        }

        Brand brand = new Brand();

        brand.setImage( createBrandForm.getImage() );
        brand.setName( createBrandForm.getName() );
        if ( createBrandForm.getStatus() != null ) {
            brand.setStatus( createBrandForm.getStatus() );
        }

        return brand;
    }

    @Override
    public BrandDto fromEntityToBrandDto(Brand brand) {
        if ( brand == null ) {
            return null;
        }

        BrandDto brandDto = new BrandDto();

        if ( brand.getModifiedDate() != null ) {
            brandDto.setModifiedDate( LocalDateTime.ofInstant( brand.getModifiedDate().toInstant(), ZoneId.of( "UTC" ) ) );
        }
        brandDto.setName( brand.getName() );
        brandDto.setImage( brand.getImage() );
        if ( brand.getCreatedDate() != null ) {
            brandDto.setCreatedDate( LocalDateTime.ofInstant( brand.getCreatedDate().toInstant(), ZoneId.of( "UTC" ) ) );
        }
        brandDto.setId( brand.getId() );
        brandDto.setStatus( brand.getStatus() );

        return brandDto;
    }

    @Override
    public List<BrandDto> fromEntityToListBrandDto(List<Brand> brands) {
        if ( brands == null ) {
            return null;
        }

        List<BrandDto> list = new ArrayList<BrandDto>( brands.size() );
        for ( Brand brand : brands ) {
            list.add( fromEntityToBrandDto( brand ) );
        }

        return list;
    }

    @Override
    public BrandDto fromEntityToBrandDtoAuto(Brand brand) {
        if ( brand == null ) {
            return null;
        }

        BrandDto brandDto = new BrandDto();

        brandDto.setName( brand.getName() );
        brandDto.setImage( brand.getImage() );
        brandDto.setId( brand.getId() );

        return brandDto;
    }

    @Override
    public List<BrandDto> fromEntityToListBrandDtoAuto(List<Brand> brands) {
        if ( brands == null ) {
            return null;
        }

        List<BrandDto> list = new ArrayList<BrandDto>( brands.size() );
        for ( Brand brand : brands ) {
            list.add( fromEntityToBrandDtoAuto( brand ) );
        }

        return list;
    }

    @Override
    public void fromUpdateToEntityBrand(UpdateBrandForm updateBrandForm, Brand brand) {
        if ( updateBrandForm == null ) {
            return;
        }

        brand.setName( updateBrandForm.getName() );
        brand.setImage( updateBrandForm.getImage() );
        brand.setStatus( updateBrandForm.getStatus() );
        brand.setId( updateBrandForm.getId() );
    }
}
