package kriptolaba1;

import java.util.Scanner;

public class DecryptionForDoublePermutationCypher extends
        MethodsForDoublePermutationCypher {
    
    public static char[][] CypherTextToMatrix(char [][] keyMas, char [] cypherText){
        int t = 0;
        for (int i = 0; i<keyMas.length; i++){
            for (int j = 0; j< keyMas.length; i++){
                keyMas[i][j] = cypherText[++t];
            }
        }
        return keyMas;
    }
}

