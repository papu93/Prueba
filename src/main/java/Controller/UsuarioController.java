package Controller;

import Grafica.Background;
import Grafica.HomeDirectivo;
import Model.Usuario;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import Model.Persona;
import Ui.UI;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


public class UsuarioController {
    
    
    public static boolean Login (String dni, String pass){
//        Session sesion = HibernateUtil.getSessionFactory().openSession();
        StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
        .configure() // obtiene los valores de hibernate.cfg.xml
        .build();
            SessionFactory sessionFactory = new MetadataSources(registry)
            .buildMetadata().buildSessionFactory();
            Session sesion = sessionFactory.openSession();
        
        Integer dniInt = Integer.parseInt(dni);
        
        Transaction tx = sesion.beginTransaction();
        
        
        Persona persona = sesion.get(Persona.class, dniInt);
//        Persona persona = (Persona) sesion.createCriteria(Persona.class)
//                .add(Restrictions.eq("dni", dniInt)).uniqueResult();

        
        try {
            if(persona!=null){
            
                String cargo = persona.getCargo();
                
                if (cargo.equalsIgnoreCase("Director")  || cargo.equalsIgnoreCase("Profesor")) {
                    /*Usuario usuario = (Usuario) sesion.createCriteria(Usuario.class)
                    .add(Restrictions.eq("persona", persona)).uniqueResult();
                    */
                    Usuario usuario = persona.getUsuario();
                    try {
                        if(usuario!=null){

                            if(usuario.getPass().equals(pass)){

                                JOptionPane.showMessageDialog(null, "Bienvenido usuario "+persona.getNombre() + " " + persona.getApellido());
                                return true;
                            }else{
                                JOptionPane.showMessageDialog(null, "Error la contraseña ingresada "
                                        + "no corresponde con el usuario", "" ,JOptionPane.ERROR_MESSAGE);
                                return false;
                            }

                        }else{
                            JOptionPane.showMessageDialog(null, "El usuario "+persona.getNombre() + " " + persona.getApellido()+
                                    " no existe", "" ,JOptionPane.ERROR_MESSAGE);
                            return false;
                        }
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "El usuario "+persona.getNombre() + " " + persona.getApellido()+
                                    " no existe", "" ,JOptionPane.ERROR_MESSAGE);
                        System.out.println(e);
                        return false;
                    }            
                } else{
                    JOptionPane.showMessageDialog(null, "Ud no tiene acceso al sistema", "" ,JOptionPane.ERROR_MESSAGE);
                    //return false;
                }   
            }else{
                JOptionPane.showMessageDialog(null, "Usuario o contraseña no valida", "" ,JOptionPane.ERROR_MESSAGE);
                //return false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El dni no concuerda con ningún usuario", "" ,JOptionPane.ERROR_MESSAGE);
            System.out.println(e);
            return false;
        }
        
        return false;
    }
    
    
    
}
