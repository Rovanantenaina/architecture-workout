package mg.era.architect.novice.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public class ResponseNoviceDto extends ResponseDto implements Serializable {
  private NoviceDto noviceDto;
}
