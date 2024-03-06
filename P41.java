class P41{

    public static String convert(String s, int numsRows){
        char[] words = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        int n;
        if(s.length() == 1 && numsRows == 1){
            return s;
        }
        if(numsRows % 2 != 0){
            n = numsRows + 1;
            for(int i = 0; i < numsRows; i++){
                sb.append(words[i]);
                if(i == (numsRows-1)){
                    //int counter = 0;
                    for(int j = (i + (numsRows+1)); j < words.length; j+=(numsRows+1)){
                        sb.append(words[j]);
                    }
                }else{
                    for(int j = i+n; j < words.length; j+=n){
                        sb.append(words[j]);
                    }
                }n /= 2;
               
            }
        }else{
            n = numsRows + 2;
            for(int i = 0; i < numsRows; i++){
                sb.append(words[i]);
                if(i == (numsRows-1) || i == 2){ //<-- final loop
                    if(i == (numsRows-1)){
                        for(int j = i+(numsRows+2); j < words.length; j +=(numsRows+2)){
                            sb.append(words[j]);
                        }
                    }else{
                        int count = 0;
                        for(int j = i; j < words.length; j +=(numsRows+2)){
                            if(count == 1){
                                sb.append(words[j]);
                                sb.append(words[j+2]);
                            }else{
                                sb.append(words[j+2]); //
                                count++;
                            }
                            

                        }
                    }

                }else if(i == 1){ //<-- 2nd loop
                    n /= 2;
                    n += 1;
                    for(int j = i+n; j < words.length; j+=n){
                        sb.append(words[j]);
                        sb.append(words[j+2]);
                        j+=2;
                    }
                }else{
                    for(int j = i+n; j < words.length; j+=n){
                        sb.append(words[j]);
                    }
                }
            }
        }
        
        
        
        
        return sb.toString();
 

    }
    public static void main(String args[]){
        String s = "ILOVEYOUEMILY";
        int numsRows = 3;
        System.out.println(convert(s, numsRows));
    }
}