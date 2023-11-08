package work02;

import static work01.Utilitor.*;

public class Person {
    private static int nextId = 1;
    private final int id;
    private String firstname;
    private String lastname;

    public Person(String firstname,String lastname) {
        this.firstname = testString(firstname);
        this.lastname = testString(lastname);
        this.id = Person.nextId++;
    }
    public int getId(){
        return id;
    }
    public String getFirstname(){
        return firstname;
    }
    public String getLastname(){
        return lastname;
    }
    public void setFirstname(String firstname){
        this.firstname = testString(firstname);
    }
    public void setLastname(String lastname){
        this.lastname = testString(lastname);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Person(");
        sb.append(id);
        sb.append(",").append(firstname);
        sb.append(",").append(lastname);
        sb.append(')');
        return sb.toString();
    }
    public boolean equals(Person p1){
        var current = this;
        return current == p1;
    }
}

