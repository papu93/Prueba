package Model;

public class Alumno_Curso {
    private int id_alumno;
    private int id_curso;

    public int getId_alumno() {
        return id_alumno;
    }

    public void setId_alumno(int id_alumno) {
        this.id_alumno = id_alumno;
    }

    public int getId_curso() {
        return id_curso;
    }

    public void setId_curso(int id_curso) {
        this.id_curso = id_curso;
    }

    public Alumno_Curso(int id_alumno, int id_curso) {
        this.id_alumno = id_alumno;
        this.id_curso = id_curso;
    }
}
