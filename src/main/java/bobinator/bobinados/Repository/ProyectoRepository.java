/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bobinator.bobinados.Repository;

import bobinator.bobinados.Entity.Proyecto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author Nickler
 */
public interface ProyectoRepository extends JpaRepository<Proyecto,String> {
   
    
     @Query("Select u from Proyecto u where u.id = :pepe")
    public Proyecto buscarProyectoPorId(@Param("pepe") String id);
    
     @Query("Select u from Proyecto u where u.cliente.id = :idCliente")
    public List<Proyecto> buscarProyectoPorIdCliente(@Param("idCliente") String idCliente);
    
    @Query("Select u from Proyecto u where u.cliente.id = :idCliente")
    public Proyecto buscarUnProyectoPorIdCliente(@Param("idCliente") String idCliente);
    
    
   

}
