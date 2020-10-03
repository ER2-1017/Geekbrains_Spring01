package restapi.mapper;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import restapi.domain.Product;
import restapi.dto.ProductDto;

@Mapper
public interface ProductMapper {
  
  ProductMapper MAPPER = Mappers.getMapper(ProductMapper.class);
  
  Product toProduct(ProductDto dto);
  
  @InheritInverseConfiguration
  ProductDto fromProduct(Product p);
  
  List<Product> toProductList(List<ProductDto> dtoList);

  List<ProductDto> fromProductList(List<Product> productList);

}
