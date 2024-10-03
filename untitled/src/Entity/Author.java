package Entity;

public class Author {
    private String name;
    private String email;
    private Gender gender;

    // Overloading Method
    public Author(){;} // instance Author() via new keyword

    public Author(String name, Gender gender, String email) {
        this.name = name;
        this.gender = gender;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

@Override
    public String toString() {
        return "Author{" + "name=" + name + "   email=" + email + "     gender=" + gender + '}';
}
}
