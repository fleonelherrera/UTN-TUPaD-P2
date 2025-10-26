package pkg08_interfaces_y_excepciones;

public class TarjetaCredito implements PagoConDescuento, Pago {
    private String titular;
    private double montoDisponible;
    
    public TarjetaCredito(String titular, double montoDisponible) {
        this.titular = titular;
        this.montoDisponible = montoDisponible;
    }
    
    @Override
    public double aplicarDescuento(double monto) {
        return monto * 0.90; // 10% DE DESCUENTO
    }
    
    public void ProcesarPago(double monto) {
        montoDisponible = montoDisponible - monto;
    }
}
