//this activity is mainly to explain multi-level innertance
//parent class
class Animal{
    void eat(){ 
        System.out.println("eating...Animal class...eat method");
    }
}
//child class
class Lion extends animal{
    void roar(){
        System.out.println("Roar...Lion class...roar method")
         }
}
//child of child
class Babylion extends Lion{
    void weep(){
        System.out.println("weeping...Babylion class...weep method");
    }
}

class Main{
    public static void main(String args[]){
        BabyLion obj=new BabyLion();//object of child of child class
        obj.weep();
        obj.roar();
        obj.eat();
    }
}