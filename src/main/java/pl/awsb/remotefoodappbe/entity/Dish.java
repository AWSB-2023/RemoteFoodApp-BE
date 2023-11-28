package pl.awsb.remotefoodappbe.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

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
    @JsonIgnore
    private User user;
    @OneToOne
    private Country country;
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "user_favorites_dish", joinColumns = @JoinColumn(name = "dish_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id"))
    private Set<User> favoritesDish;
}
