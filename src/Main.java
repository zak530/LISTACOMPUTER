public class Main{

    public static void main(String[] args){

        Lista lista = new Lista();

        Computer hp = new Computer("HP", "intel core 5",51);
        Computer asus = new Computer("ASUS", "rizen 5",51);

        System.out.println(hp.compareTo(asus));


        lista.inserimentoordinato(hp);
        lista.inserimentoordinato(hp);




        Nodo current = lista.getHead();
        while (current != null) {
            System.out.println(current.getcomputer());
            current = current.getNext();
        }



    }

}