package sistema.lavajato.com.classes;

public class Servicos {

    public enum TipoServico {

        LAVAGEM_AMERICANA(1, "Lavagem Americana"),
        POLIMENTO_SIMPLES(2, "Lavagem com polimento simples"),
        POLIMENTO_CRISTALIZADO(3, "Polimento Cristalizado");

        private int tipo;
        private String nome;

        TipoServico(int tipo, String nome) {
            this.tipo = tipo;
            this.nome = nome;
        }

        public int getTipo() {
            return tipo;
        }

        public void setTipo(int tipo) {
            this.tipo = tipo;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }
    }

}
