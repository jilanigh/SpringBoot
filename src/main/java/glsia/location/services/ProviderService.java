package glsia.location.services;

import glsia.location.models.Provider;
import glsia.location.repository.ProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProviderService {
    @Autowired
    ProviderRepository providerRepository;

    public Provider createProvider(Provider provider){
        return providerRepository.save(provider);
    }
    public List<Provider> getAllProviders(){
        return providerRepository.findAll();
    }
    public Provider getProviderById(Long id){
        return providerRepository.findById(id).get();
    }
    public Provider updateProvider(Provider provider){
        return providerRepository.saveAndFlush(provider);
    }
    public void deleteProvider(Long id){
        providerRepository.deleteById(id);
    }



}
