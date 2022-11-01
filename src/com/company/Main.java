package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	 double kdvOran;
      Scanner scanner = new Scanner(System.in);
        System.out.println("ucret oranini giriniz:");
        double tutar=scanner.nextDouble();
        if(tutar>=0&&tutar<=1000)
        {
             kdvOran=0.18;
            double kdvTutar=tutar*kdvOran;
            double kdvliTutar=tutar+kdvTutar;
            System.out.println("tutar"+tutar);
            System.out.println("KDV orani:"+kdvOran);
            System.out.println("KDV tutari:"+kdvTutar);
            System.out.println("KDVLI tutari:"+kdvliTutar);

        }
        else if(tutar>1000){
            kdvOran=0.08;
            double kdvTutar=tutar*kdvOran;
            double kdvliTutar=tutar+kdvTutar;
            System.out.println("tutar"+tutar);
            System.out.println("KDV orani:"+kdvOran);
            System.out.println("KDV tutari:"+kdvTutar);
            System.out.println("KDVLI tutari:"+kdvliTutar);

        }





    }
}
