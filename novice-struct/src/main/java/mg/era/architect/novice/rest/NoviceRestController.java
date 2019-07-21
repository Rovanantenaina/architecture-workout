package mg.era.architect.novice.rest;

import mg.era.architect.novice.model.NoviceDto;
import mg.era.architect.novice.model.ResponseDto;
import mg.era.architect.novice.model.ResponseNoviceDto;
import mg.era.architect.novice.service.NoviceService;
import mg.era.architect.web.rest.DefalutRestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/novice")
public class NoviceRestController extends DefalutRestController {

  private final NoviceService noviceService;

  public NoviceRestController(NoviceService noviceService) {
    this.noviceService = noviceService;
  }

  @PostMapping(value = "/novice")
  public ResponseEntity<ResponseDto> saveNovice(@RequestBody NoviceDto novice) {
    String noviceId = this.noviceService.saveNovice(novice);
    if (noviceId != null) {
      ResponseNoviceDto responseDto = (ResponseNoviceDto) generateOk();
      NoviceDto noviceDto = new NoviceDto();
      noviceDto.setId(noviceId);
      responseDto.setNoviceDto(noviceDto);
      return new ResponseEntity<>(responseDto, HttpStatus.OK);
    }
    return new ResponseEntity<>(generateKo(), HttpStatus.INTERNAL_SERVER_ERROR);
  }

  @GetMapping(value = "/novice/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<ResponseDto> getNovice(@PathVariable String id) {
    NoviceDto novice = this.noviceService.getNovice(id);
    if (novice != null) {
      ResponseNoviceDto responseDto = (ResponseNoviceDto) generateOk();
      responseDto.setNoviceDto(novice);
      return new ResponseEntity<>(responseDto, HttpStatus.OK);
    }
    return new ResponseEntity<>(generateKo(), HttpStatus.INTERNAL_SERVER_ERROR);
  }
}
