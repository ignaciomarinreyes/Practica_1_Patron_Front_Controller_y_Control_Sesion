package business;

public class User {
    private String nickname;
    private String password;
    private String name;
    private String surname;
    private Rol rol;
    private Address address;
    private String university;
    private String degree;

    public User(String nickname, String password, String name, String surname, Rol rol, Address address, String university, String degree) {
        this.nickname = nickname;
        this.password = password;
        this.name = name;
        this.surname = surname;
        this.rol = rol;
        this.address = address;
        this.university = university;
        this.degree = degree;
    }
  

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
  
    
}
