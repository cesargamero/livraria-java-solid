public class ServicoDeCompra {

    private ServicoDeDesconto servicoDeDesconto;

    public ServicoDeCompra(ServicoDeDesconto servicoDeDesconto) {
        this.servicoDeDesconto = servicoDeDesconto;
    }

    public void realizarCompra(Pedido pedido) {
        double total = pedido.getTotal();
        double desconto = servicoDeDesconto.calcularDesconto(total);
        double totalComDesconto = total - desconto;

        System.out.println("Pedido realizado com sucesso!");
        System.out.println("Cliente: " + pedido.getCliente().getNome());
        System.out.println("Total sem desconto: R$ " + total);
        System.out.println("Desconto aplicado: R$ " + desconto);
        System.out.println("Total com desconto: R$ " + totalComDesconto);
    }
}
