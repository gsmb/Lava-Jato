package sistema.lavajato.com.classes;

public class Lavadores extends Funcionario {
    private double pagamento;
    Lavagens lavagens;

    public Lavadores(String nome, String cpf, double salario) {
        super(nome, cpf, salario);

    }

    public double getPagamento() {
        return pagamento;
    }

    public Lavagens getLavagens() {
        return lavagens;
    }

    public void setLavagens(Lavagens lavagens) {
        this.lavagens = lavagens;
    }

    public void setPagamento(double pagamento) {
        this.pagamento = pagamento;
    }

    public void imprimirPagamento() {
        pagamento = super.getSalario() + getLavagens().getComissao();
        System.out.println(pagamento);
    }
}
