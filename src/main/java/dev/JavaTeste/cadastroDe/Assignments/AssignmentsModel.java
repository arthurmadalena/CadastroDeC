package dev.JavaTeste.cadastroDe.Assignments;

import dev.JavaTeste.cadastroDe.Users.UserModel;
import jakarta.persistence.*;

import java.util.List;


@Entity
@Table(name = "tb_assignments")

public class AssignmentsModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String assignmentName;

    private String shortAssignmentDesc;

    private String assignmentStatus;

    @OneToMany(mappedBy = "assignments")
    private List<UserModel> user;


    public AssignmentsModel() {

    }
    public AssignmentsModel(String assignmentName, String shortAssignmentDesc, String assignmentStatus) {
        this.assignmentName = assignmentName;
        this.shortAssignmentDesc = shortAssignmentDesc;
        this.assignmentStatus = assignmentStatus;
    }

    public String getAssignmentName() {
        return assignmentName;
    }

    public void setAssignmentName(String assignmentName) {
        this.assignmentName = assignmentName;
    }

    public String getShortAssignmentDesc() {
        return shortAssignmentDesc;
    }

    public void setShortAssignmentDesc(String shortAssignmentDesc) {
        this.shortAssignmentDesc = shortAssignmentDesc;
    }

    public String getAssignmentStatus() {
        return assignmentStatus;
    }

    public void setAssignmentStatus(String assignmentStatus) {
        this.assignmentStatus = assignmentStatus;
    }

}
