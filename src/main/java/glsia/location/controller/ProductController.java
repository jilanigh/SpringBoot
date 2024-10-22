package glsia.location.controller;

import glsia.location.models.Product;
import glsia.location.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {
    @Autowired
    ProductService productService;
    @RequestMapping("/addProduct")
    public String addProduct(Model model){
        Product product = new Product();
        model.addAttribute("ProductForm", product);
        return "new_product";
    }
}
