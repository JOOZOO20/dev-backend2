package skhu.skhuAdventure.Dto;

import lombok.Data;

@Data
public class Image {
    private Long id;
    private Long imageNumber;
    private String imageName;
    private String imagePath;
    private String userId;  // 외래키 참조를 위한 필드
}
