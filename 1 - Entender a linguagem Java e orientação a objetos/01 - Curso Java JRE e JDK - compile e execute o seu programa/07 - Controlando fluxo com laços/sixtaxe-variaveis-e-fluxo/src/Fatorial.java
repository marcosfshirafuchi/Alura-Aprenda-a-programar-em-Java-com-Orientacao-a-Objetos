public class Fatorial {
    public static void main(String[] args) {
        int fatorial = 1;
        for (int i = 0; i <= 10; i++){
            if (i == 0 || i ==1){
                System.out.printf("O fatorial de %d! = %d%n", i,fatorial);
            }else{
                fatorial = fatorial * i;
                System.out.printf("O fatorial de %d! = %d%n", i,fatorial);
            }
        }
    }
}
