package Temas_POO.Swing;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class J_Frame extends JFrame {

    private JPanel panel;
    private JTextArea Area_txt;

    public J_Frame() {
        //metodo para establecer el titulo
        this.setTitle("J_frame");

        //establecer la posicion inicial del panel
        //this.setLocation(500,250);

        //metodo para establecer el tamaño del frame principal
        this.setSize(1000,1000);

        //METODO QUE HACE LO DE SETSIZE Y SETLOCATION
        //this.setBounds(500, 500, 1000, 1000); // Ampliar dimensiones iniciales

        //para establecer por defecto el frame en el medio ya qe no todas las pantallas son iguales
        this.setLocationRelativeTo(null);

        //Modif si puedes agrandar o no el frame
        //this.setResizable(false);

        //Mod el minimo tamaño para hacer pequeño la ventana
        this.setMinimumSize(new Dimension(500, 500));

        //establecer el color del frame
        //this.getContentPane().setBackground(Color.black);

        //agregamos el panel para escribir sobre el
        Acv_componentes();

        //metodo para establecer la visibilidad por defecto siempre tiene false
        this.setVisible(true);

        //metodo para que al cerrar la ventana se termine de ejecutar
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void Acv_componentes() {
        J_panel();
        J_label();
        J_button();
        J_rad_button();
        J_toggle_button();
        J_text_field();
        J_Area_txt();
        Check_box();
        J_combo_box();
        J_password();
        J_table();
        J_list();

    }

    private void J_panel() {
        //creas el objeto panel para poder traerlo y modificar sus propiedades
        panel = new JPanel();
        //agregamos el panel al contenido, se tiene que invocar el metodo en el frame obviamente
        this.getContentPane().add(panel);

        //modificamos el color del panel
        panel.setBackground(Color.gray);

        //desactivando el diseño
        panel.setLayout(null);
    }

    private void J_label() {
        //creacion de un etiqueta Jlabel
        JLabel etiqueta = new JLabel("Hola mundito");
        //Se puede agregar txt mediante construc o metodo y modif la posicion de las letras
        //etiqueta.setText("hola mundito");

        //modificar la posicion del texto mediante metodo y no constructor
        //etiqueta.setHorizontalAlignment(SwingConstants.RIGHT);

        //modificar el tamaño y posicion  pero para eso tenemos que desactivar el diseño por defecto
        etiqueta.setBounds(50, 20, 150, 50); // Ajustar posición
        //etiqueta para poder modificar el color de la letra
        etiqueta.setForeground(Color.white);

        //para poder mod el color del back ground necesitas hacer lo mismo que en el panel
        etiqueta.setOpaque(true);//por defecto esta en false
        etiqueta.setBackground(Color.black);

        //Modificar el tipo de letra etc
        etiqueta.setFont(new Font("Chalkduster", Font.ITALIC, 10));

        //ahora la agregamos al panel
        panel.add(etiqueta);
        //--------------------------------------------------------------
        //etiqueta de tipo IMAGEN
        /*ImageIcon imagen = new ImageIcon("hiro.png");
        JLabel label_2 = new JLabel(imagen);
        panel.add(label_2);
        label_2.setBounds(150,150,200,200);
        label_2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(100,100,Image.SCALE_SMOOTH)));
*/
    }

    private void J_button() {
        //creacion de un boton funciona exactamente igual que los demas
        JButton botoncito = new JButton();//obviamente se pueden inicializar con constructores distintos
        botoncito.setText("Presioname");
        botoncito.setBounds(50, 100, 150, 40); // Ajustar tamaño y posición
        botoncito.setEnabled(true);//boton para permitir dar click
        botoncito.setMnemonic('a');//para activar el comando
        botoncito.setForeground(Color.black);//color de la letra
        botoncito.setFont(new Font("Chalkduster", Font.BOLD, 10));
        botoncito.setBorder(BorderFactory.createLineBorder(Color.BLACK, 10, true));
        panel.add(botoncito);

        //No crearemos otro boton pero agregaremos las posibles funciones de un boton
        //despues de establecer los limites tambien podemos agregar imagenes como fondo
        //sin olvidar que las etiquetas no te dejan cambiar el fondo en algunos casos
        //botoncito.setOpaque(true);
        //botoncito.setBackground(color.black);
        //ImageIcon imagen = new ImageIcon("muestra .png");
        //botoncito.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(100,100,Image.SCALE_SMOOTH)));


    }

    private void J_rad_button() {
        //Creacion de radio button
        JRadioButton op_marcado = new JRadioButton("opcion_1", true);
        op_marcado.setBounds(50, 180, 150, 30); // Ajustar posición
        op_marcado.setEnabled(true); //habilitar o no el boton
        op_marcado.setText("programacion");
        op_marcado.setFont(new Font("Chalkduster", 0, 5));
        panel.add(op_marcado);

        JRadioButton op_marcado_2 = new JRadioButton("opcion_1", false);
        op_marcado_2.setBounds(220, 180, 150, 30); // Alinear a la derecha
        op_marcado_2.setEnabled(true); //habilitar o no el boton
        op_marcado_2.setText("programacion_2");
        op_marcado_2.setFont(new Font("Chalkduster", 0, 5));
        panel.add(op_marcado_2);

        ButtonGroup grupo_botones = new ButtonGroup();
        grupo_botones.add(op_marcado);
        grupo_botones.add(op_marcado_2);
    }

    private void J_toggle_button() {
        JToggleButton boton_d_activacion = new JToggleButton("opcion_1", true);
        boton_d_activacion.setBounds(50, 250, 150, 50); // Ajustar posición y tamaño
        JToggleButton boton_d_activacion_2 = new JToggleButton("opcion_2", false);
        boton_d_activacion_2.setBounds(220, 250, 150, 50); // Ubicar a la derecha

        ButtonGroup grupo_boton_act = new ButtonGroup();
        grupo_boton_act.add(boton_d_activacion);
        grupo_boton_act.add(boton_d_activacion_2);

        panel.add(boton_d_activacion);
        panel.add(boton_d_activacion_2);
    }

    private void J_text_field(){
        JTextField input = new JTextField();
        input.setBounds(50,300,150,70);
        input.setText("Ingresa tu correo");
        //System.out.println("¿Que hay en la caja :?"+input.getText());
        panel.add(input);
    }

    private void J_Area_txt(){
        Area_txt = new JTextArea();
        Area_txt.setBounds(50,400,200,100);
        Area_txt.setText("Hola amigo ");
        Area_txt.append("\nAgregue mas texto wuiii");
        Area_txt.setEditable(true);
        panel.add(Area_txt);
        Scroll_area();

    }

    private void Scroll_area(){
        JScrollPane scrollBar = new JScrollPane(Area_txt);//el constructor puede mod la posicion tambien
        scrollBar.setBounds(50,400,200,100);
        scrollBar.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollBar.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        panel.add(scrollBar);
    }
    //a diferencia del radio button este es mas un tipo listado
    private void Check_box(){
        JCheckBox casilla_seleccion  = new JCheckBox("Seleccioname",false);
        casilla_seleccion.setBounds(50,500,250,100);
        panel.add(casilla_seleccion);
    }

    //estas son listas desplegables
    private void J_combo_box(){
        /*String [] paises = {"Honduras","Mexico","EUA"};

        JComboBox lista_despegable = new JComboBox(paises);
        lista_despegable.setBounds(50,600,250,100);

        lista_despegable.addItem("Argentina");
        lista_despegable.setSelectedItem("Mexico");
        panel.add(lista_despegable);*/

        //Al recibir objetos de arreglos tambien se puede ocupar de manera normal (se creo una clase persona)
        Persona personita_1 = new Persona("Alejandro ","Morales ",18);
        Persona personita_2 = new Persona("Santiago  ","Morales ",20);

        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        JComboBox lista_desplegable = new JComboBox(modelo);

        modelo.addElement(personita_1);
        modelo.addElement(personita_2);

        lista_desplegable.setBounds(50,600,250,100);
        panel.add(lista_desplegable);

    }

    private void J_password (){
        JPasswordField contraseña = new JPasswordField();
        contraseña.setBounds(50,700,250,30);
        contraseña.setText("contraseña");
        panel.add(contraseña);

        String almacenar_contraseña = "";
        for(int i = 0 ; i<contraseña.getPassword().length;i++){
            almacenar_contraseña += contraseña.getPassword()[i];
        }
        System.out.println("Contraseña :"+almacenar_contraseña);
    }

    private void J_table(){
        //para poder hacer uso pues de una tabla necesito implementar el modelo que se encarga de hacerlo
        DefaultTableModel modelo = new DefaultTableModel();


        modelo.addColumn("Nombre:");
        modelo.addColumn("Nacionalidad:");
        modelo.addColumn("Edad:");

        String [] persona_1 ={"Alejandro","Mexicano","18"};
        String [] persona_2 ={"Brenda","Mexicana","18"};
        String [] persona_3 ={"Santiago","Mexicano","20"};


        modelo.addRow(persona_1);
        modelo.addRow(persona_2);
        modelo.addRow(persona_3);

        JTable tabla = new JTable(modelo);
        tabla.setBounds(650,50,250,170);
        panel.add(tabla);

        JScrollPane scrollBar_2 = new JScrollPane(tabla);//el constructor puede mod la posicion tambien
        scrollBar_2.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollBar_2.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollBar_2.setBounds(650,50,250,170);
        panel.add(scrollBar_2);
    }
    //por fin acabe componentes ahora voy a eventos :v
    private void J_list (){
        DefaultListModel modelo = new DefaultListModel();
        modelo.addElement("Seleccion_1");
        modelo.addElement("seleccion_2");
        modelo.addElement("seleccion_3");
        //Hay mas maneras de agregar objetos como creando objetos igual que en el jtable
        JList lista = new JList(modelo);
        lista.setBounds(650,100,250,170);
        lista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        //otra manera de pasar el modelo al objeto lista es  establecerlo:
        //lista.setModel(modelo);
        JScrollPane scrollBar_3 = new JScrollPane(lista);//el constructor puede mod la posicion tambien
        scrollBar_3.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollBar_3.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollBar_3.setBounds(650,400,100,200);
        panel.add(scrollBar_3);

    }


    public static void main(String[] args) {
        //al crear la instancia por defecto al crear el constructor se invocan los metodos
        //por eso no es necesario invocar los metodos
        J_Frame P_main = new J_Frame();
    }
}
