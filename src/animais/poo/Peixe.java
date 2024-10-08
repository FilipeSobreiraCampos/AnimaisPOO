package animais.poo;

public class Peixe extends AnimalMarinhoAB {

    private int comidaIngerida;
    private int caminhoPercorrido;
    private int horasDormidas;

    public Peixe(String nome, String tipoAnimal, int idade, String habitat, double altura, double peso) {
        super(nome, tipoAnimal, idade, habitat, altura, peso);
        this.comidaIngerida = 0;
        this.caminhoPercorrido = 0;
        this.horasDormidas = 0;
    }

    public int getComidaIngerida() {
        return comidaIngerida;
    }

    public void setComidaIngerida(int comidaIngerida) {
        this.comidaIngerida = comidaIngerida;
    }

    public int getCaminhoPercorrido() {
        return caminhoPercorrido;
    }

    public void setCaminhoPercorrido(int caminhoPercorrido) {
        this.caminhoPercorrido = caminhoPercorrido;
    }

    public int getHorasDormidas() {
        return horasDormidas;
    }

    public void setHorasDormidas(int horasDormidas) {
        this.horasDormidas = horasDormidas;
    }

    @Override
    public void comer(int quantidade) {
        this.comidaIngerida += quantidade;
        System.out.println(nome + " comeu " + quantidade + " gramas.");
    }

    @Override
    public void moverse(int distancia) {
        this.caminhoPercorrido += distancia;
        System.out.println(nome + " nadou " + distancia + " metros.");
    }

    @Override
    public void dormir(int horas) {
        this.horasDormidas += horas;
        System.out.println(nome + " dormiu por " + horas + " horas.");
    }
}
