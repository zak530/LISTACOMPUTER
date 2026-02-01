public class Main{

    public static void main(String[] args){

        Lista lista = new Lista();

        Computer hp = new Computer("HP", "intel core 5",51);
        Computer asus = new Computer("ASUS", "rizen 5",500);
        Computer asuss = new Computer("ASUS", "rizen 5",500);
        Computer asusss = new Computer("ASUS", "rizen 5",500);

        System.out.println(hp.compareTo(asus));


        lista.inserimentoordinato(hp);
        lista.inserimentoordinato(asus);
        lista.inserimentoordinato(asuss);
        lista.inserimentoordinato(asusss);




        Nodo current = lista.getHead();
        while (current != null) {
            System.out.println(current.getComputer());
            current = current.getNext();
        }



    }

}