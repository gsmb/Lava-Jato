package sistema.lavajato.com.classes;

public class Gerente extends Funcionario {
    private double plVendas;
    private Lavagens lavagens;


    public Gerente(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    public Gerente(String nome, String cpf, double salario, double plVendas) {
        super(nome, cpf, salario);
        this.plVendas = plVendas;
    }

    public Gerente(String nome, String cpf, double salario, double plVendas, Lavagens lavagens) {
        super(nome, cpf, salario);
        this.plVendas = plVendas;
        this.lavagens = lavagens;
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

    }
}
