package com.youcode.formation.exo4;

import java.util.UUID;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class CompteurPrototype {

	private final UUID id = UUID.randomUUID();

	public UUID getId() {
		return id;
	}
}
