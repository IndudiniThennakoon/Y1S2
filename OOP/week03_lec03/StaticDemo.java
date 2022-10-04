class StaticDemo {
    static int a = 3;
    static int b;
    // first of atatics are executes.
    static void meth(intx){
        // it will be loaded to the memory but not executes.
        // because this is a method even thought this is a static thing it has to be invorke
       //  methods will not automatically executing. we have to call them

        System.out.println("X : " + x);
        System.out.println("A : " + a);
        System.out.println("b : " + b);

        statict{
            // this is a static block. since this is not a method this will be  executed
            System.out.println("Static block intialized");
            b = a * 4;
        }

        public static void main(String[] args) {
            meth(42);
        }

    }

}
