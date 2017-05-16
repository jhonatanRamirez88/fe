package com.ferreteria.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ferreteria.constant.ViewConstant;
import com.ferreteria.model.ProveedorModel;
import com.ferreteria.service.ProveedoresService;

@Controller
@RequestMapping("/proveedores")
public class ProveedoresController {
	
	@Autowired
	@Qualifier("proveedorServiceImpl")
	private ProveedoresService proveedorServiceImpl;

	@GetMapping("/index")
	public ModelAndView index(){
		ModelAndView mav = new ModelAndView();
		mav.addObject("proveedores", proveedorServiceImpl.ListaProveedores());		
		mav.setViewName(ViewConstant.PROVEEDORES_INDEX);
		return mav;
	}
	
	@GetMapping("/agregarform")
	public ModelAndView agregarForm(){
		ProveedorModel proveedorModel = new ProveedorModel();
		ModelAndView mav = new ModelAndView();
		mav.addObject("proveedor", proveedorModel);
		mav.setViewName(ViewConstant.PROVEEDORES_CREATE);
		return mav;
	}
	
	@PostMapping("/store")
	public String store(
			@ModelAttribute(name="proveedor") ProveedorModel proveedorModel
			){
		proveedorServiceImpl.addProveedor(proveedorModel);
		return "redirect:/proveedores/index";
	}
	
	@GetMapping("/cancelar")
	public String cancelar(){
		return "redirect:/proveedores/index";
	}
	
	@GetMapping("/edit")
	public ModelAndView editar(
			@RequestParam(name="id",required=true) int id
	){
		ModelAndView mav = new ModelAndView();
		ProveedorModel proveedorModel = proveedorServiceImpl.findProveedorByIdModel(id);
		mav.addObject("proveedor", proveedorModel);
		mav.setViewName(ViewConstant.PROVEEDORES_EDIT);
		return mav;
	}
	
	@PostMapping("/update")
	public String update(
			@ModelAttribute(name="proveedor") ProveedorModel proveedorModel
			){
		proveedorServiceImpl.addProveedor(proveedorModel);
		return "redirect:/proveedores/index";
	}
	
	@GetMapping("/delete")
	public ModelAndView delete(
			@RequestParam(name="id", required=true) int id
			){
		proveedorServiceImpl.deleteProveedor(id);
		return index();
	}
	
}
