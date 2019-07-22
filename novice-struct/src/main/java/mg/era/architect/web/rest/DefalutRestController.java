package mg.era.architect.web.rest;

import mg.era.architect.novice.model.ResponseDto;
import mg.era.architect.novice.model.ResponseNoviceDto;
import org.springframework.http.HttpStatus;

public class DefalutRestController {
  protected ResponseDto generateKo() {
    return new ResponseDto(HttpStatus.INTERNAL_SERVER_ERROR.value(), "Une erreur est survenue");
  }

  protected ResponseNoviceDto generateOk() {
    ResponseNoviceDto responseNoviceDto = new ResponseNoviceDto();
    responseNoviceDto.setCode(HttpStatus.OK.value());
    responseNoviceDto.setMessage("Opération éfféctuer avec succès");
    return responseNoviceDto;
  }
}
