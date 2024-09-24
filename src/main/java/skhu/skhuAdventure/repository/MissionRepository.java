package skhu.skhuAdventure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import skhu.skhuAdventure.entity.MissionEntity;
import skhu.skhuAdventure.entity.UsersEntity;
import skhu.skhuAdventure.entity.BuildingEntity;

import java.util.List;

@Repository
public interface MissionRepository extends JpaRepository<MissionEntity, Long> {
    List<MissionEntity> findByUser(UsersEntity user);
    MissionEntity findByUserAndBuilding(UsersEntity user, BuildingEntity building);
}