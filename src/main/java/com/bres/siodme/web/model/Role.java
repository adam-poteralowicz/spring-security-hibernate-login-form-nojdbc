package com.bres.siodme.web.model;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Adam on 2016-08-01.
 */

@Entity
@Table(name = "UserRoles")
public class Role {
    @Column(name = "id")
    private Long id;
    @Column(name = "uid")
    private Long uid;
    @Column(name = "name")
    private String name;
    private Set<User> users;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ManyToMany(mappedBy = "roles")
    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }
}
