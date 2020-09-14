
public class Mommifier {
    public String getMommifierString(String str) throws StringIsNullException {
        if(str == null){
            throw new StringIsNullException();
        }

        return str;
    }

}
