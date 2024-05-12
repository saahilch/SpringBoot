package com.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.CourcesServices.CourceService;
import com.app.Entities.Cources;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController // 1st request are come here(Representational service transfer)

public class MyController {
	@Autowired
	private CourceService courceservice;

	@GetMapping("/home")
	// under MyController there is home controller for using it use /home
	public String home() {
		return "this is home";
	}

	/* Get the Cources */
	@GetMapping("/cources")
	public List<Cources> getCources() {
		return this.courceservice.getCources();

	}

	@GetMapping("/cources/{courceId}")
	public Cources getCource(@PathVariable String courceId) {
		return this.courceservice.getCource(Long.parseLong(courceId));
	}

	@PostMapping( "/cources")
	public Cources addCource(@RequestBody Cources cources) {

		return null;
	}
}
