package com.apoorv.jpa.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import javax.persistence.*;
import java.util.Date;

/**
 * @author Apoorv Vardhman
 * @Github Apoorv-Vardhman
 * @LinkedIN apoorv-vardhman
 */
@Entity
@Table(
        name = "students",
        uniqueConstraints = {
                @UniqueConstraint(
                        name = "email_unique",
                        columnNames = "email"
                )
        }
)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Student {
    /*
    * in mysql sequence is not supported so it will generate a new table(student_sequence) to handle sequence
    * */
    /*@Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize =1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "student_sequence")*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@JsonIgnore
    private Long id;

    @Column(name = "first_name",length = 100,nullable = false)
    private String firstName;

    @Column(name = "last_name",length = 100,nullable = false)
    private String lastName;

    @Column(name = "email",length = 100,nullable = false)
    private String emailID;

    @CreationTimestamp
    @Column(name = "created_at",nullable = false,updatable = false)
    private Date createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private Date updatedAt;


}
