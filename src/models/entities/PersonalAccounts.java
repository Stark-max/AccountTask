package models.entities;

public class PersonalAccounts extends Account {
    private int id;
    public String login;
    private String password;
    private Person person;

    public PersonalAccounts() {
    }


    public PersonalAccounts(int id,  String login, String password, Person person) {
        super(id, login, password);
        this.id = id;
        this.login = login;
        this.password = password;
        this.person = person;
    }
    public void display(){

        System.out.println("Id:"+id+
                " Login:"+login+
                " Password:"+password+
                " Id_person:"+person.getId()+
                " Full_name:"+person.getFullName()+
                " Actual_Address{"+
                " Street:"+person.getActualAddress().getStreet()+
                " City:"+person.getActualAddress().getCity()+
                " Building:"+person.getActualAddress().getBuilding()+
                " Postal_Code:"+person.getActualAddress().post+
                " }"+ " Registered_Address{"+
                " Street:"+person.getRegAddress().getStreet()+
                " City:"+person.getRegAddress().getCity()+
                " building:"+person.getRegAddress().getBuilding()+
                " Postal_Code:"+person.getRegAddress().getBuilding()+
                " }");
    }


    @Override
    public String getLogin() {
        return login;
    }

    @Override
    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
