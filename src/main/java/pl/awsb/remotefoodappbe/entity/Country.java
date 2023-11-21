package pl.awsb.remotefoodappbe.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Lob
    private byte[] countryFlagImage;
}
