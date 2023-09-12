package Model;

public class Carro {
    private String marca;
    private int modelo;
    private int aniofabricacion;
    private int velocidadAcutal;
    private String motoEncendido;
    private int capacidadCombustible;
    private int nivelCombustible;
    private String color;
    private String lucesEncendidas;
    private String frenoDeManoActivado;
    private String numeroDePuestas;
    private String aireAcondicionadoEncendido;
    private String radioEncendido;
    private String enMarcha;
    private double kilometraje;

    public Carro(String marca, int modelo, int aniofabricacion, int velocidadAcutal, String motoEncendido, int capacidadCombustible, int nivelCombustible, String color, String lucesEncendidas, String frenoDeManoActivado, String numeroDePuestas, String aireAcondicionadoEncendido, String radioEncendido, String enMarcha, double kilometraje) {
        this.marca = marca;
        this.modelo = modelo;
        this.aniofabricacion = aniofabricacion;
        this.velocidadAcutal = velocidadAcutal;
        this.motoEncendido = motoEncendido;
        this.capacidadCombustible = capacidadCombustible;
        this.nivelCombustible = nivelCombustible;
        this.color = color;
        this.lucesEncendidas = lucesEncendidas;
        this.frenoDeManoActivado = frenoDeManoActivado;
        this.numeroDePuestas = numeroDePuestas;
        this.aireAcondicionadoEncendido = aireAcondicionadoEncendido;
        this.radioEncendido = radioEncendido;
        this.enMarcha = enMarcha;
        this.kilometraje = kilometraje;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getAniofabricacion() {
        return aniofabricacion;
    }

    public void setAniofabricacion(int aniofabricacion) {
        this.aniofabricacion = aniofabricacion;
    }

    public int getVelocidadAcutal() {
        return velocidadAcutal;
    }

    public void setVelocidadAcutal(int velocidadAcutal) {
        this.velocidadAcutal = velocidadAcutal;
    }

    public String getMotoEncendido() {
        return motoEncendido;
    }

    public void setMotoEncendido(String motoEncendido) {
        this.motoEncendido = motoEncendido;
    }

    public int getCapacidadCombustible() {
        return capacidadCombustible;
    }

    public void setCapacidadCombustible(int capacidadCombustible) {
        this.capacidadCombustible = capacidadCombustible;
    }

    public int getNivelCombustible() {
        return nivelCombustible;
    }

    public void setNivelCombustible(int nivelCombustible) {
        this.nivelCombustible = nivelCombustible;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLucesEncendidas() {
        return lucesEncendidas;
    }

    public void setLucesEncendidas(String lucesEncendidas) {
        this.lucesEncendidas = lucesEncendidas;
    }

    public String getFrenoDeManoActivado() {
        return frenoDeManoActivado;
    }

    public void setFrenoDeManoActivado(String frenoDeManoActivado) {
        this.frenoDeManoActivado = frenoDeManoActivado;
    }

    public String getNumeroDePuestas() {
        return numeroDePuestas;
    }

    public void setNumeroDePuestas(String numeroDePuestas) {
        this.numeroDePuestas = numeroDePuestas;
    }

    public String getAireAcondicionadoEncendido() {
        return aireAcondicionadoEncendido;
    }

    public void setAireAcondicionadoEncendido(String aireAcondicionadoEncendido) {
        this.aireAcondicionadoEncendido = aireAcondicionadoEncendido;
    }

    public String getRadioEncendido() {
        return radioEncendido;
    }

    public void setRadioEncendido(String radioEncendido) {
        this.radioEncendido = radioEncendido;
    }

    public String getEnMarcha() {
        return enMarcha;
    }

    public void setEnMarcha(String enMarcha) {
        this.enMarcha = enMarcha;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }
}
