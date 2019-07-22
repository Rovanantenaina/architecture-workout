package mg.era.architect.novice.service;

import mg.era.architect.novice.dao.NoviceRepository;
import mg.era.architect.novice.model.NoviceDto;
import org.springframework.stereotype.Service;

@Service
public class NoviceService {

  private final NoviceRepository noviceRepository;

  public NoviceService(NoviceRepository noviceRepository) {
    this.noviceRepository = noviceRepository;
  }

  public String saveNovice(NoviceDto novice) {
    NoviceDto savedNovice = this.noviceRepository.save(novice);
    return savedNovice.getId();
  }

  public NoviceDto getNovice(String id) {
    return this.noviceRepository.findById(id).orElse(new NoviceDto());
  }
}
