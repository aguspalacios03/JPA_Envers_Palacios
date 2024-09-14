package org.example.Entidades;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.io.Serializable;

@Builder
@AllArgsConstructor
@Setter
@Getter
@ToString
@Entity
@Table
@Audited
public class Domicilio implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombreCalle;
    private int numero;
//    @OneToOne(mappedBy = "domicilio")
//    private Cliente cliente;
}
