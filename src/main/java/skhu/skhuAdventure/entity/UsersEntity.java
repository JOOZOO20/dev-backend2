package skhu.skhuAdventure.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Entity
@Table(name = "users")
public class UsersEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "password")
    private String password;

    @Column(name = "studentId")
    private String studentId;

    @Column(name = "profileImageName")
    private String profileImageName;

    @Column(name = "profileImagePath")
    private String profileImagePath;

    @Column(name = "userId")
    private String userId;

    @Column(name = "userName")
    private String userName;

    @ManyToOne
    @JoinColumn(name = "major_id", referencedColumnName = "id")
    private MajorEntity major;
}

