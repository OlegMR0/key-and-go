package com.example.keyandgo.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.SQLDelete;

@Data
@SQLDelete(sql = "UPDATE ? SET is_deleted = true WHERE id = ?")
@Table(name = "users")
@Entity
public class User extends BaseEntity {

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false, length = 60)
    private String password;

    @Column(nullable = false, unique = true)
    private String email;

}
