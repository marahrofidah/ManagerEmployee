class Manager extends Employee {
    String company;

    Manager(String name){
       super(name);

    }

    Manager(String name, String company){
        super(name);
        this.company = company;
    }

    void sayHello(String name) throws Exception {
        System.out.println("Hello "+ name+", My name is manager"+this.name);
    }


}