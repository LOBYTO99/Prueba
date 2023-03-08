package excepciones;

public class Excepciones {

    public static void main(String[] args) {
        // TODO code application logic here
        int numerador = 12;
        int denominador = 0;

        //Excepciones
        /*Sintaxis try catch
        
        try{
            sentencias;
        }catch(Exception variable){
            sentencias;
        }
         */
        try {
            int res = numerador / denominador;
            System.out.println(" La division es: " + res);
        } catch (ArithmeticException e) {
            System.out.println("No puedes dividir entre cero");
        }

    }

}
