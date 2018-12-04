package com.commune.communepro.type.controller;



import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.commune.communepro.type.domain.Type;
import com.commune.communepro.type.service.TypeService;

@RestController
@RequestMapping("/type")
public class TypeController {

	@Autowired
	private TypeService typeService;


	@RequestMapping(method=RequestMethod.GET,value= {"/add"})
	public ModelAndView signup() {
		ModelAndView model = new ModelAndView();
		Type type = new Type();
		model.addObject("type", type);
		model.setViewName("type/type_add :: add");
		return model;
	}

	@RequestMapping(value= {"/save"}, method=RequestMethod.POST)
	public ModelAndView createType(@Valid Type type, BindingResult bindingResult) {
		ModelAndView model = new ModelAndView();
		typeService.addType(type);
		model.addObject("msg", "Type has been registered successfully!");
		model.setViewName("redirect:/type/types");

		return model;
	}

	@RequestMapping("/index")
	public ModelAndView typeIndex(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("type/type_index.html");
		return modelAndView;
	}
	@RequestMapping(value="/types",method=RequestMethod.GET)
	public ModelAndView getAllTypes(){
		ModelAndView model = new ModelAndView("type/type_list");
		model.addObject("list", typeService.getAllTypes());
		model.setViewName("type/type_list :: list");
		return model;
	}
	@RequestMapping(value="/type/{id}",method=RequestMethod.GET)
	public ModelAndView getType(@PathVariable Long id){
		ModelAndView model = new ModelAndView();
		model.addObject("type", typeService.getType(id));
		model.setViewName("type/type_edit :: edit");
		return model;
	}

	@RequestMapping(method=RequestMethod.PUT,value={"/updateType"}  )
	public ModelAndView updateType(Type type) {

		ModelAndView model = new ModelAndView();
		typeService.updateType(type);
		model.addObject("msg", "Type has been updated successfully!");
		model.setViewName("redirect:/type/types");
		return model;
	}
	@RequestMapping(value="/type/{id}",method=RequestMethod.DELETE)
	public void deleteType(@PathVariable Long id) {
		typeService.deleteType(id);

	}

}
