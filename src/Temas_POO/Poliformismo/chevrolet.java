package Temas_POO.Poliformismo;

public class chevrolet extends Vehiculo {
    private int capacidad_carga;

    public chevrolet(String matricula , String marca , String modelo ,int capacidad_carga){
        super(matricula,marca,modelo);
        this.capacidad_carga = capacidad_carga;
    }
    public String toString(){
        return "la matricula es :"+ getMatricula()+"\nla marca es :"+getMarca()+ "\nel modelo es :"+getModelo()+"\nla capacidad de carga es:"+capacidad_carga;
    }

}
