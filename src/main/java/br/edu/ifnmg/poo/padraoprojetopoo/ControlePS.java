package br.edu.ifnmg.poo.padraoprojetopoo;

//Classe Cliente(Client)
public class ControlePS {
    
    private SensorPS sensorAQueSeConecta;

    public void Conectar(SensorPS sensor) {
        this.sensorAQueSeConecta = sensor;
        sensorAQueSeConecta.conectarPS();
    }
}