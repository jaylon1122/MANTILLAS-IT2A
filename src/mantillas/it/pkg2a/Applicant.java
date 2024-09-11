
package mantillas.it.pkg2a;


public class Applicant {
 
        String id;
        String name;
        double monthlyIncome;
        int creditScore;
        double existingLoans;

        public Applicant(String id, String name, double monthlyIncome, int creditScore, double existingLoans) {
            this.id = id;
            this.name = name;
            this.monthlyIncome = monthlyIncome;
            this.creditScore = creditScore;
            this.existingLoans = existingLoans;
        }

        @Override
        public String toString() {
            return "ID: " + id + "\tName: " + name + "\tMonthly Income: " + monthlyIncome +
                    "\tCredit Score: " + creditScore + "\tExisting Loans: " + existingLoans;
        }
    }

