package firma_metodos;

public class StringManipulator {

    public String trimAndConcat(String a, String b){
        a = a.trim();
        b = b.trim();
        return a.concat(b);

    }

    public Integer getIndexOrNull(String mystring, char b){
        if (mystring.indexOf(b) < 0){
            return null;
        } else {
            return mystring.indexOf(b);
        }
    }

    public Integer getIndexOrNull(String mystring, String b){
        if (!mystring.contains(b)){
            return null;
        } else {
            return mystring.indexOf(b);
        }

    }

    public String concatSubstring(String a, int num1, int num2, String b){
        a = a.substring(num1, num2);
        return a.concat(b);
    }
}
