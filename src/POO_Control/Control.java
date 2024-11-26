package POO_Control;

public class Control {
    //String para recibir el dato
    private String movimiento ="";
    //Variables para recibir las coordenadas del objeto
    private int x = 0;
    private int y =  0;
    //Constructor para asegurar que se inserten los datos
    public Control(String movimiento) {
        this.movimiento = movimiento;
    }

    public void setMovimiento(String movimiento) {
        this.movimiento = movimiento;
    }

    //Metodo para obtener los movimientos de x
    public int get_x(){
        if(movimiento.equals("derecha")){
            x++;
        }else if (movimiento.equals("izquierda")){
            x--;
        }
        return x;
    }
    //Metodo para obtener los movimientos de y
    public int get_y(){
        if(movimiento.equals("arriba")){
            y++;
        }else if (movimiento.equals("abajo")){
            y--;
        }
        return y;
    }

}
