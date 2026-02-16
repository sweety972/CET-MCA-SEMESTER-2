import java.util.Scanner;

public class cpu {
        int price;
        static int memory;
        static String rmanufacturer;

        class Processor {
            int cores;
            String manufacturer;

            void insert(int x, int y, String s)
            {
                price = x;
                cores = y;
                manufacturer = s;
            }
        }

        static class RAM {

            void rinsert(int x, String y)
            {
                memory = x;
                rmanufacturer = y;
            }
        }
        public static void main(String[] args){

            cpu C = new cpu();
            cpu.Processor P = C.new Processor();
            cpu.RAM R = new cpu.RAM();
            
            Scanner sc = new Scanner(System.in);

            System.out.println("enter the price of product");
            int x=sc.nextInt();
            System.out.println("enter the core");
            int y=sc.nextInt();
            System.out.println("enter the manufactucture");
            String s=sc.next();

            P.insert(x, y, s);

            System.out.println("core is "+P.cores);
            System.out.println("price is "+C.price);
            System.out.println("manuifacurer is " +P.manufacturer);

        }

    }

