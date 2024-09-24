package skhu.skhuAdventure.entity;


import jakarta.persistence.*;
import lombok.*;

import java.math.BigInteger;

@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Entity
@Table(name = "image")
public class ImageEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger id;

    private Integer imageNumber;
    private String imageName;
    private String imagePath;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private UsersEntity user;
}