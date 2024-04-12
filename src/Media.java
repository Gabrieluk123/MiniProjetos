public class Media {

    public static void main(String[] args){

        double x = 10.5;
        double y = 25.7;

        double media = (x + y) / 2;

        System.out.println(String.format("A média é:%.2f",media));

        double z = 26.8;
        int i = (int) z;

        System.out.println(String.format("Casting da variável:%d",i));

        char letra = 'B';
        String palavra ="UNGAS";
        String mensagem = "A letra é " + letra + " e a palavra é " + palavra;

        System.out.println(mensagem);

        double precoProduto = 55.99;
         int quantidade = 3;
         double valorTotal = (precoProduto * quantidade);
        System.out.println(String.format("O valor total é:%.2f",valorTotal));

        double valorEmDolares = 55.99;
        double conversaoEmReais = (50.99 * 4.94);

        System.out.println(String.format("A conversão de dólar para reais é:%.2f",conversaoEmReais));

                double precoOriginal = 150.0;

                double percentualDesconto = 10.0;
                double valorDesconto = (percentualDesconto / 100.0) * precoOriginal;
                double novoPreco = precoOriginal - valorDesconto;

                System.out.println("Preço original: R$" + precoOriginal);
                System.out.println("Desconto: R$" + valorDesconto);
                System.out.println("Novo preço com desconto: R$" + novoPreco);

    }
}
