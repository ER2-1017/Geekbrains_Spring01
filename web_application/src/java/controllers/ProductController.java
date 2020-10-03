package cweb_application.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import web_application.domain.Product;
import web_application.service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController {
  
  private final ProductService service;
   
  public ProductController(ProductService service) {
    this.service = service;
  }

  @GetMapping(params = {"id"})
  public String product(Model model, @RequestParam(name = "id") Long id) {
    Product product = service.getOne(id);
    if (product == null) return "redirect:/catalog/";
    model.addAttribute("product", product);
    return "product";  
  }
}
