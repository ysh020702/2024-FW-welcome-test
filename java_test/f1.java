package java_test;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class f1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int repeat = 3;

    
        ArrayList<Fan> fanList = new ArrayList<>();

        for(int i = 1; i <= repeat; i++){
            String model = scanner.nextLine();
            int price = scanner.nextInt();
            scanner.nextLine();
            fanList.add(new Fan(model, price));
        }

        Collections.sort(fanList,(fan1, fan2) -> Integer.compare(fan1.getPrice(), fan2.getPrice()));

        System.out.println(fanList.get(0).getModel());

        scanner.close();
    }

}

class Fan{
    private String model;
    private int price;

    public Fan(){}
    public Fan(String mod, int pri){
        this.model = mod;
        this.price = pri;
    }

    public String getModel(){
        return model;
    }
    public int getPrice(){
        return price;
    }
    public void setModel(String mod){
        model = mod;
    }
    public void setPrice(int pri){
        price = pri;
    }

}