package com.example.project.entities;

import com.example.project.enums.Roles;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.SQLDelete;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@SQLDelete(sql = "UPDATE usuario SET deleted = true, deleted_at = CURRENT_TIMESTAMP WHERE id=?")
public class Usuario implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido;
    private String email;
    private int telefono;
    private String password;
    private boolean habilitado;

    @Enumerated(EnumType.STRING)
    private Roles rol;

    @ManyToOne
    private Zona zona;

    @CreatedDate
    private LocalDateTime createdAt;
    @LastModifiedDate
    private LocalDateTime modifiedAt;
    private LocalDateTime deletedAt;
    private Boolean deleted = false;
}
