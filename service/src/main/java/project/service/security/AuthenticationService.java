package project.service.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import project.data.dao.ClientDao;
import project.data.pojo.Client;

import java.util.List;

@SuppressWarnings({"unused"})
@Service
public class AuthenticationService implements UserDetailsService {

    @Autowired
    ClientDao clientDao;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        try {
            List<Client> appUsers = clientDao.findByUserName(username);
            if (appUsers.size() != 1) {
                throw new UsernameNotFoundException("User not found: " + username);
            }
            Client appUser = appUsers.get(0);
            return new User(
                    appUser.getUserName(),
                    appUser.getPassword(),
                    true, true, true, true,
                    List.of(new SimpleGrantedAuthority(appUser.getRole()))
            );

        } catch (Exception e) {
            throw new UsernameNotFoundException("User not found: " + username, e);
        }
    }
}
