package glsia.location.services;

import glsia.location.models.Subcategory;
import glsia.location.repository.SubcategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubcategoryService {
    @Autowired
    SubcategoryRepository subcategoryRepository;

    public Subcategory createSubcategory(Subcategory subcategory){
        return subcategoryRepository.save(subcategory);
    }
    public List<Subcategory> getAllSubcategories(){
        return subcategoryRepository.findAll();
    }
    public Subcategory getSubcategoryById(Long id){
        return subcategoryRepository.findById(id).get();
    }

    public Subcategory updateSubcategory(Subcategory subcategory){
        return subcategoryRepository.saveAndFlush(subcategory);
    }
    public void deleteSubcategory(Long id){
        subcategoryRepository.deleteById(id);
    }
}
