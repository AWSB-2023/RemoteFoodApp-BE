package pl.awsb.remotefoodappbe.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Dish {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int prepareTime;
    private String name;
    private String method;
    private String ingredient;
    @Lob
    private Byte[] photo;
    @ManyToOne
    private User user;
    @OneToOne
    private Country country;
    @OneToMany
    private List<Mark> marks;
}
