
package mantillas.it.pkg2a;

import java.util.Scanner;

public class MANTILLASIT2A {

  
    public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of applicants: ");
        int numberOfApplicants = scanner.nextInt();
        scanner.nextLine(); 

        Applicant[] applicants = new Applicant[numberOfApplicants];

        for (int i = 0; i < numberOfApplicants; i++) {
            System.out.println("\nEnter details for Applicant " + (i + 1) + ":");

            
            String id;
            boolean idExists;
            do {
                System.out.print("ID: ");
                id = scanner.nextLine();
                idExists = false;
                for (int j = 0; j < i; j++) {
                    if (applicants[j].id.equals(id)) {
                        idExists = true;
                        break;
                    }
                }
                if (idExists) {
                    System.out.println("ID must not be repeated. Please enter a unique ID.");
                }
            } while (idExists);

            System.out.print("Name: ");
            String name = scanner.nextLine();

         
            double monthlyIncome;
            do {
                System.out.print("Monthly Income: ");
                monthlyIncome = scanner.nextDouble();
                if (monthlyIncome < 30000) {
                    System.out.println("Monthly income must be at least 30,000.");
                }
            } while (monthlyIncome < 30000);

       
            int creditScore;
            do {
                System.out.print("Credit Score: ");
                creditScore = scanner.nextInt();
                if (creditScore < 650) {
                    System.out.println("Credit score must be at least 650.");
                }
            } while (creditScore < 650);

         
            double existingLoans;
            do {
                System.out.print("Existing Loans: ");
                existingLoans = scanner.nextDouble();
                if (existingLoans > 500000) {
                    System.out.println("Existing loans must not exceed 500,000.");
                }
            } while (existingLoans > 500000);

            scanner.nextLine(); 

          
            applicants[i] = new Applicant(id, name, monthlyIncome, creditScore, existingLoans);
        }

     
        System.out.println("\nApplication Summary:");
        for (int i = 0; i < numberOfApplicants; i++) {
            System.out.println(applicants[i]);
        }

        scanner.close();
}
        
    }
    
