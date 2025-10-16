public class ServicoDeDesconto {

    public double calcularDesconto(double total) {
        if (total > 200) {
            return total * 0.10;  // 10% de desconto
        } else if (total > 100) {
            return total * 0.05;  // 5% de desconto
        }
        return 0;  // Sem desconto
    }
}
