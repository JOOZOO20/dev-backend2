package skhu.skhuAdventure.Dto;

import lombok.Data;

import java.math.BigInteger;

@Data
public class Users {
    private BigInteger id;
    private String password;
    private String studentId;
    private String profileImageName;
    private String profileImagePath;
    private String userId;
    private String userName;
    private Integer majorId;  // 외래키 참조를 위한 필드
}