package cafeteria;

public class Barista implements Observador {

    @Override
    public void actualizar(int numeroPedido, String estado) {
        System.out.println("[Barista] Pedido #" + numeroPedido
                + " - Estado: " + estado);
    }
}