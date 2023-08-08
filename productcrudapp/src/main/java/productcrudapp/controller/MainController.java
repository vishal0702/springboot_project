package productcrudapp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import productcrudapp.dao.ProductDao;
import productcrudapp.model.Product;

@Controller
public class MainController {

	@Autowired
	private ProductDao productDao;

	@RequestMapping("/home")
	public String home(Model m) {
		List<Product> products = productDao.getProducts();
		m.addAttribute("products", products);
		return "index";
	}

	// Show add-product form
	@RequestMapping("/add-product")
	public String addProduct(Model m) {

		m.addAttribute("title", "Add Product");
		return "add_product_form";
	}

	// handle add & update product form
	@RequestMapping(value = "/handle-product", method = RequestMethod.POST)
	public RedirectView handleProduct(@ModelAttribute Product product, HttpServletRequest servletRequest) {
		System.out.println(product);
		productDao.createProduct(product);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(servletRequest.getContextPath() + "/home");
		return redirectView;
	}

	// Delete Handler
	@RequestMapping("/delete/{productId}")
	public RedirectView deleleProduct(@PathVariable("productId") int productId, HttpServletRequest servletRequest) {
		this.productDao.deleteProduct(productId);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(servletRequest.getContextPath() + "/home");
		return redirectView;
	}
	
	//Update Handler
	@RequestMapping("/update/{productId}")
	public String updateProduct(@PathVariable("productId") int productId, Model m) {
		Product product = this.productDao.getProduct(productId);
		m.addAttribute("product", product);
		return "update_form";
	}
}
