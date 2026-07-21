package cafeteria;

import java.util.ArrayList;
import java.util.List;

public class Pedido implements Sujeto {
    private int numeroPedido;
    private String estado;
    private List<Observador> observadores = new ArrayList<>();

    public Pedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    @Override
    public void agregarObservador(Observador o) {
        observadores.add(o);
    }

    @Override
    public void eliminarObservador(Observador o) {
        observadores.remove(o);
    }

    @Override
    public void notificarObservadores() {
        for (Observador o : observadores) {
            o.actualizar(numeroPedido, estado);
        }
    }

    public void setEstado(String estado) {
        this.estado = estado;
        notificarObservadores();
    }

    public String getEstado()      { return estado; }
    public int getNumeroPedido()   { return numeroPedido; }
}