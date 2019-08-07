package mg.era.architect.novice.model;

import lombok.Data;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

import java.io.Serializable;

@Data
@RedisHash("Novice")
public class NoviceDto implements Serializable {
  private String id;
  @Indexed
  private String nom;
  private String prenom;
  private Integer age;
}
