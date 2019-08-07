package mg.era.architect.novice.dao;

import mg.era.architect.novice.model.NoviceDto;
import org.springframework.data.repository.CrudRepository;

public interface NoviceRepository extends CrudRepository<NoviceDto, String> {
  public NoviceDto findByNom(String nom);
}
