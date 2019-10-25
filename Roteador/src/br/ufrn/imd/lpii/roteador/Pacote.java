package br.ufrn.imd.lpii.roteador;

public class Pacote {
    private String dados;
    private Roteador destino;

    public String getDados() {
        return dados;
    }
    public void setDados(String dados) {
        this.dados = dados;
    }
    public Roteador getDestino() {
        return destino;
    }
    public void setDestino(Roteador destino) {
        this.destino = destino;
    }
}
