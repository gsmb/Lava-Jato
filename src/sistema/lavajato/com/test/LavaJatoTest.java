package sistema.lavajato.com.test;

import sistema.lavajato.com.classes.Gerente;
import sistema.lavajato.com.classes.Lavadores;
import sistema.lavajato.com.classes.Lavagens;

public class LavaJatoTest {
    public static void main(String[] args) {
        Lavadores lavador = new Lavadores("Pablo", "778.998.009-00", 1100);
        Lavagens lavagens = new Lavagens(5, 10, lavador);
        System.out.println(lavador);
        lavagens.calcularLavadores();
        System.out.println("-----------------------------------------");
        Gerente gerente = new Gerente("Jonas", "876.445.321-98", 2000);
        System.out.println(gerente);
        gerente.imprimirPagamento();



    }
}
