package entities;

public class Agente extends Entidad {
    private static int totalAgentes = 0;
    private static int totalAnomalias = 0;

    private String habilidadEspecial;
    private String misionAsignada;

    public Agente(int id, String nombre, String habilidadEspecial) {
        super(id, nombre);
        this.habilidadEspecial = habilidadEspecial;
        totalAgentes++;
    }

    public static void registrarAnomalia() {
        totalAnomalias++;
    }

    public static void mostrarEstadisticas() {
        System.out.println("Total de Agentes: " + totalAgentes);
        System.out.println("Total de Anomalías: " + totalAnomalias);
    }

    public String getHabilidadEspecial() {
        return habilidadEspecial;
    }

    public void setHabilidadEspecial(String habilidadEspecial) {
        this.habilidadEspecial = habilidadEspecial;
    }

    public String getMisionAsignada() {
        return misionAsignada;
    }

    public void asignarMision(String mision) {
        this.misionAsignada = mision;
    }

    @Override
    public String toString() {
        return super.toString() + ", Habilidad Especial: " + habilidadEspecial +
                (misionAsignada != null ? ", Misión: " + misionAsignada : "");
    }
}
