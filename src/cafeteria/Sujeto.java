package cafeteria;

public interface Sujeto {
    public void agregarObservador(Observador o);
    public void eliminarObservador(Observador o);
    public void notificarObservadores();
}