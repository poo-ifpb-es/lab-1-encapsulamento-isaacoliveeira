public class Circulo {
    private float Raio;
    private float Pi = 3.14159f;

    public Circulo(float Raio) {
        this.Raio = Raio;
    }

    public float getRaio() {
        return this.Raio;
    }

    public float getCircunferencia() {
        return (2 * Pi * Raio);
    }

    public float getArea() {
        return (Pi * this.Raio * this.Raio);
    }

    public void setRaio(float Raio) {
        this.Raio = Raio;
    }

}
