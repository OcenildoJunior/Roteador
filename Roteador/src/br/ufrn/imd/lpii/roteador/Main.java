package br.ufrn.imd.lpii.roteador;

public class Main {

    public static void main(String[] args) {
        Roteador roteador[][] = new Roteador[3][3];

        String ips[] = new String[9];
        ips[0] = "192.168.0.1";
        ips[1] = "192.168.0.2";
        ips[2] = "192.168.0.3";
        ips[3] = "192.168.0.4";
        ips[4] = "192.168.0.5";
        ips[5] = "192.168.0.6";
        ips[6] = "192.168.0.7";
        ips[7] = "192.168.0.8";
        ips[8] = "192.168.0.9";

        String macs[] = new String[9];
        macs[0] = "10";
        macs[1] = "11";
        macs[2] = "12";
        macs[3] = "13";
        macs[4] = "14";
        macs[5] = "15";
        macs[6] = "16";
        macs[7] = "17";
        macs[8] = "18";

        int c=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                roteador[i][j] = new Roteador(ips[c],macs[c]);
                c++;
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 0) {
                    if (j == 0) {
                        roteador[i][j].setRoteadorBaixo(roteador[1][0]);
                        roteador[i][j].setRoteadorDireita(roteador[0][1]);
                    } else if (j == 1) {
                        roteador[i][j].setRoteadorBaixo(roteador[1][1]);
                        roteador[i][j].setRoteadorDireita(roteador[0][2]);
                        roteador[i][j].setRoteadorEsquerda(roteador[0][0]);
                    } else {
                        roteador[i][j].setRoteadorBaixo(roteador[1][2]);
                        roteador[i][j].setRoteadorEsquerda(roteador[0][1]);
                    }
                } else if (i == 1) {
                    if (j == 0) {
                        roteador[i][j].setRoteadorBaixo(roteador[2][0]);
                        roteador[i][j].setRoteadorDireita(roteador[1][1]);
                        roteador[i][j].setRoteadorCima(roteador[0][0]);
                    } else if (j == 1) {
                        roteador[i][j].setRoteadorBaixo(roteador[2][1]);
                        roteador[i][j].setRoteadorDireita(roteador[1][2]);
                        roteador[i][j].setRoteadorEsquerda(roteador[1][0]);
                        roteador[i][j].setRoteadorCima(roteador[0][1]);
                    } else {
                        roteador[i][j].setRoteadorBaixo(roteador[2][2]);
                        roteador[i][j].setRoteadorCima(roteador[0][2]);
                        roteador[i][j].setRoteadorEsquerda(roteador[1][1]);
                    }
                } else {
                    if (j == 0) {
                        roteador[i][j].setRoteadorCima(roteador[1][0]);
                        roteador[i][j].setRoteadorDireita(roteador[2][1]);
                    } else if (j == 1) {
                        roteador[i][j].setRoteadorDireita(roteador[2][2]);
                        roteador[i][j].setRoteadorCima(roteador[1][1]);
                        roteador[i][j].setRoteadorEsquerda(roteador[2][0]);
                    } else {
                        roteador[i][j].setRoteadorCima(roteador[1][2]);
                        roteador[i][j].setRoteadorEsquerda(roteador[2][1]);
                    }
                }
            }
        }
    }
}
