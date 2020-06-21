package nix;

import java.util.ArrayList;
import java.util.List;

public class StringBracesBalance {
    public boolean stringChecking(String string){
        System.out.println("String: " +string);
        if(string.isBlank()){
            System.out.println("Correct!");
            return true;
        }
        int roundBraces = 0;
        int squareBraces = 0;
        int figureBraces = 0;
        List<Character> chars = new ArrayList<>();
        for(char elem: string.toCharArray()){
            switch (elem){
                case '(':
                    roundBraces++;
                    break;
                case ')':
                    roundBraces--;
                    if(roundBraces<0){System.out.println("Incorrect!");
                        return false;}
                    break;
                case '[':
                    squareBraces++;
                    break;
                case ']':
                    squareBraces--;
                    if(squareBraces<0){System.out.println("Incorrect!");
                        return false;}
                    break;
                case '{':
                    figureBraces++;
                    break;
                case '}':
                    figureBraces--;
                    if(figureBraces<0){System.out.println("Incorrect!");
                        return false;}
                    break;
            }
        }

        for(char elem: string.toCharArray()){
            if(elem=='('|| elem=='['||elem=='{')
                chars.add(elem);
            else if(elem==')'|| elem==']'||elem=='}'){
                if(chars.size()!=0){
                    if(chars.get(chars.size()-1)== '('&& elem==')') chars.remove(chars.size()-1);
                    else if(chars.get(chars.size()-1)== '['&& elem==']') chars.remove(chars.size()-1);
                    else if(chars.get(chars.size()-1)== '{'&& elem=='}') chars.remove(chars.size()-1);

                }
                else {
                    System.out.println("Incorrect!");
                    return false;
                }


            }
        }

        if(roundBraces==0 && squareBraces==0 && figureBraces==0 && chars.isEmpty()){
            System.out.println("Correct!");
            return true;
        }
        else{
            System.out.println("Incorrect!");
            return false;
        }
    }
}
