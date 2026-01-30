public class Computer implements Comparable<Computer>  {

    private String modello;
    private String processore;
    private int capacitaRAM;

    public Computer(String modello, String processore, int capacitaRAM) {
        this.modello = modello;
        this.processore = processore;
        this.capacitaRAM = capacitaRAM;
    }

    public String getModello() {
        return modello;
    }

    public String getProcessore() {
        return processore;
    }

    public int getCapacitaRAM() {
        return capacitaRAM;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public void setProcessore(String processore) {
        this.processore = processore;
    }

    public void setCapacitaRAM(int capacitaRAM) {
        this.capacitaRAM = capacitaRAM;
    }

    public int compareTo(Computer b) {
            return Integer.compare(this.capacitaRAM, b.capacitaRAM);
        }



    @Override
    public String toString() {
        return "Computer{" + "modello='" + modello + '\'' + ", processore='" + processore + '\'' + ", capacitaRAM=" + capacitaRAM + '}';
    }
}
