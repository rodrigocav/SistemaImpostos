public class PIS implements Imposto {
    private double debito;
    private double credito;
    private final double aliquota = 0.0165; // 1,65%

    public PIS(double debito, double credito) {
        this.debito = debito;
        this.credito = credito;
    }

    public double getDebito() {
        return debito;
    }

    public void setDebito(double debito) {
        this.debito = debito;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    @Override
    public double calcularImposto() {
        return (debito - credito) * aliquota;
    }

    @Override
    public String getDescricao() {
        return "PIS";
    }
}
