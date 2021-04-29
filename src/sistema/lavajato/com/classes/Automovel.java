package sistema.lavajato.com.classes;

import java.util.Objects;

public class Automovel {
    private String marca;
    private String modelo;
    private String placa;
    private TipoAutomovel tipoAutomovel;

    public Automovel(String marca, String modelo, String placa, TipoAutomovel tipoAutomovel) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.tipoAutomovel = tipoAutomovel;
    }

    @Override
    public String toString() {
        return "Automovel{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", placa='" + placa + '\'' +
                ", tipoAutomovel=" + tipoAutomovel.getNome() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Automovel automovel = (Automovel) o;
        return Objects.equals(placa, automovel.placa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(placa);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }


    public TipoAutomovel getTipoAutomovel() {
        return tipoAutomovel;
    }
}
