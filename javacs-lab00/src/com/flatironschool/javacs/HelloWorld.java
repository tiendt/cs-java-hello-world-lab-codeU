package com.flatironschool.javacs;

public class HelloWorld {
    public static Double getVersion() {
        String str = System.getProperty("java.specification.version");
        return Double.parseDouble (str);
    }

    public static void main(String[] args) {
	    Double test = getVersion();
      System.out.println(test);
    }
}
