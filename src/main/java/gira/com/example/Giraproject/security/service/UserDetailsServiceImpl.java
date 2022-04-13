package gira.com.example.Giraproject.security.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
	// @Autowired
	// private GiraUserRepository repository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// Optional<GiraUser> userOpt = repository.findByUsername(username);

		// if(userOpt.isEmpty())
		// return null;

		// GiraUser currentUser = userOpt.get();

		// return new User(currentUser.getUsername(), currentUser.getPassword(),
		// getGrantedAuthorities(currentUser));
		return new User("", "", new ArrayList<>());
	}

}
