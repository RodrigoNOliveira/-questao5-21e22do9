
class App {
    public static void main(String[] args) {
  
      //Scanner scanner = new Scanner(System.in);
      int soma = 0;
      int i;
        for ( i = 0; i <=50*2 ; i+=2){
          if (i%2 ==0){
          soma = i + soma;
          }
        }
  
      System.out.println("A soma dos 50 primeiros numeros pares é de: " + soma);
  
    
    }
  }