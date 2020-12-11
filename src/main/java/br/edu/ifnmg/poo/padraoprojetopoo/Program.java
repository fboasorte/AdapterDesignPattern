package br.edu.ifnmg.poo.padraoprojetopoo;

//Classe de execucao
public class Program {

    public static void main(String[] args) {
        SensorXbox adaptee = new SensorXbox();
        ControlePS target = new ControlePS();

        AdaptadorPSParaXbox adapter = new AdaptadorPSParaXbox(adaptee);

        target.Conectar(adapter);
    }
}
