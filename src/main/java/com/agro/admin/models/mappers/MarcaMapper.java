package com.agro.admin.models.mappers;

import com.agro.admin.models.entity.Marca;
import com.agro.admin.models.request.MarcaRequest;
import org.springframework.stereotype.Component;

@Component
public class MarcaMapper {
	public Marca entityToDto(MarcaRequest marcaRequest) {
		return Marca.builder()
				.nameMarca(marcaRequest.getNameMarca())
				.build();
	}
}
