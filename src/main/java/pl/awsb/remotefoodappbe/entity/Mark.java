package pl.awsb.remotefoodappbe.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Mark {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int mark;
    @ManyToOne
    private User user;
    @ManyToOne
    private Dish dish;
}
