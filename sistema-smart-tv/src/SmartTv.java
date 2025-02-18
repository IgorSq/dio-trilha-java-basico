public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        volume ++;
        System.out.println("AUMENTANDO O VOLUME PARA:" + volume);
    }
    public void diminuirVolume(){
        volume --;
        System.out.println("DIMINUINDO O VOLUME PARA:" + volume);
    }
    public void aumanetarCanal(){
        canal ++;
    }
    public void diminuirCanal(){
        canal --;
        
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
}
