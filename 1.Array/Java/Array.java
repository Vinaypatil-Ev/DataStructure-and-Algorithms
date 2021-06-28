class Array {
    public static <T> void show(T arr[], String msg) {
        System.out.println(msg);
        for (T e : arr) {
            System.out.print(e + " ");
        }
        System.out.println();
    }
    public static void main(String args[]) {        
        //array declaration;
        // datatype arr_name[size] = {values...};

        Integer a[] = {1, 2, 3, 4}; // int array
        //int aa[] = {1, 2, 3, 4};
        Float b[] = {1.3f, 3.f, 2.7f, 2f}; // float array
        //float bb[] = {1.3f, 3.f, 2.7f, 2f};
        Double c[] = {2.44, 9.33, 1.2, 89.9}; // double array
        //double cc[] = {2.44, 9.33, 1.2, 89.9};
        Boolean d[] = {true, false, false, true}; // bool arry
        //boolean dd[] = {true, false, false, true};
        Byte e[] = {1, 3, 4, 5}; // byte array
        //byte ee[] = {1, 3, 4, 5};
        String s[] = {"str1", "str2", "str3"}; // string array

        // Two dimentional array
        Integer m[][] = {{1, 2}, {11, 22}, {11, 33}};

        // Three dimentional array
        Integer mm[][][] = {{{1, 2}, {3, 4}}, {{11, 22}, {33,44}}};

        //static array declaration
        // datatype arr_name[size] = {values...}
        int x[] = {1, 2, 4, 5};

        // Dynamic array initialization
        // datatyp arr_name[size] = new dataytpe[size]
        int y[] = new int[4];


        show(a, "Interger array");
        show(b, "Float array");
        show(c, "Double array");
        show(d, "Boolean array");
        show(e, "Byte array");
        show(s, "String array");
    }
}
