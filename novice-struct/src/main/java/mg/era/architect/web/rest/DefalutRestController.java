package mg.era.architect.web.rest;

import mg.era.architect.novice.model.ResponseDto;
import org.springframework.http.HttpStatus;

public class DefalutRestController {
  protected ResponseDto generateKo() {
    return new ResponseDto(HttpStatus.INTERNAL_SERVER_ERROR.value(), "Une erreur est survenue");
  }

  protected ResponseDto generateOk() {
    return new ResponseDto(HttpStatus.OK.value(), "Opération éfféctué avec succès");
  }
}
