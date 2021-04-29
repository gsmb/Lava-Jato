package sistema.lavajato.com.classes;

public enum TipoAutomovel {
    MOTO(1, "Moto"),
    CARRO_UTILITARIO(2, "Carro/Utilitário"),
    CAMIONETES(3, "Camionete"),
    CAMINHAO(4, "Caminhões/Ônibus");

    private int tipo;
    private String nome;

    TipoAutomovel(int tipo, String nome) {
        this.tipo = tipo;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "TipoAutomovel{" +
                "tipo=" + tipo +
                ", nome='" + nome + '\'' +
                '}';
    }

    public int getTipo() {
        return tipo;
    }

    public String getNome() {
        return nome;
    }


}
