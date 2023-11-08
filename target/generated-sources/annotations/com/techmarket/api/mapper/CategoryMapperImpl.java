package com.techmarket.api.mapper;

import com.techmarket.api.dto.category.CategoryDto;
import com.techmarket.api.form.category.CreateCategoryForm;
import com.techmarket.api.form.category.UpdateCategoryForm;
import com.techmarket.api.model.Category;
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
public class CategoryMapperImpl implements CategoryMapper {

    @Override
    public Category fromCreateCategory(CreateCategoryForm createCategoryForm) {
        if ( createCategoryForm == null ) {
            return null;
        }

        Category category = new Category();

        category.setImage( createCategoryForm.getImage() );
        category.setOrdering( createCategoryForm.getOrdering() );
        category.setKind( createCategoryForm.getKind() );
        category.setName( createCategoryForm.getName() );
        category.setDescription( createCategoryForm.getDescription() );

        return category;
    }

    @Override
    public void mappingForUpdateServiceCategory(UpdateCategoryForm updateServiceCategoryForm, Category category) {
        if ( updateServiceCategoryForm == null ) {
            return;
        }

        category.setImage( updateServiceCategoryForm.getImage() );
        category.setOrdering( updateServiceCategoryForm.getOrdering() );
        category.setName( updateServiceCategoryForm.getName() );
        category.setDescription( updateServiceCategoryForm.getDescription() );
    }

    @Override
    public CategoryDto fromEntityToCategoryDto(Category category) {
        if ( category == null ) {
            return null;
        }

        CategoryDto categoryDto = new CategoryDto();

        categoryDto.setImage( category.getImage() );
        if ( category.getCreatedDate() != null ) {
            categoryDto.setCreatedDate( LocalDateTime.ofInstant( category.getCreatedDate().toInstant(), ZoneId.of( "UTC" ) ) );
        }
        categoryDto.setOrdering( category.getOrdering() );
        categoryDto.setKind( category.getKind() );
        categoryDto.setName( category.getName() );
        if ( category.getModifiedDate() != null ) {
            categoryDto.setModifiedDate( LocalDateTime.ofInstant( category.getModifiedDate().toInstant(), ZoneId.of( "UTC" ) ) );
        }
        categoryDto.setDescription( category.getDescription() );
        categoryDto.setId( category.getId() );
        categoryDto.setStatus( category.getStatus() );

        return categoryDto;
    }

    @Override
    public List<CategoryDto> fromEntityToDtoList(List<Category> categories) {
        if ( categories == null ) {
            return null;
        }

        List<CategoryDto> list = new ArrayList<CategoryDto>( categories.size() );
        for ( Category category : categories ) {
            list.add( fromEntityToCategoryDto( category ) );
        }

        return list;
    }

    @Override
    public CategoryDto fromCategoryToCompleteDto(Category category) {
        if ( category == null ) {
            return null;
        }

        CategoryDto categoryDto = new CategoryDto();

        categoryDto.setImage( category.getImage() );
        categoryDto.setName( category.getName() );
        categoryDto.setDescription( category.getDescription() );
        categoryDto.setId( category.getId() );

        return categoryDto;
    }

    @Override
    public List<CategoryDto> fromCategoryToComplteDtoList(List<Category> categories) {
        if ( categories == null ) {
            return null;
        }

        List<CategoryDto> list = new ArrayList<CategoryDto>( categories.size() );
        for ( Category category : categories ) {
            list.add( fromCategoryToCompleteDto( category ) );
        }

        return list;
    }
}
