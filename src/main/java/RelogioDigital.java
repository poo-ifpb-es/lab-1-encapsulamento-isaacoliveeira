public class RelogioDigital {
    private int hora;
    private int minuto;

    public RelogioDigital() {
        hora = 12;
        minuto = 20;
    }

    public RelogioDigital(int hora, int minuto) {
        this.hora = hora;
        this.minuto = minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getHora() {
        return hora;
    }

    public void tick() {
        this.minuto++;
        if (minuto >= 60) {
            this.hora++;
            this.minuto = 0;
        }
        if (hora >= 24) {
            this.hora = 0;
        }
    }
}
