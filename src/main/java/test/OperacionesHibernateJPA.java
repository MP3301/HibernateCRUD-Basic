
package test;

import mx.com.gm.dao.PersonaDAO;
import mx.com.gm.domain.Persona;


public class OperacionesHibernateJPA {
   
   public static void main(String[] args) {
      
      PersonaDAO personaDao = new PersonaDAO();
      
     
      
      
      //para insert
  /*    Persona persona = new Persona();
      persona.setEmail("panchito@mail.com");
      persona.setApellido("pancho juan");
      persona.setNombre("Juan");
      persona.setTelefonp("+666123456");
    */  
      //personaDao.Insertar(persona);
      
      
      //para update
      
     Persona persona = new Persona();
      //hay que saber id, se setea id a buscar
      persona.setIdPersona(0);
      //se busca id en objecto persona
      personaDao.buscarPersonaPorId(persona);
      //se elimina
      //personaDao.Eliminar(persona);
      //System.out.println("deleted");
       personaDao.listar();
   }
   
}
