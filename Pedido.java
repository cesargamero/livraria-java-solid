import java.util.List;

public class Pedido {
    private Cliente cliente;
    private List<Livro> livros;

    public Pedido(Cliente cliente, List<Livro> livros) {
        this.cliente = cliente;
        this.livros = livros;
    }

    public double getTotal() {
        return livros.stream().mapToDouble(Livro::getPreco).sum();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<Livro> getLivros() {
        return livros;
    }
}
