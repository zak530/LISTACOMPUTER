public class Nodo {



    private Computer computer;
    private Nodo next;


    public Nodo(Computer computer){
        this.computer= computer;
        this.next=null;
    }

    public Nodo() {
        this.computer = null;
        this.next = null;
    }


    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }




    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }



    @Override
    public String toString() {
        return computer.toString();

    }

}
