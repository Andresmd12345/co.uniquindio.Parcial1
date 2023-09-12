package Model;

public class Atracciones {
    private String nombre;
    private int horarioAtencio;
    private String descripcion;
    private String rangoEdad;
    private String nivelPeligro;
    private String pesoPermitido;

    public Atracciones(String nombre, int horarioAtencio, String descripcion, String rangoEdad, String nivelPeligro, String pesoPermitido) {
        this.nombre = nombre;
        this.horarioAtencio = horarioAtencio;
        this.descripcion = descripcion;
        this.rangoEdad = rangoEdad;
        this.nivelPeligro = nivelPeligro;
        this.pesoPermitido = pesoPermitido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHorarioAtencio() {
        return horarioAtencio;
    }

    public void setHorarioAtencio(int horarioAtencio) {
        this.horarioAtencio = horarioAtencio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getRangoEdad() {
        return rangoEdad;
    }

    public void setRangoEdad(String rangoEdad) {
        this.rangoEdad = rangoEdad;
    }

    public String getNivelPeligro() {
        return nivelPeligro;
    }

    public void setNivelPeligro(String nivelPeligro) {
        this.nivelPeligro = nivelPeligro;
    }

    public String getPesoPermitido() {
        return pesoPermitido;
    }

    public void setPesoPermitido(String pesoPermitido) {
        this.pesoPermitido = pesoPermitido;
    }
}
