class P37{

    public static String maximumOddBinaryNumber(String binaString){
        StringBuilder newBinaString = new StringBuilder();
        int[] binaArr = new int[binaString.length()];
        int oneCounter = 0;
        for(char c : binaString.toCharArray()){
            if(c == '1'){
                oneCounter++;
            }
        }
        if(oneCounter == 1){
            binaArr[binaString.length()-1] = 1;
        }else if(oneCounter > 1){
            for(int i = 0; i < oneCounter-1; i++){
                binaArr[i] = 1;
            }binaArr[binaString.length()-1] = 1;
        }
        for(int nums : binaArr){
            newBinaString.append(nums);
        }
        return newBinaString.toString();

    }
    public static void main(String args[]){
        String binaString = "110101";
        System.out.println(maximumOddBinaryNumber(binaString));
    }
}