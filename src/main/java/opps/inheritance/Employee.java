package opps.inheritance;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    public String name;
    protected String phoneNumber;
    String email;
    private String privateKey;
    public static String organization="Flip";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    public void walk(){
        System.out.println(this.name+" Walking..");
    }

    private void fly(){
        System.out.println(this.name+" flying..");
    }



    public static String getOrganization() {
        return organization;
    }

    public static void setOrganization(String organization) {
        Employee.organization = organization;
    }
}


class Developer extends Employee {
    List<String> skills;
    public Developer(String name,String phoneNumber, String email){
        this.name=name;
        this.phoneNumber=phoneNumber;
        this.email=email;
        this.skills=List.of("Java, Python");
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", skills=" + skills +
                '}';
    }

 /*   public static String getOrganization() {
        return "organization";
    }*/
    public static void main(String[] args) {
       Developer dev= new Developer("Varun","34346464","Email");
        System.out.println(dev);
        System.out.println(Developer.getOrganization());
       // System.out.println(getOrganization());
        System.out.println(organization);
    }

}
