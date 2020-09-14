
public class Mommifier {
    public String getMommifierString(String str) throws StringIsNullException {
        final String INSERT_STRING = "mommy";
        if(str == null){
            throw new StringIsNullException();
        }
        if(!str.isEmpty() && isVowelsMoreThanThirtyPercent(str)){
            String result = getInsertStringBetweenContinuousVowel(str, INSERT_STRING);
            if (result.length()>str.length()){
                return result;
            }
        }
        return str;
    }

    private String getInsertStringBetweenContinuousVowel(String str, String insertString) {
        StringBuilder result = new StringBuilder(String.valueOf(str.charAt(0)));
        for(int i=1; i < str.length(); i++){
            if(str.charAt(i-1) == str.charAt(i) && isVowel(str.charAt(i))){
                result.append(insertString);
            }
            result.append(String.valueOf(str.charAt(i)));
        }
        return result.toString();
    }
    public boolean isVowelsMoreThanThirtyPercent(String str){
        int vowelCount = 0;
        int strLen = str.length();
        char[] strArray = str.toCharArray();
        for(int i=0; i < str.length(); i++){
            if(isVowel(strArray[i])){
                vowelCount++;
            }
        }
        return vowelCount > strLen*0.3? true:false;
    }
    public boolean isVowel(Character ch){
        if(ch == 'a'|| ch =='e'|| ch =='i'|| ch =='o'|| ch =='u')
            return true;
        return false;
    }

}
