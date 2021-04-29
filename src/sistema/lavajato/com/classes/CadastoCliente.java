package sistema.lavajato.com.classes;

public class CadastoCliente extends Cliente {
    private Automovel automoveis;

    public CadastoCliente(String nome, String contato, Automovel automoveis) {
        super(nome, contato, automoveis);

    }

    public Automovel getAutomoveis() {
        return automoveis;
    }
}
