package com.agro.admin.models.mappers;

import com.agro.admin.models.entity.Provider;
import com.agro.admin.models.request.ProviderRequest;
import com.agro.admin.models.response.ProviderResponse;
import org.springframework.stereotype.Component;

@Component
public class ProviderMapper {
	public Provider entityToDto(ProviderRequest providerRequest) {
		Provider provider = new Provider();
		provider.setNameProvider(providerRequest.getNameProvider());
		provider.setCuit(providerRequest.getCuit());
		provider.setAddress(providerRequest.getAddress());
		provider.setState(providerRequest.getState());
		provider.setCountry(providerRequest.getCountry());
		provider.setTelephone(providerRequest.getTelephone());
		provider.setWeb(providerRequest.getWeb());
		provider.setMail(providerRequest.getMail());
		return provider;
	}

	public ProviderResponse dtoToEntity(Provider provider) {
		ProviderResponse providerResponse = new ProviderResponse();
		providerResponse.setId(provider.getId());
		providerResponse.setNameProvider(provider.getNameProvider());
		providerResponse.setCuit(provider.getCuit());
		providerResponse.setAddress(provider.getAddress());
		providerResponse.setState(provider.getState());
		providerResponse.setCountry(provider.getCountry());
		providerResponse.setTelephone(provider.getTelephone());
		providerResponse.setWeb(provider.getWeb());
		providerResponse.setMail(provider.getMail());
		return providerResponse;
	}

	public void update(ProviderRequest providerRequest, Provider provider) {
		provider.setNameProvider(providerRequest.getNameProvider());
		provider.setCuit(providerRequest.getCuit());
		provider.setAddress(providerRequest.getAddress());
		provider.setState(providerRequest.getState());
		provider.setCountry(providerRequest.getCountry());
		provider.setTelephone(providerRequest.getTelephone());
		provider.setWeb(providerRequest.getWeb());
		provider.setMail(providerRequest.getMail());
	}

	public Provider softDelete(Provider provider, boolean status) {
		provider.setStatus(status);
		return provider;
	}
}