package models.entities;

public class CompanyAccounts extends Account {
    private int id;
    public String login;
    private String password;
    private Company company;

    public CompanyAccounts() {
    }

    public CompanyAccounts(int id, String login, String password, Company company) {
        super(id, login, password);
        this.id = id;
        this.login = login;
        this.password = password;
        this.company = company;
    }

    public void display(){
        System.out.println("Id:"+id+
                " Login:"+login+
                " Password:"+password+
                " Id_Company:"+ company.getId()+
                " Name:"+ company.getName()+
                " Address{"+
                " Street:"+ company.getAddress().getStreet()+
                " City:"+ company.getAddress().getCity()+
                " Building:"+ company.getAddress().getBuilding()+
                " Postal_Code:"+ company.getAddress().post+
                " }");
    }

    @Override

    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
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

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
