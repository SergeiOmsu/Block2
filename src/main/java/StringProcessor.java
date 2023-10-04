public class StringProcessor {
    public String copyString(String s, int N) {
        if (N < 0) {
            throw new IllegalArgumentException("N must be >= 0");
        } else if (N == 0) {
            return "";
        } else {
            s = s.repeat(N);
            return s;
        }
    }

    public int countString(String str, String target) {
        if (target == null || target.equals("")) {
            throw new IllegalArgumentException("You need string");
        } else {
            return (str.length() - str.replace(target, "").length()) / target.length();
        }
    }

    public String replaceString(String str){
        str = str.replaceAll("1", "один");
        str = str.replaceAll("2", "два");
        str = str.replaceAll("3", "три");
        return str;
    }

    public String deleteString(String str){
        StringBuilder stb = new StringBuilder(str);
        int i = 1;
        while (i < stb.length()){
            stb.deleteCharAt(i);
            i++;
        }
        str = stb.toString();
        return str;
    }
}
