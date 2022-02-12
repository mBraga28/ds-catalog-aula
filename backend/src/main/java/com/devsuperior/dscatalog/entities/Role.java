package com.devsuperior.dscatalog.entities;

import java.io.Serializable;
import java.util.Objects;

public class Role implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String authroity;
	
	public Role() {
	}

	public Role(Long id, String authroity) {
		this.id = id;
		this.authroity = authroity;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAuthroity() {
		return authroity;
	}

	public void setAuthroity(String authroity) {
		this.authroity = authroity;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Role other = (Role) obj;
		return Objects.equals(id, other.id);
	}
	
}
