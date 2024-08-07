package org.admin.entities;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "area")
public class area {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "areaid")
    private Integer areaid;

    @Column(name = "areaname", nullable = false, length = 100)
    private String areaname;

    @Column(name = "status", nullable = false, length = 20)
    private String status;

    @OneToMany(mappedBy = "area", cascade = CascadeType.ALL)
    private Set<user> users;

    @OneToMany(mappedBy = "area", cascade = CascadeType.ALL)
    private Set<device> devices;


    // Getters y setters


    public int getAreaid() {
        return areaid;
    }

    public void setAreaid(int areaid) {
        this.areaid = areaid;
    }

    public String getAreaname() {
        return areaname;
    }

    public void setAreaname(String areaname) {
        this.areaname = areaname;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Set<user> getUsers() {
        return users;
    }

    public Set<device> getDevices() {
        return devices;
    }

    public void setDevices(Set<device> devices) {
        this.devices = devices;
    }

    public void setUsers(Set<user> users) {
        this.users = users;


    }
}
