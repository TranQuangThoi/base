package com.techmarket.api.form.product;

import com.techmarket.api.model.Brand;
import com.techmarket.api.model.Category;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@ApiModel
public class CreateProductForm {

    @NotEmpty(message = "name cant not be null")
    @ApiModelProperty(name = "name", required = true)
    private String name;

    @NotNull(message = "price cant not be null")
    @ApiModelProperty(name = "price", required = true)
    private Double price;

    @ApiModelProperty(name = "description")
    private String description;

    @ApiModelProperty(name = "image")
    private String image;

    @ApiModelProperty(name = "saleOff")
    private Double saleOff;

    @ApiModelProperty(name = "brandId")
    private Long brandId;

    @NotNull(message = "categoryId cant not be null")
    @ApiModelProperty(name = "categoryId", required = true)
    private Long categoryId;

    @ApiModelProperty(name = "status")
    private Integer status;

}
