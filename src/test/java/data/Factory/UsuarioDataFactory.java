package data.Factory;

import pojo.UsuarioPojo;

public class UsuarioDataFactory {
    public static UsuarioPojo CriarUsuarioAdministrador() {
        UsuarioPojo usuario = new UsuarioPojo();
        usuario.setUsuarioLogin ("admin");
        usuario.setUsuarioSenha("admin");

        return usuario;

    }
}
