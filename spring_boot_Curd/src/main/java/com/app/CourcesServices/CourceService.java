package com.app.CourcesServices;

import java.util.List;

import com.app.Entities.Cources;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

public interface CourceService {

	public List<Cources> getCources();

	public Cources getCource(long courceId);

	public Cources addCource(Cources cources);
}
