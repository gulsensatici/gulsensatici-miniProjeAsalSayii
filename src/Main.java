
        public class Main {
            public static void main(String[] args) {
                int number =20;
                boolean isPrime=true;
                if(number<2)
                    System.out.println("Geçersiz sayı");

                for(int i=2; i<number; i++){
                    if(number% i==0){
                        isPrime=false;
                    }
                }
                if (isPrime){
                    System.out.println("asaldır");
                }else{
                    System.out.println("Asal değildir");
                }
            }
        }
