public interface Pago {
    // atributos...
    // operaciones
}

public interface Enviable {
    // atributos
    public void enviar();
}

public class PagoPaypal implements Pago {
    // atributos
    // operaciones Pago
}

public class Compra {
    private Pago pago;
    private List articulos;

    public Compra(Pago pago, List articulos) {
        this.pago = pago;
        this.articulos = articulos;
    }
}
public class Email implements Enviable {
    // Atributos
    public void enviar() {
        // Operación
    }
}

public class Sms implements Enviable {
    // Atributos
    public void enviar() {
        // Operación
    }
}

public class Notificacion {
    private Enviable enviable;

    public void notificar(Enviable enviable) {
        enviable.enviar();
    }
}
