public class CarroAluguel {

    private float ValorPorKm;
    private int distanciaPercorrida;
    private boolean Sinistro;
    private boolean carro;
    private float debito;

    public CarroAluguel(float ValorPorKm) {
        this.ValorPorKm = ValorPorKm;
        this.distanciaPercorrida = 0;
        this.Sinistro = false;
        this.carro = true;
        this.debito = 0;
    }

    public void setValorPorKm(float valor) {
        this.ValorPorKm = valor;
    }

    public float getValorPorKm() {
        return ValorPorKm;
    }

    public void setDistanciaPercorrida(int distanciaPercorrida) {
        this.distanciaPercorrida = distanciaPercorrida;
    }

    public float getDistanciaPercorrida() {
        return distanciaPercorrida;
    }

    public void setSinistro(boolean hasSinistro) {
        this.Sinistro = hasSinistro;
    }

    public boolean isHasSinistro() {
        return Sinistro;
    }

    public boolean hasSinistro() {
        return Sinistro;
    }

    public boolean isDisponivel() {
        return carro;
    }

    public float getDebito() {
        if (Sinistro) {
            return (ValorPorKm * distanciaPercorrida) * (1.6f);
        } else {
            return (ValorPorKm * distanciaPercorrida);
        }
    }

    public void pagar() throws CarroDisponivelException {
        if (carro) {
            throw new CarroDisponivelException("O carro está disponivel.");
        }
        distanciaPercorrida = 0;
    }

    public void devolver() throws CarroDisponivelException, CarroNaoPagoException {
        if (isDisponivel()) {
            throw new CarroDisponivelException("O carro está disponível.");
        }
        if (getDebito() > 0) {
            throw new CarroNaoPagoException("O carro não foi pago.");
        }
        carro = true;
        Sinistro = false;
        distanciaPercorrida = 0;
    }

    public void alugar() throws CarroIndisponivelException {
        if (isDisponivel()) {
            carro = false;
        } else {
            throw new CarroIndisponivelException("O carro está indisponível.");
        }
    }
}
