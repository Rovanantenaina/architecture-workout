package mg.era.architect.web.rest;

import mg.era.architect.novice.model.ResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckRestController {

  @GetMapping(value = "/health")
  public ResponseEntity<ResponseDto> healthCheck() {
    return new ResponseEntity<>(new ResponseDto(200, "Ressource works"), HttpStatus.OK);
  }
}
