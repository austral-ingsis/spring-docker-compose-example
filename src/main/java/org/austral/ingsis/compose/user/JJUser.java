package org.austral.ingsis.compose.user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity()
public class JJUser {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String name;

    public JJUser(String name) {
        this.name = name;
    }

    public JJUser() { }

    public Long getId() { return id; }

    public String getName() { return name; }
}
