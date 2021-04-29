package sistema.lavajato.com.classes;

import java.util.Objects;

public class Lavagens implements Calculavel {
    private int qtd;
    private double valorPorLavagem;
    private double totalLavagem;
    private double comissao;
    Lavadores lavadores;
    Gerente gerente;


    public Lavagens(int qtd, double valor, Lavadores lavadores) {
        this.qtd = qtd;
        this.valorPorLavagem = valor;
        this.lavadores = lavadores;
    }

    public Lavagens(double totalLavagem, Lavadores lavadores, Gerente gerente) {
        this.totalLavagem = totalLavagem;
        this.lavadores = lavadores;
        this.gerente = gerente;
    }

    public Lavagens(double totalLavagem) {
        this.totalLavagem = totalLavagem;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lavagens lavagens = (Lavagens) o;
        return qtd == lavagens.qtd && Double.compare(lavagens.valorPorLavagem, valorPorLavagem) == 0 && Double.compare(lavagens.comissao, comissao) == 0 && Objects.equals(lavadores, lavagens.lavadores);
    }

    @Override
    public int hashCode() {
        return Objects.hash(qtd, valorPorLavagem, comissao, lavadores);
    }

    public double getTotalLavagem() {
        return totalLavagem;
    }

    public void setTotalLavagem(double totalLavagem) {
        this.totalLavagem = totalLavagem;
    }

    public double getValorPorLavagem() {
        return valorPorLavagem;
    }

    public void setValorPorLavagem(double valorPorLavagem) {
        this.valorPorLavagem = valorPorLavagem;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public Lavadores getLavadores() {
        return lavadores;
    }

    public void setLavadores(Lavadores lavadores) {
        this.lavadores = lavadores;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

    @Override
    public void calcularLavadores() {
        comissao = (valorPorLavagem * qtd) * 0.1;
        double total = comissao + lavadores.getSalario();
        System.out.println("Lavagens{" +
                "quantidade= " + qtd +
                ", valor= " + valorPorLavagem +
                ", comissao= " + comissao +
                ", lavador= " + lavadores.getNome() + "," +
                "Total R$" + total + '}');

    }
    @Override
    public void calcularGerente() {
        totalLavagem = qtd * valorPorLavagem;
        comissao = gerente.getSalario() + totalLavagem * 0.3;
        System.out.println(
                "Gerente{" + gerente.getNome() +
                "quantidade= " + qtd +
                ", Total valor= " + totalLavagem +
                ", comissao= " + totalLavagem +
                ", Total R$" + comissao + '}');
    }
}
