package com.example.project.entities;

import com.example.project.enums.Rubros;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.SQLDelete;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Setter
@Getter
@SQLDelete(sql = "UPDATE prestador SET deleted = true, deleted_at = CURRENT_TIMESTAMP WHERE id=?")
public class Prestador implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombre;
    private String apellido;
    private String email;
    private String password;
    private int telefono;
    private int cantServicios;
    private String descricion;

    @ManyToOne
    private Zona zona;

    @Enumerated(EnumType.STRING)
    private Rubros rubro;

    private int valoracion;

    @ManyToOne
    private Foto foto;

    @CreatedDate
    private LocalDateTime createdAt;
    @LastModifiedDate
    private LocalDateTime modifiedAt;
    private LocalDateTime deletedAt;
    private Boolean deleted = false;
}
