package day1;

public class ex2 {
    public static void main(String[] args){

        int iNum = 10;
        float fNum = 12.34f;
        double dNum = 56.78;
        char cStr = 'a';
        String ary = "Hello World";
        boolean bVar = true;

        // int
        System.out.printf("%d\n", iNum);
        System.out.printf("%10d\n", iNum);
        System.out.printf("%-10d\n", iNum);
        System.out.printf("%010d\n", iNum);
        System.out.printf("%o\n", iNum);
        System.out.printf("%x\n", iNum);
        System.out.printf("%X\n", iNum);
        System.out.printf("%n");
        System.out.println();

        //float
        System.out.printf("%f\n", dNum);
        System.out.printf("%.2f\n", dNum);
        System.out.printf("%.8f\n", dNum);
        System.out.printf("%5.2f\n", dNum);
        System.out.printf("%-5.2f\n", dNum);
        System.out.printf("%e\n", fNum);
        System.out.printf("%E\n", fNum);
        System.out.printf("%30.3e\n", fNum);
        System.out.printf("%30.3E\n", fNum);
        System.out.println();

        // char
        System.out.printf("%c\n", cStr);
        System.out.printf("%C\n", cStr);
        System.out.printf("%30c\n", cStr);
        System.out.printf("%30C\n", cStr);

        // String
        System.out.printf("%s\n",ary);
        System.out.printf("%S\n", ary);
        System.out.printf("%30s\n", ary);
        System.out.printf("%30S\n", ary);
        System.out.println();

        // boolean
        System.out.printf("%b\n",bVar);
        System.out.printf("%B\n", bVar);
        System.out.printf("%30b\n", bVar);
        System.out.printf("%30B\n", bVar);
        System.out.println();

        // literal
        System.out.printf("%d\n",8368);
        System.out.printf("%f\n", 83.68);
        System.out.printf("%c\n", 'c');
        System.out.printf("%s\n", "array");
        System.out.printf("%b\n",true);
        System.out.println();

        // err case
        System.out.printf("%d\n", ary);

        System.out.printf("%a\n",iNum);
        System.out.printf("%g\n",iNum);
        System.out.printf("%h\n",iNum);


    }
}
