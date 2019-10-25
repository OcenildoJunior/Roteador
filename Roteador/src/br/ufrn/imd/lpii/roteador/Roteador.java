package br.ufrn.imd.lpii.roteador;

public class Roteador extends DispositivoDeRede implements Roteamento{

    private Roteador roteadorCima;
    private Roteador roteadorBaixo;
    private Roteador roteadorEsquerda;
    private Roteador roteadorDireita;

    public Roteador getRoteadorCima() {
        return roteadorCima;
    }

    public void setRoteadorCima(Roteador roteadorCima) {
        this.roteadorCima = roteadorCima;
    }

    public Roteador getRoteadorBaixo() {
        return roteadorBaixo;
    }

    public void setRoteadorBaixo(Roteador roteadorBaixo) {
        this.roteadorBaixo = roteadorBaixo;
    }

    public Roteador getRoteadorEsquerda() {
        return roteadorEsquerda;
    }

    public void setRoteadorEsquerda(Roteador roteadorEsquerda) {
        this.roteadorEsquerda = roteadorEsquerda;
    }

    public Roteador getRoteadorDireita() {
        return roteadorDireita;
    }

    public void setRoteadorDireita(Roteador roteadorDireita) {
        this.roteadorDireita = roteadorDireita;
    }

    @Override
    public void roteamento(Pacote pacote) {

    }

    public Roteador(String ip, String mac){
        super(ip,mac);
    }

    @Override
    public String toString(){
        return "Ip: "+getIp()+"\n"+"MAC: "+getMac();
    }


    public String conexoes(){
        String conexao = toString() + "\n conexão com: \n";
        if (roteadorBaixo != null) {
            conexao += this.roteadorBaixo.toString()+"\n";
        }
        if (roteadorCima != null) {
            conexao += this.roteadorCima.toString()+"\n";

        }
        if (roteadorEsquerda != null) {
            conexao += this.roteadorEsquerda.toString()+"\n";

        }
        if (roteadorDireita != null) {
            conexao += this.roteadorDireita.toString()+"\n";

        }
        return conexao;
    }
}
