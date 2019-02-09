package Controller;

import java.util.ArrayList;
import java.util.List;
import Model.Alumno;
import Model.Persona;
import java.util.Date;


public class CursoController {
    
    
    public List<Model.Alumno> getAll(){
        List<Model.Alumno> alumnos = new ArrayList<Model.Alumno>();
        //String dni, String apellido, String nombre, String curso, Integer edad
        
        Date a1 = new Date();
        a1.setDate(01/02/2000);
        Date a2= new Date();
        a2.setDate(2000-03-05);
        Date a3= new Date();
        a3.setDate(2000-10-15);
        Date a4= new Date();
        a4.setDate(2000-04-06);
        Date a5= new Date();
        a5.setDate(2000-07-15);
                
                
                
                
        Persona p1 = new Persona(42345123,"Olga", "Karina", a1, "Las Heras");
        Persona p3 = new Persona(42765234,"Martinez", "Don", a2, "Rodriguez");
        Persona p4 = new Persona(42465020,"Legrand", "Mirta", a3, "Alem");
        Persona p5 = new Persona(42789456,"Nievas", "Juan", a4, "Av Colon");
        Persona p6 = new Persona(42127821,"Petrovich", "Marcos", a5, "Sarmiento");
                
        alumnos.add(new Alumno(p1));
        alumnos.add(new Alumno(p3));
        alumnos.add(new Alumno(p4));
        alumnos.add(new Alumno(p5));
        alumnos.add(new Alumno(p6));
        
        return alumnos;
    }
    
}

