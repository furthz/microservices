package pe.soapros.oauth.services;

import pe.soapros.usuarios.commons.models.entity.Usuario;

public interface IUsuarioService {

	public Usuario findByUsername(String username);
}
