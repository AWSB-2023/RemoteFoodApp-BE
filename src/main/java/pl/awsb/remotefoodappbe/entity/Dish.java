package pl.awsb.remotefoodappbe.entity;

import lombok.Data;

import javax.persistence.*;

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
}
