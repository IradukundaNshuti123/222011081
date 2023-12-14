interface employee{
    public void myinfo();   
}
  class info implements employee{
    public void myinfo(){
        System.out.println("My campony serve difference services");
    }
}
class salary extends info {
    public void wage(){
        System.out.println(700000);
    }
}
class adress extends salary{
    public void location(){
        System.out.println("Karugira");
    }
}
class schedual extends adress{
    public void plan(){
        System.out.println("I will worked at midnight");
    }
}
class team extends schedual {
    public void myteams(){
        System.out.println("team34");
    }
}
class department extends team {
    public void depar(){
        System.out.println("marketing manager");
    }
}
class expirience extends department {
    public void skill(){
        System.out.println("My exprience is 5 years");
    }
}
class insurance extends expirience {
    public void health(){
        System.out.println("prime insures");
    }
}
class testmain{
    public static void main(String[] args) {
        insurance about = new insurance();
        about.health();
        about.skill();
        about.depar();
        about.myteams();
        about.myinfo();
    }
}