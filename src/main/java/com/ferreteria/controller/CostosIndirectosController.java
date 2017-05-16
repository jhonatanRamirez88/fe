package com.ferreteria.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ferreteria.constant.ViewConstant;
import com.ferreteria.model.CostoIndirectoModel;
import com.ferreteria.service.CostoIndirectoService;

@Controller
@RequestMapping("/costosindirectos")
public class CostosIndirectosController {
	private static final Log LOG = LogFactory.getLog(CostosIndirectosController.class);	
	
	@Autowired
	@Qualifier("costoIndirectoServiceImpl")
	private CostoIndirectoService costoIndirectoService;
	
	@GetMapping("/index")
	public String index(){
		LOG.info("/index --redirect to mostrarcostosindirectos");
		return "redirect:/costosindirectos/mostrarcostosindirectos";
	}
	
	@GetMapping("/mostrarcostosindirectos")
	public ModelAndView showContacts(){
		ModelAndView mav = new ModelAndView(ViewConstant.COSTOS_INDIRECTOS_INDEX);
		mav.addObject("costos_indirectos",costoIndirectoService.ListaTodosCostosIndirectos());
		return mav;
	}
	
	@PostMapping("/agregarcostoindirectoform")
	public String addCostoIndirectoForm(
				@ModelAttribute(name="costoIndirectoModel") CostoIndirectoModel costoIndirectoModel,
				Model model
	){
		costoIndirectoService.addCostoIndirecto(costoIndirectoModel);
		return "redirect:/costosindirectos/mostrarcostosindirectos";
	}
	
	@GetMapping("/agregarcostoindirecto")
	public String redirectCostoInidrectoForm(
			Model model
			){
		CostoIndirectoModel costoIndirectoModel = new CostoIndirectoModel();
		model.addAttribute("costoIndirectoModel", costoIndirectoModel);
		return ViewConstant.COSTOINDIRECTO_FORM;
		
	}
}
