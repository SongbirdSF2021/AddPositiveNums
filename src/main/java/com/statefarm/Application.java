package com.statefarm;

public class Application {

    public static void main(String[] args) {

        int x = 0;

        for(int j = 0; j < args.length; j++) {
            int num = Integer.parseInt(args[j]);
            //System.out.println(args[j]);

            if(num > 0){
                x += num;
            }
        }
        System.out.println(x);
    }

}
