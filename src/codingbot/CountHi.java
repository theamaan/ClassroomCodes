package codingbot;
//Return the number of times that the string "hi" appears anywhere in the given string.
public class CountHi {
    public static void main(String[] args) {
        // Test cases
        System.out.println("countHi(\"abc hi ho\") → " + countHi("abc hi ho")); // Expected output: 1
        System.out.println("countHi(\"ABChi hi\") → " + countHi("ABChi hi")); // Expected output: 2
        System.out.println("countHi(\"hihi\") → " + countHi("hihi")); // Expected output: 2
    }
//    public static int countHi(String str) {
//        int count = 0;
//        for (int i = 0; i <str.length()-1; i++){
//            if(str.charAt(i)=='h'&&str.charAt(i+1)=='i'){
//                count++;
//            }
//        }
//        return count;
//    }
    // Another approach
      public static int countHi(String str){
        int count = 0;
          for(int i = 0; i < str.length() - 1; i++){
              if(str.substring(i, i + 2).equals("hi")){
                  count++;
              }
          }
          return count;
      }
}
