public class ArrayIrregular {
    public static void main(String[] args) {
        // Criando um array irregular (3 linhas, mas sem colunas definidas)
        int[][] arrayIrregular = new int[3][];

        // Definindo tamanhos diferentes para cada linha
        arrayIrregular[0] = new int[2]; // linha 0 terá 2 colunas
        arrayIrregular[1] = new int[4]; // linha 1 terá 4 colunas
        arrayIrregular[2] = new int[3]; // linha 2 terá 3 colunas

        // Preenchendo os valores (apenas exemplo: valor = i + j)
        for (int i = 0; i < arrayIrregular.length; i++) {
            for (int j = 0; j < arrayIrregular[i].length; j++) {
                arrayIrregular[i][j] = i + j;
            }
        }

        // Imprimindo o array irregular
        System.out.println("Array Irregular:");
        for (int i = 0; i < arrayIrregular.length; i++) {
            for (int j = 0; j < arrayIrregular[i].length; j++) {
                System.out.print(arrayIrregular[i][j] + " ");
            }
            System.out.println();
        }
    }
}
