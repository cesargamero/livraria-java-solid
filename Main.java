import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Criando livros
        Livro livro1 = new Livro("Java para Iniciantes", "John Doe", 120.0);
        Livro livro2 = new Livro("Desenvolvimento Web", "Jane Doe", 90.0);

        // Criando cliente
        Cliente cliente = new Cliente("Carlos Silva", "carlos@example.com");

        // Criando pedido
        Pedido pedido = new Pedido(cliente, Arrays.asList(livro1, livro2));

        // Criando serviços
        ServicoDeDesconto servicoDeDesconto = new ServicoDeDesconto();
        ServicoDeCompra servicoDeCompra = new ServicoDeCompra(servicoDeDesconto);

        // Realizando compra
        servicoDeCompra.realizarCompra(pedido);
    }
}
