package kh.edu.istad.exercise1.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "instructor_profiles")
public class InstructorProfile {

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
    private String jobTitle;

    @Column(length = 30)
    private String phoneNumber;


}
