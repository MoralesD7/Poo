package Temas_POO.Poliformismo;

public class mercedes extends Vehiculo {
    private int cilindrada ;

    public mercedes(String matricula , String marca , String modelo ,int cilindrada) {
        super(matricula,marca,modelo);
        this.cilindrada = cilindrada;
    }
    public String toString(){
        return "la matricula es :"+ getMatricula()+"\nla marca es :"+getMarca()+ "\nel modelo es :"+getModelo()+"\nla cilindrada es :"+ cilindrada;
    }
}
