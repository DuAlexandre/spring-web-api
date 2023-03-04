package dio.web.api.repository;

import dio.web.api.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioRepository {
    public void save(Usuario usuario){
        if(usuario.getId()==null)
            System.out.println("SAVE - Recebendo o usuário na camada de repositório");
        else
            System.out.println("UPDATE - Recebendo o usuário na camada de repositório");

        System.out.println(usuario);
    }

    public void deleteById(Integer id){
        System.out.println(String.format("DELETE/id"));
        System.out.println(id);
    }

    public List<Usuario> findAll(){
        System.out.println("LIST - Listando usuarios");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("eduardo", "password"));
        usuarios.add(new Usuario("felipe", "masterpass"));
        return usuarios;
    }

    public Usuario findById(Integer id){
        System.out.println("Find usuário pelo id");
        return new Usuario("eduardo", "password");
    }

    public Usuario findByUserName(String userName){
        System.out.println("Find usuário pelo nome");
        return new Usuario("eduardo", "password");
    }
}
