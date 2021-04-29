package sistema.lavajato.com.classes;

import java.util.Objects;

public class Cliente {
    private String nome;
    private String contato;
    private Automovel automoveis;

    public Cliente(String nome, String contato, Automovel automoveis) {
        this.nome = nome;
        this.contato = contato;
        this.automoveis = automoveis;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", contato='" + contato + '\'' +
                ", automovel='" + automoveis.getModelo() + "'" +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(contato, cliente.contato);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contato);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public Automovel getAutomoveis() {
        return automoveis;
    }
}
