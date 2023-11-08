package com.techmarket.api.mapper;

import com.techmarket.api.dto.product.ProductDto;
import com.techmarket.api.form.product.CreateProductForm;
import com.techmarket.api.form.product.UpdateProductForm;
import com.techmarket.api.model.Product;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-09T00:11:52+0700",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 20.0.2 (Oracle Corporation)"
)
@Component
public class ProductMapperImpl implements ProductMapper {

    @Autowired
    private CategoryMapper categoryMapper;
    @Autowired
    private BrandMapper brandMapper;

    @Override
    public Product fromCreateProductToEntity(CreateProductForm createProductForm) {
        if ( createProductForm == null ) {
            return null;
        }

        Product product = new Product();

        product.setImage( createProductForm.getImage() );
        product.setDescription( createProductForm.getDescription() );
        product.setPrice( createProductForm.getPrice() );
        product.setName( createProductForm.getName() );
        product.setSaleOff( createProductForm.getSaleOff() );
        if ( createProductForm.getStatus() != null ) {
            product.setStatus( createProductForm.getStatus() );
        }

        return product;
    }

    @Override
    public ProductDto fromEntityToProductDto(Product product) {
        if ( product == null ) {
            return null;
        }

        ProductDto productDto = new ProductDto();

        productDto.setImage( product.getImage() );
        productDto.setBrandDto( brandMapper.fromEntityToBrandDtoAuto( product.getBrand() ) );
        productDto.setDescription( product.getDescription() );
        productDto.setCategoryDto( categoryMapper.fromCategoryToCompleteDto( product.getCategory() ) );
        if ( product.getCreatedDate() != null ) {
            productDto.setCreatedDate( LocalDateTime.ofInstant( product.getCreatedDate().toInstant(), ZoneId.of( "UTC" ) ) );
        }
        productDto.setPrice( product.getPrice() );
        if ( product.getModifiedDate() != null ) {
            productDto.setModifiedDate( LocalDateTime.ofInstant( product.getModifiedDate().toInstant(), ZoneId.of( "UTC" ) ) );
        }
        productDto.setName( product.getName() );
        productDto.setId( product.getId() );
        productDto.setSaleOff( product.getSaleOff() );
        productDto.setSoldAmount( product.getSoldAmount() );
        productDto.setTotalReview( product.getTotalReview() );
        productDto.setStatus( product.getStatus() );

        return productDto;
    }

    @Override
    public List<ProductDto> fromEntityToListProductDto(List<Product> products) {
        if ( products == null ) {
            return null;
        }

        List<ProductDto> list = new ArrayList<ProductDto>( products.size() );
        for ( Product product : products ) {
            list.add( fromEntityToProductDto( product ) );
        }

        return list;
    }

    @Override
    public ProductDto fromEntityToProductAutoDto(Product product) {
        if ( product == null ) {
            return null;
        }

        ProductDto productDto = new ProductDto();

        productDto.setImage( product.getImage() );
        productDto.setDescription( product.getDescription() );
        productDto.setPrice( product.getPrice() );
        productDto.setName( product.getName() );
        productDto.setId( product.getId() );
        productDto.setSaleOff( product.getSaleOff() );

        return productDto;
    }

    @Override
    public List<ProductDto> fromEntityToListProductAutoDto(List<Product> products) {
        if ( products == null ) {
            return null;
        }

        List<ProductDto> list = new ArrayList<ProductDto>( products.size() );
        for ( Product product : products ) {
            list.add( fromEntityToProductAutoDto( product ) );
        }

        return list;
    }

    @Override
    public void fromUpdateToEntityProduct(UpdateProductForm updateProductForm, Product product) {
        if ( updateProductForm == null ) {
            return;
        }

        product.setImage( updateProductForm.getImage() );
        product.setDescription( updateProductForm.getDescription() );
        product.setPrice( updateProductForm.getPrice() );
        product.setName( updateProductForm.getName() );
        product.setSaleOff( updateProductForm.getSaleOff() );
        if ( updateProductForm.getStatus() != null ) {
            product.setStatus( updateProductForm.getStatus() );
        }
    }
}
