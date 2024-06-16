public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();
        System.out.println("A Tv está ligada?: " + smartTv.ligada);
        System.out.println("Em qual canal a tv está? " + smartTv.canal);
        System.out.println("Em qual volume está a tv? " + smartTv.volume);

        smartTv.ligar();
        System.out.println("A tv está? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("A tv está? " + smartTv.ligada);

        smartTv.ligar();
        smartTv.aumentarVolume();
        System.out.println("Aumento o volume da TV: " + smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println("Eu diminuo o volume da TV: " + smartTv.volume);

        smartTv.aumentarCanal();
        System.out.println("Você agora está assistindo o canal: " + smartTv.canal);

        smartTv.diminuirCanal();
        System.out.println("Você agora está assistindo o canal: " + smartTv.canal);

        smartTv.mudarCanal(20);
        System.out.println("Você está assistindo o canal: " + smartTv.canal);
    }
}
