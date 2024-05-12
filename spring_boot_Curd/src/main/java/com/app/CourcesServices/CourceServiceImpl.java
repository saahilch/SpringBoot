package com.app.CourcesServices;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.app.Entities.Cources;

@Service
public class CourceServiceImpl implements CourceService {
	List<Cources> list;

	public CourceServiceImpl() {
		list = new ArrayList<>();
		list.add(new Cources(145, "Java Core", " Basic Contain of Java"));
		list.add(new Cources(146, "Dot Net Core", " Basic Contain of Net"));
		list.add(new Cources(147, "CPP Core", "Basic Contain of C"));

	}

	@Override
	public List<Cources> getCources() {

		return null;
	}

	@Override
	public Cources getCource(long courceId) {
		Cources c = null;
		for (Cources cource : list) {
			if (cource.getId() == courceId) {
				c = cource;
				break;
			}
		}
		return c;
	}

	@Override
	public Cources addCource(Cources cources) {
		list.add(cources);
		return cources;
	}

}
