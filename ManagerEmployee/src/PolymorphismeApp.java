public class PolymorphismeApp {
    public static void main(String[] args) throws Exception{
    Employee employee = new Employee("fidaa");
    employee.sayHello("pidaa");

    employee = new Manager("fidaa");
    employee.sayHello("pidaa");

    employee = new VicePresident("fidaa");
    employee.sayHello("pidaa");

       
    }

    
    {
        sayHello(new Employee("fidaa"));
        sayHello(new Manager("fidaa"));
        sayHello(new VicePresident("fidaa"));
        
    }

    static void sayHello(Employee employee){
        if (employee instanceof VicePresident ){
            VicePresident vicePresident = (VicePresident) employee ;
            System.out.println("Hello VP"+vicePresident.name);
        }else if (employee instanceof Manager ){
            Manager manager = (Manager) employee ;
            System.out.println("Hello Manager "+manager.name);
        }else {
            System.out.println("Hello"+ employee.name);
        }
    }

}
