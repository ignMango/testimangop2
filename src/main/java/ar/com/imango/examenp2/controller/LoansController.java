package ar.com.imango.examenp2.controller;

import ar.com.imango.examenp2.repository.LoansRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class LoansController {

    @Autowired
    private LoansRepository repository;

    @GetMapping("/loans")
    public ResponseEntity<?> getLoans(
                                    @RequestParam(name = "limit") Integer limit,
                                    @RequestParam(name = "offset") Integer offset,
                                    @RequestParam(name = "user", required = false) Integer idUsuario) {

        try {
            if(idUsuario != null) {
                 return ResponseEntity.ok(repository.findById(idUsuario, offset, limit));
            }
            return ResponseEntity.ok(repository.findAll(offset, limit));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }



}
