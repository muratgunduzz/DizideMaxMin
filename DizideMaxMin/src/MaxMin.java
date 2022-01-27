import java.util.Arrays;
import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        int [] list = {12,455,34,87,8,234,89,234,123,6,42,};

        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        int sayı = inp.nextInt();
        int ilk = list[0];
        int son = list[list.length-1];
        for (int i = 0 ; i < list.length;i++){

            if (sayı < ilk || sayı > son) {
                System.out.println("< 6  |  455 >");
                System.out.println("Yukarda belirtilen aralıkta değer giriniz.");
                return;
            }
        }

        for (int j : list){

            if (sayı == j){
                System.out.println("Verilen dizideki sayılardan farklı bir sayı giriniz.");
                System.out.println(Arrays.toString(list));
            }
        }
        for (int k : list){

            if (sayı < k){
                System.out.println("Max: "+k);
                break;
            }
        }
        for (int l = list.length-1;l >= 0;l--){

            if (sayı > list[l]){
                System.out.println("Min: "+list[l]);
                break;
            }
        }
    }
}
