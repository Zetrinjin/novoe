package project.service.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import project.data.dao.ClientDao;
import project.data.pojo.Client;

import java.util.List;

public class AuthenticationService implements UserDetailsService {

    @Autowired
    ClientDao clientDao;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        try {
            Client client = clientDao.findByUserNameOne(username);
            if (client==null) {
                throw new UsernameNotFoundException("User not found: " + username);
            }

            return new User(
                    client.getUserName(),
                    client.getPassword(),
                    true, true, true, true,
                    List.of(new SimpleGrantedAuthority(client.getRole()))
            );

        } catch (Exception e) {
            throw new UsernameNotFoundException("User not found: " + username, e);
        }
    }
}
