package Chapters.C10_Exceptions;

class ex_demo2 {
        public static void main(String args[]) {

                // code that may raise exception
                try {
                        int data = 100 / 0;
                } catch (Exception e) {
                        // System.out.println(e); // both used to trace the Exception in
                        e.printStackTrace();
                        System.out.println("Please dont divide number by zero");
                        // rest code of the program
                        System.out.println("rest of the code...");
                }
        }
}
