package mg.era.architect.novice.rest;

import mg.era.architect.novice.model.ResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/novice")
public class NoviceRestController {

    @GetMapping(value = "/health")
    public ResponseEntity<ResponseDto> healthCheck() {
        return new ResponseEntity<>(new ResponseDto(200, "Ressource works"), HttpStatus.OK);
}
}
