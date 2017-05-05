package com.ferreteria.controller;

import java.util.List;

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
import org.springframework.web.bind.annotation.RequestParam;
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
		return "redirect:/costosindirectos/mostrarcostosindirectos";
	}
	
	@GetMapping("/mostrarcostosindirectos")
	public ModelAndView showContacts(){
		ModelAndView mav = new ModelAndView(ViewConstant.COSTOS_INDIRECTOS_INDEX);
		mav.addObject("costos_indirectos",costoIndirectoService.ListaTodosCostosIndirectos());
//		List<CostoIndirectoModel> costos = costoIndirectoService.ListaTodosCostosIndirectos();
//		for (CostoIndirectoModel costoIndirectoModel : costos) {
//			System.out.println(costoIndirectoModel.toString());
//		}
		return mav;
	}
	
	@PostMapping("/addcostoindirectoform")
	public String addCostoIndirectoForm(
				@RequestParam(name="id",required=false) int id,
				Model model
	){
		CostoIndirectoModel costoIndirectoModel = new CostoIndirectoModel();
		if (id != 0) {
			costoIndirectoModel = costoIndirectoService.findCostoIndirectoByIdModel(id);
		}
		model.addAttribute("costoIndirectoModel", costoIndirectoModel);		
		return ViewConstant.COSTOINDIRECTO_FORM;
	}
}
