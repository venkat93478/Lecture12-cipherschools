package abstraction;

interface M{
    int x = 10;
    void fun();
}

interface N{
    int x = 20;
    void fun();
}

class C implements M,N{
    public void fun(){
        System.out.println("Hello,I'm function in C");
        System.out.println(M.x);
        System.out.println(N.x);
        System.out.println(M.super.hashcode());
        System.out.println(N.super.hashcode());
    }
}

interface O extends M,N{
    void fun();
}

class D implements M,N{
    public void fun(){
        System.out.println("Hello,I'm function in C");
    }
}

class MultipleInheritanceStudy{
    public static void main(String[] args){
        C c = new C();
        c.fun();
    }
}
