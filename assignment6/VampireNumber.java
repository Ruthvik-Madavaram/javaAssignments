package assignment6;

import java.util.ArrayList;



public class VampireNumber {
	
	public static String swapString(String a, int i, int j) {  
        char[] b =a.toCharArray();  
        char ch;  
        ch = b[i];  
        b[i] = b[j];  
        b[j] = ch;  
        return String.valueOf(b);  
    }  
	
	public ArrayList<String> permute(String str, int start,int end,ArrayList<String> allPossibleNums){
	   
        if (start == end - 1) {
            allPossibleNums.add(str);
        }
        else {
        	for (int i = start; i < end; i++) {
                str = swapString(str,start,i);
                permute(str,start+1,end,allPossibleNums);
                str = swapString(str,start,i);
            }
        }
        return allPossibleNums;
    }
	
	public boolean checkVampire(int num1,int num2,int num) {
		if(num1*num2 == num)
			return true;
		return false;
	}
	
	public boolean permuteAndFindVampire(String number) {
		ArrayList<String> permutations = permute(number,0,number.length(),new ArrayList<String>());
		//System.out.println(permutations);
		for(int i = 0; i < permutations.size();i++) {
			String num = permutations.get(i);
			if(num.charAt(0) == '0')
				continue;
			int length = num.length();
			String num1 = num.substring(0, length/2);
			String num2 = num.substring(length/2,length);
			//System.out.println(num1 + "  " + num2 + "  "+ number);
			if(checkVampire(Integer.parseInt(num1),Integer.parseInt(num2),Integer.parseInt(number))) {
				System.out.println(number);
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		VampireNumber vn = new VampireNumber();
		int limit = 100;
		String num = "100";
		while(limit > 0) {
			if(num.length()%2 != 0) {
				int numInteger = Integer.parseInt(num);
				numInteger += 1;
				num = Integer.toString(numInteger);
				//System.out.println(num);
			}
			else {
				if(vn.permuteAndFindVampire(num))
					limit -= 1;
				int numInteger = Integer.parseInt(num);
				numInteger += 1;
				num = Integer.toString(numInteger);
				//System.out.println(num);
			}
		}
	}
}
