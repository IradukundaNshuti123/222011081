interface customers{
    public void mycop();
}
class cop implements customers{
    public void mycop(){
System.out.println("MY business serve difference service");
    }
}
class cost extends cop{
    public void price(){
        System.out.println("100000");
    }
}
class adress extends cost{
    public void location(){
        System.out.println("Kimihurura");
    }
}
class testmain{
    public static void main(string args[]){
        adress tip=new adress();
        tip.location();
        tip.location();
        tip.price();
        tip.mycop();
    }
}