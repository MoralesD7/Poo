package POO_Carrera;

public class Corredor {
    private int n_corredor;
    private String nombre ;
    private int tiempo_d_carrera;

    public Corredor(int n_corredor, String nombre, int tiempo_d_carrera) {
        this.n_corredor = n_corredor;
        this.nombre = nombre;
        this.tiempo_d_carrera = tiempo_d_carrera;
    }

    public int getTiempo_d_carrera() {
        return tiempo_d_carrera;
    }

    public void setTiempo_d_carrera(int tiempo_d_carrera) {
        this.tiempo_d_carrera = tiempo_d_carrera;
    }
    public String M_datos (){
        return  "Numero:"+n_corredor+"\nNombre :"+nombre+"\nTiempo:"+tiempo_d_carrera;
    }
}
