class FirstProgram{
    /* Do not modefied
     Author: Mg Hein Ko Ko */
    public static void main(String[] args){
        // Primitive datatype
        byte streetNo = 127;
        short depNo = 20000;
        boolean teacherIsGood = false;
        char maleOrFemale = 'M'; 
        int age = 2147483647;   // -2147483648 to 2147483648
        long landArea = 2147483648L;
        float rulerSize = 127.5F;
        double height = 555.4;

        System.out.println(streetNo);
        System.out.println(depNo);
        System.out.println(teacherIsGood);
        System.out.println(maleOrFemale);
        System.out.println(age);
        System.out.println(landArea);
        System.out.println(rulerSize);
        System.out.println(height);

       // Reference Datatype
          String teacherName = "Tr. hello";
          System.out.println(teacherName);
          System.out.println(teacherName.hashCode());
           String teacherName2 = "Tr. hello";
          System.out.println(teacherName2);
          System.out.println(teacherName2.hashCode());
           System.out.println(teacherName==teacherName2);
           System.out.println(teacherName.equals(teacherName2));
          //Same Value and False Output in String
          System.out.println("------------------------------------------");
          String teacherNameTest = "Tr. hello";
          String teacherNameTest2 = new String(teacherNameTest);
          System.out.println(teacherNameTest.hashCode());
          System.out.println(teacherNameTest2.hashCode());
           System.out.println(teacherNameTest==teacherNameTest2);
          System.out.println(teacherNameTest.hashCode()==teacherNameTest.hashCode());
           System.out.println(teacherNameTest.equals(teacherNameTest2));

    }
}