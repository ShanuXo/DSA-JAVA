public class pallind {
    public static void main(String args[]) {
        String s = "aba";
        String result = "";
        int n = s.length();
        char ch;
        for (int i = 0; i < n; i++) {
            ch = s.charAt(i);
            result = ch + result;
            ;
        }
        System.out.println("Pallindrome string :  " + result);
    }

}
// public static void main(String[] args) {
// String s=new String("madam");
// int n=s.length();
// int i;
// System.out.println(pallin(0,s));
// }
// public static boolean pallin(int i,String str){
// int n=str.length();
// if(i>=n/2){
// return true;
// }
// if(str.charAt(i) != str.charAt(n-i-1)){
// return false;
// }

// return pallin(i+1,str);
// }