package org.escuelaing.arep;

public class Collatz {
    public static void main(String[] args) {
        System.out.println(
                collatzProblem(13)
        );
    }
    public static String collatzProblem(int num){
        String separador = " -> ";
        String resultado = String.valueOf(num) + separador;
        while (num != 1){
            if (num % 2 == 0){
                int aux = num / 2;
                if(aux == 1){
                    resultado += String.valueOf(aux);
                }
                else {
                    resultado += String.valueOf(aux) + separador;
                }
                num = aux;
            } else{
                int aux = 3*num + 1;
                if(aux == 1){
                    resultado += String.valueOf(aux);
                }
                else {
                    resultado += String.valueOf(aux) + separador;
                }
                num = aux;
            }
        }
        return resultado;
    }
    public static String response(int num){
        String res = "{operation: collatzsequence, input: "+ String.valueOf(num) +", output: "+  collatzProblem(num) + "}";
        return res;
    }
}
