package Start;

import VistaGrafica.Login; //Ubicacion de la pantalla login

public class CorrerAplicacion {
    public static void main(String[] args){
        System.out.println("Bienvenido");
        Login Iniciar = new Login();//Creamos un el objeto login
        Iniciar.setVisible(true);//Añadimos la caracteristica visible para que se vea
        Iniciar.setLocationRelativeTo(null);
    }
}
