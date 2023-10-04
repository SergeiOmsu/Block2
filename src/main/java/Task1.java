public class Task1 {
    public static void main(String[] args) {
        String s = "Hello ";
        int N = 5;
        StringProcessor processor = new StringProcessor();
        s = processor.copyString(s, N);
        System.out.println(s);

        String str = "Hello there, Hello";
        String target = "Hello";
        int k = processor.countString(str, target);
        System.out.println(k);

        str = "It's 1, 2, 3";
        str = processor.replaceString(str);
        System.out.println(str);

        str = "Hello there!";
        str = processor.deleteString(str);
        System.out.println(str);
    }

}
