package com.diver.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    private Food food; // hace referencia a la comida

    private int quantity; // cantidad de comida

    private Long totalPrice; // precio total de la comida

    @ElementCollection
    private List<String> ingredients; // lista de ingredientes

}