package cafeteria;

public class Caja implements Observador {

    @Override
    public void actualizar(int numeroPedido, String estado) {
        System.out.println("[Caja] Pedido #" + numeroPedido
                + " - Estado: " + estado);
    }
}