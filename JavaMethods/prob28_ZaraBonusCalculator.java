public class prob28_ZaraBonusCalculator {

    public static void main(String[] args) {
        int[][] employeeData = generateSalaryAndService(); 
        double[][] updatedData = calculateBonusAndNewSalary(employeeData);
        displaySummary(employeeData, updatedData);
    }

    public static int[][] generateSalaryAndService() {
        int[][] data = new int[10][2];
        for (int i = 0; i < 10; i++) {
            int salary = (int) (Math.random() * 40000 + 10000); 
            int years = (int) (Math.random() * 10 + 1);         
            data[i][0] = salary;
            data[i][1] = years;
        }
        return data;
    }

    public static double[][] calculateBonusAndNewSalary(int[][] empData) {
        double[][] newData = new double[10][2];
        for (int i = 0; i < 10; i++) {
            int salary = empData[i][0];
            int years = empData[i][1];
            double bonus = (years > 5) ? 0.05 * salary : 0.02 * salary;
            newData[i][0] = Math.round(bonus * 100.0) / 100.0; 
            newData[i][1] = Math.round((salary + bonus) * 100.0) / 100.0; 
        }
        return newData;
    }
    public static void displaySummary(int[][] empData, double[][] updatedData) {
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;

        System.out.println("EmpID\tOldSalary\tYears\tBonus\t\tNewSalary");
        System.out.println("----------------------------------------------------------");

        for (int i = 0; i < 10; i++) {
            int oldSalary = empData[i][0];
            int years = empData[i][1];
            double bonus = updatedData[i][0];
            double newSalary = updatedData[i][1];

            System.out.println((i + 1) + "\t" + oldSalary + "\t\t" + years + "\t" + bonus + "\t\t" + newSalary);

            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;
        }

        System.out.println("----------------------------------------------------------");
        System.out.println("Total\t" + (int) totalOldSalary + "\t\t\t" + totalBonus + "\t\t" + (int) totalNewSalary);
    }
}
