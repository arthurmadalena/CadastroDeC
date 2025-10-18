package dev.JavaTeste.cadastroDe.Users;

import dev.JavaTeste.cadastroDe.Assignments.AssignmentsModel;
import jakarta.persistence.*;




//Entity transforma uma classe comum em uma entidade do DB.


@Entity
@Table(name = "tb_cadastro")

public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userName;

    private String userEmail;

    private String userCity;

    private int userAge;

    @ManyToOne
    @JoinColumn(name = "assignments_id") // Foreign Key ou Chave Estrangeira
    private AssignmentsModel userAssignment;


    public UserModel() {

    }
    public UserModel(String userName, String userEmail, String userCity, int userAge) {
        this.userName = userName;
        this.userEmail = userEmail;
        this.userCity = userCity;
        this.userAge = userAge;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserCity() {
        return userCity;
    }

    public void setUserCity(String userCity) {
        this.userCity = userCity;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
