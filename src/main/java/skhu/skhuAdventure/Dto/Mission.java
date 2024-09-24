package skhu.skhuAdventure.Dto;

import lombok.Data;

@Data
public class Mission {
    private Long id;
    private String userId;  // 외래키 참조를 위한 필드
    private Integer buildingId;  // 외래키 참조를 위한 필드
    private Integer complete;
}