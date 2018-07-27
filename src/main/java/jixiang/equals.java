package jixiang;

public class equals {
    public static void main(String[] args) {
        Employee e1 = new Employee("chenssy", 23);
        Employee e2 = new Employee("chenssy", 24);
        Persons p1 = new Persons("chenssy");
        if(e1 instanceof  Persons){
            System.out.println("el 属于 Persons");
        }else {
            System.out.println("el 不属于Persons");
        }
        if(p1 instanceof  Employee){
            System.out.println("el 属于 Persons");
        }else {
            System.out.println("el 不属于Persons");
        }
        if(p1.getClass() == e1.getClass() ){
            System.out.println("el 属于 Persons");
        }else {
            System.out.println("el 不属于Persons");
        }
        if(e1.getClass() == e2.getClass() ){
            System.out.println("el 与 e2同属于一个类");
        }else {
            System.out.println("el 不属于Persons");
        }
        System.out.println(p1.equals(e1));
        System.out.println(p1.equals(e2));
        System.out.println(e1.equals(p1));
    }
}
class Persons {
    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Persons(String name){
        this.name = name;
    }

    @Override
    public boolean equals(Object object){
        if(object instanceof Person){
            System.out.println("ssss");
            Person p = (Person) object;
            if(p.getName() == null || name == null){

                return false;
            }
            else{
                return name.equalsIgnoreCase(p.getName());
            }

        }
        return false;
    }
}
class Employee extends Persons{
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Employee(String name,int id){
        super(name);
        this.id = id;
    }

    /**
     * 重写equals()方法
     */
    @Override
    public boolean equals(Object object){
        if(object instanceof Employee){
            Employee e = (Employee) object;
            return super.equals(object) && e.getId() == id;
        }
        return false;
    }
}
