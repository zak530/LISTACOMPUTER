public class Main{

    public static void main(String[] args){

        Lista lista = new Lista();

        Computer hp = new Computer("HP", "intel core 5",256);
        Computer asus = new Computer("ASUS", "rizen 5",512);

        System.out.println(hp.compareTo(asus));


        lista.inserimentoordinato();


    }

}