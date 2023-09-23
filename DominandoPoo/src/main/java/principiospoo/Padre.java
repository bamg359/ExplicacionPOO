package principiospoo;

import java.util.Scanner;

public class Padre extends Familia {

    Scanner sc = new Scanner(System.in);


    private String ocupacion;

    //Constructores

   public Padre(String apellidoPadre){
       this.apellidoPadre = apellidoPadre;
   }


    //Getter and Setter

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }


    // Metodo

    public void crearPadre(){

        System.out.println("Dé un nombre al padre: ");
        nombrePadre = sc.nextLine();

    }

    public void verPadre(){

        System.out.println("NOmbre del padres:" + nombrePadre);
    }






}
