package cafeteria;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== TIENDA DE CAFE - PATRON OBSERVER ===\n");

        Pedido pedido = new Pedido(101);
        PantallaCliente pantalla = new PantallaCliente();
        Barista barista = new Barista();
        Caja caja = new Caja();

        pedido.agregarObservador(pantalla);
        pedido.agregarObservador(barista);
        pedido.agregarObservador(caja);

        System.out.println("-- Cambiando estado a: Recibido --");
        pedido.setEstado("Recibido");

        System.out.println("\n-- Cambiando estado a: En preparacion --");
        pedido.setEstado("En preparacion");

        System.out.println("\n-- Cambiando estado a: Listo --");
        pedido.setEstado("Listo");
    }
}