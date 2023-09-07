public class Linha {
    private Ponto inicio;
    private Ponto fim;

    public Linha(Ponto inicio, Ponto fim) {
        this.inicio = inicio;
        this.fim = fim;
    }

    public Ponto getInicio() {
        return this.inicio;
    }

    public void setInicio(Ponto inicio) {
        this.inicio = inicio;
    }

    public Ponto getFim() {
        return this.fim;
    }

    public void setFim(Ponto fim) {
        this.fim = fim;
    }

    public double getComprimento() {

        double difX2 = Math.pow(fim.getX() - inicio.getX(), 2);
        double difY2 = Math.pow(fim.getY() - inicio.getY(), 2);

        return Math.sqrt(difX2 + difY2);
    }
}
