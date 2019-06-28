package lmc.stage.springprojectstage;

import lmc.stage.springprojectstage.entities.Role;
import lmc.stage.springprojectstage.entities.User;
import lmc.stage.springprojectstage.services.RoleService;
import lmc.stage.springprojectstage.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class SpringprojectstageApplication implements CommandLineRunner {

    @Autowired
    UserService userService ;

    @Autowired
    RoleService roleService ;

    public static void main(String[] args) {
        SpringApplication.run(SpringprojectstageApplication.class, args);
    }

    @Override
    public void run(String... arg) throws Exception {

    }
}
