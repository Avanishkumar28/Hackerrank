package av.app.zooplus;

public class TelephoneNumberProblem {

public static void main(String[] args) {
        
        System.out.println(solution("00-44  48 5555 8361"));
        System.out.println(solution("0 - 22 1985--324"));
        System.out.println(solution("555372654"));
    }
    
    public static String solution(String s){
        s = s.replaceAll(" ", "").replaceAll("-", "");
        String[] sArray = s.split("");
        StringBuilder result = new StringBuilder();
        int count = 0;
        boolean flag = false;
        for(String ss : sArray){
            
            if(count!= 0 && count%3==0){
                result.append("-");
                if(sArray.length-count == 4){
                    count = 0;
                    flag = true;
                }
            }else if(count%2==0 && flag){
                result.append("-");
                count = 0;
            }
             
            result.append(ss);
            count ++;
            
        }    
        return result.toString();
    }
}
