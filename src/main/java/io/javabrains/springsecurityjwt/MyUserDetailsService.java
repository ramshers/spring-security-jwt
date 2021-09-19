package io.javabrains.springsecurityjwt;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import io.javabrains.springsecurityjwt.models.Role;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
    	
    	Role premium = new Role("premium");
    	Role admin = new Role("admin");
    	
    	List<Role> roles = new ArrayList<>();
    	
    	roles.add(premium);
    	roles.add(admin);

        return new User("foo", "foo" , roles );
        
    }
}