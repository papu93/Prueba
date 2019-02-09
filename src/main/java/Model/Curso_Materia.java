package Model;

public class Curso_Materia {
    private int id_curso;
    private int id_materia;

    public Curso_Materia(int id_curso, int id_materia) {
        this.id_curso = id_curso;
        this.id_materia = id_materia;
    }

    public int getId_curso() {
        return id_curso;
    }

    public void setId_curso(int id_curso) {
        this.id_curso = id_curso;
    }

    public int getId_materia() {
        return id_materia;
    }

    public void setId_materia(int id_materia) {
        this.id_materia = id_materia;
    }
    
    
}
