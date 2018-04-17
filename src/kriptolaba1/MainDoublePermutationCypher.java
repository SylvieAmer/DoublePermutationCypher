package kriptolaba1;

public class MainDoublePermutationCypher extends MethodsForDoublePermutationCypher {
    public static void main(String[] args) {
        char [][] keyMas = new char[5][5];
      //  char [] keyForRows = new char [keyMas.length-1];
      //  char [] keyForColumns = new char [keyMas.length-1];
        MethodsForDoublePermutationCypher.InitMatrix(keyMas);
        System.out.println("Исходная матрица ключей: ");
        MethodsForDoublePermutationCypher.ShowMatrix(keyMas);
        System.out.println("Отсортированная матрица ключей: ");
        
        // Выводит отсортированную матрицу
        MethodsForDoublePermutationCypher.ShowMatrix
                (MethodsForDoublePermutationCypher.SortColumnsByKey
                     (MethodsForDoublePermutationCypher.SortRowsByKey(keyMas)));
        
        //зашифрованное сообщение
        char[] cypherTextResult = MethodsForDoublePermutationCypher.CypherTextResult(keyMas);
        
        //дешифратор
        // DecryptionForDoublePermutationCypher.CypherTextToMatrix(keyMas, cypherTextResult);
    }  
}


     