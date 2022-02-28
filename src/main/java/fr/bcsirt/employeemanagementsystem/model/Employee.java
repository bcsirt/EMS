package fr.bcsirt.employeemanagementsystem.model;

import lombok.*;

import javax.persistence.*;

@Data // Getter , Setter, Constructor, toString, EqualsAndHashCode
@Builder
@NoArgsConstructor // Empty constructor
@AllArgsConstructor
@Entity
@Table(name ="employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "email")
    private String email;
}
