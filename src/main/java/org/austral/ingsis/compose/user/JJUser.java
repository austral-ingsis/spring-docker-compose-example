package org.austral.ingsis.compose.user;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class JJUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    public JJUser(String name) {
        this.name = name;
    }

    protected JJUser() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
