package calculadorasfwit;

/**
 * @author igyar
 */
public class FuncionesCalculadora {
    //atributos
    private double numero1, numero2    ;
    
    //Constructores
    FuncionesCalculadora(){
        
    }
    
    public FuncionesCalculadora(double numero1, double numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
    // Metodos para calculadora
    public double Sumar(double numero1, double numero2) {
        return numero1 + numero2;
    }

    public double  Restar(double numero1, double numero2) {
        return numero1-numero2;
    }

    public double Multiplicar(double numero1, double numero2) {
        return numero1*numero2;
    }

    public double Dividir(double numero1, double numero2) {
        return numero1/numero2;
    }


}
