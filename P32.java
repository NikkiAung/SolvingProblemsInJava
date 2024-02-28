//findingSecMaxSalary
class P32{

    public static int findingSecMaxSalary(int[] salaryArr){
        int maxSalary = 0;
        int secMax = 0;
        for(int i = 0; i < salaryArr.length;i++){
            if(salaryArr[i] > maxSalary){
                secMax = maxSalary;
                maxSalary = salaryArr[i];
            }else{
                if(salaryArr[i] > secMax && salaryArr[i] != secMax){
                    secMax = salaryArr[i];
                }
            }
        }return secMax;

    }
    public static void main(String args[]){
        int[] salary = {4000, 4500, 6000, 1000};
        System.out.println(findingSecMaxSalary(salary));
    }
}