package com.agro.admin.models.mappers;
import com.agro.admin.models.entity.Marca;
import com.agro.admin.models.request.MarcaRequest;
import com.agro.admin.models.response.MarcaResponse;
import org.springframework.stereotype.Component;

@Component
public class MarcaMapper {
	 public Marca dtoToEntity(MarcaRequest request){
		 return Marca.builder()
				 .description(request.getDescription())
				 .name(request.getName())
				 .build();
	 }

	 public MarcaResponse entityToDto(Marca marca){
		  MarcaResponse response = new MarcaResponse();
          response.setId(marca.getId());
          response.setDescription(marca.getDescription());
		  response.setName(marca.getName());
		  return  response;
	 }
	 public Marca Update (MarcaRequest request ,Marca marca){
		  marca.setName(request.getName());
		  marca.setDescription(request.getDescription());
		  return  marca ;
	 }
}
