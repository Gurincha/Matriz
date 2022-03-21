import java.util.Scanner;
public class Matriz02{
    public static void main(String[] args) {
        
        int [] idade;
        idade = new int[5];


        Scanner sc=new Scanner(System.in);
        for (int cont = 0; cont < idade.length;cont ++){
            System.out.println("digite a idade "+ (cont + 1));  
            idade[cont]=sc.nextInt();
            for (int ida = 0; ida < idade.length;ida ++){

                System.out.println("A idade "+(ida+1)+" é de: " +idade[ida]);
            }
            }
    }
}