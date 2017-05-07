package test;



public class Demo {
	
	public static int num = 3;
    public Demo() {
        System.out.println("Hi!");
    }

    public static void main(String[] args) throws Exception {
        Class clazz = Class.forName("test.Demo");
        //Demo demo = (Demo) clazz.newInstance();
        
        Demo demo = new Demo();
        System.out.println(clazz.getField("num").getName());
        
        
    }
}