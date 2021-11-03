import java.util.Scanner;  // Comando para digitalizar
public class aula07 {
    public static void main(String[] args){
    final int tam = 5;
    char[] gabarito = {'a','a','d','b','c'};
    char[] resposta = new char[tam];
    int nota = 0; 
    Scanner scan = new Scanner(System.in);

       

    /* DIGITANDO A RESPOSTA */

    for(int i =0; i<tam;i++){
        System.out.printf("Digite a resposta %d: ", i);
        resposta[i]=scan.nextLine().charAt(0);

    }


    System.out.printf("Nota do aluno %d", nota);

       /*  RESPOSTA JA FORMALIZADA NO ARRAY 

       resposta[0] = 'a';resposta[1] = 'c';resposta[2] = 'd';resposta[3] = 'a';resposta[4] = 'b';
    for(int i =0; i<tam;i++){
        if(resposta[i]==gabarito[i]){
            nota++;
        }
    } 
    System.out.printf("Nota do aluno %d", nota);*/


    }
}