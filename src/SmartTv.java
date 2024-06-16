public class SmartTv {
    boolean ligada;
    int canal;
    int volume;

    public SmartTv() {
        this.ligada = false;
        this.canal = 1;
        this.volume = 10;
    }
    public void ligar() {
        this.ligada = true;
    }

    public void desligar() {
        this.ligada = false;
    }
    public void aumentarVolume() {
        if (this.ligada && this.volume < 100) {
            this.volume++;
        }
    }
    public void diminuirVolume() {
        if (this.ligada && this.volume > 0) {
            this.volume--;
        }
    }
    public void aumentarCanal() {
        if (this.ligada) {
            this.canal++;
        }
    }
    public void diminuirCanal() {
        if (this.ligada && this.canal > 1) {
            this.canal--;
        }
    }
    public void mudarCanal(int novoCanal) {
        if (this.ligada) {
            this.canal = novoCanal;
        }
    }
}
