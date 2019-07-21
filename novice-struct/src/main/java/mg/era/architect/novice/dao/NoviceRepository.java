package mg.era.architect.novice.dao;

import mg.era.architect.novice.model.NoviceDto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoviceRepository extends CrudRepository<NoviceDto, String> {
}
