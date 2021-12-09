package Question2;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class DrivingLicenseApplication {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter date in format YYYY-MM-DD:");
        String str = sc.nextLine();
        LocalDate today = LocalDate.now();
        LocalDate birthday= LocalDate.parse(str);
        Period p = Period.between(birthday,today);

        if (p.getYears() < 16){
            throw new Exception("The age of the applicant is "+ p.getYears() +" which is too early to apply for a driving license");
        }else{
            System.out.print("The age of the applicant is valid to apply for a driving license");
            sc.close();
        }

    }

}
