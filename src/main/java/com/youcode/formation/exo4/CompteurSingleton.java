package com.youcode.formation.exo4;

import java.util.UUID;

import org.springframework.stereotype.Component;

@Component
public class CompteurSingleton {

	private final UUID id = UUID.randomUUID();

	public UUID getId() {
		return id;
	}
}
