package mg.era.architect;

import mg.era.architect.novice.NoviceConfiguration;
import mg.era.architect.novice.dao.NoviceRepository;
import mg.era.architect.novice.model.NoviceDto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.StringUtils;

import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple NoviceApp.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(properties = "classpath:application.properties", classes = {NoviceConfiguration.class})
public class NoviceAppTest {

  @Autowired
  private NoviceRepository noviceRepository;

  /**
   * Rigorous Test :-)
   */
  @Test
  public void shouldAnswerWithTrue() {
    assertTrue(true);
  }

  @Test
  public void repositoryTest() {
    NoviceDto noviceDto = new NoviceDto();
    noviceDto.setNom("rakoto");
    noviceDto.setPrenom("solofo");
    noviceDto.setAge(27);
    NoviceDto save = this.noviceRepository.save(noviceDto);
    assert save != null && !StringUtils.isEmpty(save.getId());
    save = this.noviceRepository.findByNom("rakoto");
    assert save != null && !StringUtils.isEmpty(save.getId());
  }
}
