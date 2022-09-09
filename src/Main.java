import models.entities.*;

public class Main {
    public static void main(String[] args) {

        Address actual = new Address("Jibek-Jolu", "Bishkek", "Chastnoe", 48757);
        Address registered = new Address("Abdrahmanova", "Bishkek", "chastnoe", 78487);
        Person bob = new Person(1, "Willem Bob", registered, actual);
        Address address = new Address("Mederova", "Bishkek", "chastnoe", 75848);
        Company company = new Company(1, "BMW", address);
        CompanyAccounts compAccount = new CompanyAccounts(1, "Account1", "12345678", company);
        PersonalAccounts persAccount = new PersonalAccounts(1, "Account2", "87654321", bob);
        compAccount.display();
        persAccount.display();
    }
}