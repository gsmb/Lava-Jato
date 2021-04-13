package sistema.lavajato.com.classes;

public class Gerente extends Funcionario {
    private double plVendas;
    private Lavagens lavagens;
    Lavadores lavadores;

    public Gerente(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    public Gerente(String nome, String cpf, double salario, double plVendas) {
        super(nome, cpf, salario);
        this.plVendas = plVendas;
    }

    public Gerente(String nome, String cpf, double salario, double plVendas, Lavagens lavagens, Lavadores lavadores) {
        super(nome, cpf, salario);
        this.plVendas = plVendas;
        this.lavagens = lavagens;
        this.lavadores = lavadores;
    }

    public Lavadores getLavadores() {
        return lavadores;
    }

    public void setLavadores(Lavadores lavadores) {
        this.lavadores = lavadores;
    }

    public Lavagens getLavagens() {
        return lavagens;
    }

    public void setLavagens(Lavagens lavagens) {
        this.lavagens = lavagens;
    }

    public double getPlVendas() {
        return plVendas;
    }

    public void setPlVendas(double plVendas) {
        this.plVendas = plVendas;
    }

    public void imprimirPagamento() {
        plVendas = (getSalario() + lavagens.getTotalLavagem()) * 0.3;
        double salariofinal = plVendas + getSalario();

        System.out.println("Gerente{" +
                "quantidade= " + lavagens.getQtd() +
                ", lavadores= " + lavadores.getNome() + "," +
                ", Total valor= " + lavagens.getTotalLavagem() +
                ", comissao= " + plVendas +
                ", Total R$" + salariofinal
                + '}');
    }


}
