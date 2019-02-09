package Model;

public class Profesor_Materia {
    private int idProfesor;
    private int idMateria;

    public Profesor_Materia(int idProfesor, int idMateria) {
        this.idProfesor = idProfesor;
        this.idMateria = idMateria;
    }

    public int getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(int idProfesor) {
        this.idProfesor = idProfesor;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }
    
    
}
