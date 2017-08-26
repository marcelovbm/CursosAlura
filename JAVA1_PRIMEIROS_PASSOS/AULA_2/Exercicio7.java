class Exercicio7 {
    
    public static void main(String[] args) {
        
        long fatorial = 1;

        for (int i = 1; i <= 20; i++){
            
            fatorial *= i;
            System.out.println(i + "! = " + fatorial);
        }
    }
}