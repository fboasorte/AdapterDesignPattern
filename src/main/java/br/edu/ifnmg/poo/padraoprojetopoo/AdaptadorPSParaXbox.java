package br.edu.ifnmg.poo.padraoprojetopoo;

//Classe Adaptadora(Adapter)
class AdaptadorPSParaXbox extends SensorPS{
    
    private SensorXbox adaptee;

    public AdaptadorPSParaXbox(SensorXbox adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void conectarPS(){
        adaptee.conectarXbox();
        System.out.println("Controle PS conectado ao Xbox");
    }
}
