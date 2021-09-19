package io.javabrains.springsecurityjwt.models;

import org.springframework.security.core.GrantedAuthority;

public class Role implements GrantedAuthority {

	private static final long serialVersionUID = 2478026308180853974L;
	String role;
	
	
	public Role(String role) {
		super();
		this.role = role;
	}


	@Override
	public String getAuthority() {
		return role;
	}


  @Override
  public String toString() {
    return "Role [role=" + role + "]";
  }

}
