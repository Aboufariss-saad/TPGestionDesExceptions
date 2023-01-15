package Presentation;
import Metier.*;
public class Application {
    public static void main(String[] args) {
        try {
            EntierNaturel Int = new EntierNaturel(50);
            System.out.println("val = "+ Int.getVal());
            Int.decrementer();
            System.out.println("val = "+ Int.getVal());
            Int.setVal(-10);
        }catch (NombreNegativeException e){
            System.out.printf(e.getMessage());
        }
    }
}