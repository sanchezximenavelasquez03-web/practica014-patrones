package cafeteria;

public class PantallaCliente implements Observador {

    @Override
    public void actualizar(int numeroPedido, String estado) {
        System.out.println("[Pantalla Cliente] Pedido #" + numeroPedido
                + " - Estado: " + estado);
    }
}