package mg.era.architect.web.rest;

import mg.era.architect.novice.model.ResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckRestController extends DefalutRestController {

  @GetMapping(value = "/health")
  public ResponseEntity<ResponseDto> healthCheck() {
    return new ResponseEntity<>(generateOk(), HttpStatus.OK);
  }
}
