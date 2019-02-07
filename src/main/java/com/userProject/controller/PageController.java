package com.userProject.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.userProject.newProduct.NewProductRepository;
import com.userProject.newProduct.New_Product;


@Controller
public class PageController {
	NewProductRepository newProductRepository;
	public static final String LOGGEDUSER="user";
	
	@GetMapping("/")
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		return "pages/index";
	};
	
	@GetMapping("/index")
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String home_error(Model model) {
		return "pages/index";
	};
	
	@RequestMapping(value = "/index", method = RequestMethod.POST)
	public String verifyLogin(Model model,@RequestParam(required=false,value="") String userId, @RequestParam(required=false,value="") String password, HttpSession session) {
		String username = null;
		String usertype = null;
		
		if(userId.equals("applicant.product.registry@gmail.com")&&password.equals("unep1234")) {
			usertype = "applicant";
			username ="applicant.product.registry@gmail.com";
			session.setAttribute(LOGGEDUSER, usertype);
			session.setAttribute("islogged", true);
			session.setAttribute("username", username);
			return "redirect:/applicant";
		}
		
		else if(userId.equals("regulator.product.registry@gmail.com")&&password.equals("unep1234")) {
			usertype = "regulator";
			username ="regulator.product.registry@gmail.com";
			session.setAttribute(LOGGEDUSER, usertype);
			session.setAttribute("islogged", true);
			session.setAttribute("username", username);
			System.out.println("Connected_re");
			return "redirect:/regulator";
		}		
		return "redirect:/";
	}
	
    public void NewProductRepository(NewProductRepository newProductRepository) {
        this.newProductRepository = newProductRepository;
    }
	
	@RequestMapping(value = "/applicant", method = RequestMethod.GET)
	public String applicant() {
		return "pages/applicant";
	}
	
	@RequestMapping(value = "/searchrecord", method = RequestMethod.GET)
	public String searchRecord() {
		System.out.println("oui");
		return "pages/searchrecord";
	}
	
	@RequestMapping(value = "/newProduct", method = RequestMethod.GET)
	public String newProduct() {
		System.out.println("oui");
		return "pages/newProduct";
	}
	@RequestMapping(value = "/regulator", method = RequestMethod.GET)
	public String regulator() {
		System.out.println("oui");
		return "pages/regulator";
	}
	
	@RequestMapping(value = "/newProduct", method = RequestMethod.POST)
	public String submitNewProductForm(Model model, New_Product newProduct) {
//		New_Product result = this.newProductRepository.save(newProduct);
//		model.addAttribute("newProduct", result);
		return "redirect:/administrative_details";
	}
	
	@RequestMapping(value = "/administrative_details", method = RequestMethod.GET)
	public String Admin_Detail(New_Product newProduct, RedirectAttributes ra) {
		return "pages/administrative_details";
	}
	
	@RequestMapping(value = "/administrative_details", method = RequestMethod.POST)
	public String submitAdminDetails(Model model) {
//		New_Product result = this.newProductRepository.save(newProduct);
//		model.addAttribute("newProduct", result);
		return "redirect:/applicant";
	}
	
	@RequestMapping(value = "/logOut", method = RequestMethod.GET)
	public String logOut(Model model,HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
	
	@RequestMapping(value = "/error", method = RequestMethod.GET)
	public String error() {
		System.out.println("oui");
		return "pages/error";
	}
	
}
