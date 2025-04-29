package Ejercicios.Dados;


public class Juego_dados {
    //Metodos
    public void Imprimir_valores(Dado dado[]){
        System.out.println("los valores de tus dados fueron:");
        for (int i = 0 ; i < 3 ;i++){
            System.out.print(dado[i].getValor()+" , ");
        }
    }
    public String Mostrar_resultado(Dado dado[]){
        boolean tirada = false;
        for(int i = 0 ; i<2;i++){
            if(dado[i].getValor() == dado[i+1].getValor() ){
                tirada = true;
            }
        }
        if(tirada){
             return "Felicidades ganaste el juego de los dados";
        }else{
            return "He visto monos con mas suerte que tu maldito antisemita de mierda";
        }
    }

}
