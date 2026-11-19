package kh.edu.istad.exercise1.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "courses")
public class Course {

    private Integer id;
    private Integer countRating;
    private LocalDateTime createdAt;
    private String description;
    private Float discountPercent;
    private Boolean isDeleted;
    private Boolean isPublished;
    private String keyword;
    private String level;
    private BigDecimal price;
    private String slug;
    private Float starRating;
    private String thumbnail;
    private String title;
    private Float totalHours;
    private LocalDateTime updatedAt;
    private Integer categoryId;
    private String instructorId;

}
