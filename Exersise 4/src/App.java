import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        boolean isOn = true;
        Scanner input = new Scanner(System.in);
        int action;
        Vehicle[] data = {
            new Vehicle("Fiat Duna", "12/03/2003", "Car", 4),
            new Vehicle("Standfisher 505", "05/01/2006", "Float", 100),
            new Vehicle("Yamaha Trippy", "10/11/2000", "Motorbike", 2),
            new Vehicle("Chevrolet Camaro", "15/06/2012", "Car", 4),
            new Vehicle("Zanella 33", "21/07/2008", "Motorbike", 2),
            new Vehicle("Standfisher 634", "10/03/2004", "Float", 200),
            new Vehicle("Standfisher 700", "17/08/2000", "Float", 150),
            new Vehicle("Toyota Corola", "21/05/2010", "Car", 4),
            new Vehicle("Audi A4", "18/11/2005", "Car", 4),
            new Vehicle("Standfisher 900", "07/02/2015", "Float", 400),
        };

        try {
            while (isOn) {
                for (int i = 0; i < data.length; i++) {
                    System.out.println((i+1) + ". " + data[i].getName());
                }   
                action = input.nextInt();
                data[(action - 1)].printInfo();
                System.out.println("Insert any  to go back!");
                input.nextInt();
            }
        } catch (Exception e) {
            input.close();
        }
    }

}
