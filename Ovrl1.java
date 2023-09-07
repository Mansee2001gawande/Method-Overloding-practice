class A{

}
class B extends A{

}
class C extends B{

}
class Test{
    public static void main(A a){
        System.out.print("one");
    }

        public static void main(B b){
        System.out.print("Two");
    }
        public static void main(Object obj){
        System.out.print("THREE");
    }
    public static void main(String[] args) {
        A a = new A();
        main(a);

        B b=new B();
        main(b);

        C c =new C();
        main(c);

        Object obj=new Object();
        main(obj);


    }
}