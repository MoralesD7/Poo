package Temas_POO.Listas;

public class Pila {
    //Atributo de pila
    Nodo raiz = null ;
    public class Nodo {
        //Atributos de nodo
        private int info ;
        private Nodo puntero ;
        //Constructor del nodo para inicializarlo
        public Nodo(int info ,Nodo puntero){
            this.info = info;
            this.puntero = puntero;
        }

    }
    //Metodos agregar , extraer , Mostrar nodos
    public void Agregar_nodo (int info){
        if(raiz == null){
            Nodo nodito = new Nodo(info,null);
            raiz = nodito;
        }else {
            Nodo nodito = new Nodo(info,raiz);
            raiz = nodito;
        }
    }
    public String Extraer_nodo(){
        if(raiz == null){
            return "La pila esta vacia no puedes extraer nada" ;
        }else{
            int valorExtraido = raiz.info;
            raiz = raiz.puntero;
            return "Nodo extraído: " + valorExtraido;
        }
    }

    public void imprimir() {
        Nodo reco=raiz;
        System.out.println("Listado de todos los elementos de la pila.");
        while (reco!=null) {
            System.out.print(reco.info+"-");
            reco=reco.puntero;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Pila pila1=new Pila();
        pila1.Agregar_nodo(10);
        pila1.Agregar_nodo(40);
        pila1.Agregar_nodo(3);
        pila1.imprimir();
        System.out.println("Extraemos de la pila:"+pila1.Extraer_nodo());
        pila1.imprimir();
    }
}
