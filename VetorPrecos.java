public class VetorPrecos {
    public static void main(String[] args) {
        double[] precos = {1.50, 2.75, 5.00, 3.25};
        double soma = 0;

        // laço para somar os valores
        for (int i = 0; i < precos.length; i++) {
            soma += precos[i];
        }

        // imprime o resultado
        System.out.println("A soma total dos preços é: " + soma);
    }
}