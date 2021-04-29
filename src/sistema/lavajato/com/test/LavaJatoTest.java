package sistema.lavajato.com.test;

import sistema.lavajato.com.classes.*;

public class LavaJatoTest {
    public static void main(String[] args) {

        Automovel auto1 = new Automovel("vw","gol g3","jhg-4567",TipoAutomovel.CARRO_UTILITARIO);
        System.out.println(auto1);

        CadastoCliente cada1 = new CadastoCliente("Pedro", "(62)99990-0098",auto1);
        System.out.println(cada1);

    }


}
