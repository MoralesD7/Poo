package Ejercicios.Poligono;

public abstract class Poligono {
    //el numero de lado lo ocuparemos para impimir los datos mas adelante
    private int num_lados;

    //inicializamos el constructor
    public Poligono(int num_lados) {
        this.num_lados = num_lados;
    }
    //metodos to string para heredarlo en el futuro
    @Override
    public String toString(){
        return  "numero de lados :"+ num_lados;
    }

    //dejamos abstracto el metodo area ya que la clase poligono es muy general
    public abstract int area ();

}
