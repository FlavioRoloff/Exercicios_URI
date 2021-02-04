/*

Escreva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.

Entrada
O arquivo de entrada contém três valores com um dígito após o ponto decimal.

Saída
O arquivo de saída deverá conter 5 linhas de dados. 
Cada linha corresponde a uma das áreas descritas acima, sempre com mensagem correspondente e um espaço entre os dois pontos e o valor. 
O valor calculado deve ser apresentado com 3 dígitos após o ponto decimal.

*/

import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner (System.in);
        
        int A, B, C, D, maior;
        
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        
        D = (A + B + Math.abs(A-B))/2;
        maior = (D + C + Math.abs(D-C))/2;
        System.out.println(maior + " eh o maior\n");
        
	    
        sc.close();
         
    }
 
}
