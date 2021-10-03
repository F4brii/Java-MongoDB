package com.pqr.demo.Infraestructure.context;

import com.pqr.demo.Domain.models.Usuario;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface IUsuarioRepository extends MongoRepository<Usuario, String> {
    
    @Query("{usuario: ?0, contrasena: ?1}")  
    Usuario Login(String usuario, String pass);

    @Query("{id: ?0}")  
    Usuario ObtenerUsuarioId(String id);
}
