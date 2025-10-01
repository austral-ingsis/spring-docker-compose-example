package org.austral.ingsis.compose.user;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final JJUserRepository repository;

    public UserController(JJUserRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public JJUser createUser(@RequestBody JJUser user) {
        return repository.save(user);
    }

    @GetMapping
    public List<JJUser> getAllUsers() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<JJUser> getUserById(@PathVariable Long id) {
        return repository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
