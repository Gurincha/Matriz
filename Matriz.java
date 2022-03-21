public class Matriz{
    public static void main(String[] args) {
        
        int [] idade;
        idade = new int[5];
        idade[4]= 20;
        idade[3]= 21;
        idade[2]= 22;
        idade[1]= 23;
        idade[0]= 24;


        for (int cont = 0; cont < idade.length;cont ++){

        
            System.out.println("idade é de: " +idade[cont]);
        }
    }
}