package kriptolaba1;

import java.util.Scanner;

public class MethodsForDoublePermutationCypher {
    
    private static char[][] keyMas = null;
    private static char [] keyForRows = null;
    private static char [] keyForColumns = null;
    private static char [] cypherText;
    
    public static char[][] InitKeyForRows(char[][] keyMas){
        char [] keyForRows = new char [keyMas.length-1];
        for (int i = 0; i<keyMas.length-1; i++){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите поэлементно ключ из " + keyForRows.length + " знаков для строк");
                char c = sc.next().charAt(0);
                keyForRows[i] = c;
        }
        int temp = 0;
        for (int i=0; i<1; i++){
            for (int j=1; j<keyMas.length; j++){
                keyMas[i][j] = keyForRows[temp];
                temp++;
            }
        }
        return keyMas;
    }
        
    public static char[][] InitKeyForColumns(char[][] keyMas){
        char [] keyForColumns = new char [keyMas.length-1];
        for (int i = 0; i<keyMas.length-1; i++){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите поэлементно ключ из " + keyForColumns.length + " знаков для столбцов");
                char c = sc.next().charAt(0);
                keyForColumns[i] = c;
        }
        int temp=0;
        for (int i=1; i<keyMas.length; i++){
            for (int j=0;j<1;j++){
                keyMas[i][j] = keyForColumns[temp];
                temp++;
            }
        }
        return keyMas;
        
    }
        
    //ввод фразы для шифрования
    public static char[][] InitMatrix (char[][] keyMas){
        
        MethodsForDoublePermutationCypher.InitKeyForRows(keyMas);
        MethodsForDoublePermutationCypher.InitKeyForColumns(keyMas);
        for (int i=1; i<keyMas.length;i++){
            for (int j=1;j<keyMas.length;j++){
                Scanner sc = new Scanner(System.in);
                System.out.println("Введите элемент " + i + "."+ j);
                char c = sc.next().charAt(0);
                keyMas[i][j] = c;
            }
        }
        return keyMas;
    }
    
    //Вывод матрицы 
   public static void ShowMatrix (char[][] keyMas){
        for (int i=0; i<keyMas.length;i++){
            for (int j=0;j<keyMas.length;j++){
                if (j==4){
                System.out.print(keyMas[i][j] + " ");
                System.out.println();
                }
                else {
                System.out.print(keyMas[i][j] + " ");
                }
            }
        }
   }
   
   public static char [][] SortRowsByKey(char [][] keyMas){
        for (int k=0; k<4;k++){
            for (int j=0; j<1; j++){
                for (int i=0; i<4; i++){
                    int code = (int) keyMas[i][j];
                    int code2 = (int) keyMas[i+1][j];
                    if (code > code2){
                        int temp = code;
                        code = code2;
                        code2 = temp;
                        char first = (char) code2;
                        char second = (char) code;
                        keyMas[i][j] = second;
                        keyMas[i+1][j] = first;
                        for (int a=1; a<keyMas.length;a++){
                            char temp2 = keyMas[i][a];
                            keyMas[i][a] = keyMas[i+1][a];
                            keyMas[i+1][a] = temp2;
                        }
                    }
                }
            }
        }
    return keyMas;
    }
    
   public static char [][] SortColumnsByKey(char[][] keyMas){
    for (int k=0; k<4;k++){
            for (int i=0; i<1; i++){
                for (int j=0; j<4; j++){
                    int code = (int) keyMas[i][j];
                    int code2 = (int) keyMas[i][j+1];
                    if (code > code2){
                        int temp = code;
                        code = code2;
                        code2 = temp;
                        char first = (char) code2;
                        char second = (char) code;
                        keyMas[i][j] = second;
                        keyMas[i][j+1] = first;
                        for (int a=1; a<keyMas.length; a++){
                            char temp2 = keyMas[a][j];
                            keyMas[a][j] = keyMas[a][j+1];
                            keyMas[a][j+1] = temp2;
                            
                        }
                    }
                }
            }
        }
    return keyMas;
    }
   
   public static char [] CypherTextResult(char [][] keyMas){
    char [] cypherText =new char[keyMas.length*keyMas.length];
    int temp = 0;
    for (int i = 1; i<keyMas.length; i++){
        for (int j = 1; j<keyMas.length; j++){
            cypherText [i*keyMas.length+j] = keyMas[i][j];
            temp++;
            }
        }
        System.out.print("Зашифрованный текст = ");
        for (int i = 6; i<cypherText.length;i++){
           System.out.print(cypherText[i] + " ");
       } 
       return cypherText;
    }
}

    