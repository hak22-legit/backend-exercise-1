package kh.edu.istad.exercise1.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "student_profiles")
public class StudentProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, unique = true)
    private Integer userId;

    @Column(columnDefinition = "TEXT")
    private String biography;

    private String facebookLink;

    private String githubLink;

    @Column(length = 100)
    private String major;

    @Column(length = 30)
    private String phoneNumber;

    @Column(length = 150)
    private String university;
}
