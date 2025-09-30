public class DoubleTo {
    public static void main(String[] args) {
        String test = "123";
        Double answer1 = Double.valueOf(test);
        Double answer2 = Double.parseDouble(test);
        byte b = answer1.byteValue();
        short s = answer1.shortValue();
        int i = answer1.intValue();
        long l = answer1.longValue();
        float f = answer1.floatValue();
        double d = answer1.doubleValue();
        boolean booleanValue = answer1 != 0.0;     
        String a = String.valueOf(answer1);
        char[] c = new char[a.length()];
        System.out.println(answer2);
        String p = Double.toString(3.14);
    }
    
}
