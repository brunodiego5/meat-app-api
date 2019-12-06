package com.bdd.meatappapi.security;

import java.util.Collection;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.bdd.meatappapi.model.UserApp;
import com.bdd.meatappapi.repository.UserAppRepository;

/*Serviço que retorna o usuário implementando pelos Sring UserDetails*/

@Service
public class AppUserDetailsService implements UserDetailsService {

	@Autowired
	private UserAppRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		Optional<UserApp> userOptional = userRepository.findByEmail(email);
		UserApp userApp = userOptional.orElseThrow(() -> new UsernameNotFoundException("Usuário e/ou senha incorretos"));
		return new SystemUser(userApp, getPermissions(userApp));
	}

	private Collection<? extends GrantedAuthority> getPermissions(UserApp userApp) {
		Set<SimpleGrantedAuthority> authorities = new HashSet<>();
		
		userApp.getPermissions().forEach(p -> authorities.add(new SimpleGrantedAuthority(p.getDescription().toUpperCase())));
		
		return authorities;
	}

}
 