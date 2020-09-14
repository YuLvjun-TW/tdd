
public class Mommifier {
    public void getMommifierString(String str) throws StringIsNullException {
        if(str == null){
            throw new StringIsNullException();
        }
    }

}
