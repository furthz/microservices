package pe.soapros.usuarios;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

import pe.soapros.usuarios.models.entity.Role;
import pe.soapros.usuarios.models.entity.Usuario;



@Configuration
//@EntityScan({"pe.soapros.usuarios.commons.models.entity"})
public class RepositoryConfig implements RepositoryRestConfigurer{

	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		config.exposeIdsFor(Usuario.class, Role.class);
	}
}
