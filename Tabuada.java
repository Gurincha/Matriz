public class Tabuada {
    public static void main(String[] args) {
        
        int [] idade;
        idade = new int[11];


        for (int cont = 0; cont < idade.length;cont ++){
            idade[cont] = cont*10;
        }
        //for (int = cont:idade) funciona igual o for ->
        //System.out.println(cont);
        for (int cont = 0; cont < idade.length;cont ++){

            System.out.println(idade[cont]);
        }
    }
}

