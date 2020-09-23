public class CharFrequency {


    public static void main(String[] args) {
        testFrequency();
    }
      
    public static int frequency(char[] x, char c) {
        if( x == null) {
            throw new  NullPointerException();
        }
        int n = 0;
        for(int i=0; i < x.length; i++) {
            if(x[i] == c) {
                n++;
            }
        }
        return n;
    }

    public static void testFrequency() {
        char[] test = {'a','p','p','l','e'};
        assert frequency(test, 'p') == 2 : "Valid";
        System.out.println("z " + "occurs in apple : 
                " + frequency(test, 'z') +" times");
    }
}
