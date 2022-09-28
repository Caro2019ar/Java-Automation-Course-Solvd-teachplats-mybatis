package org.teachplats.model;



public class RemotePresent {
    private Long id;
    private RemotePresentEnum remOrPres;

    public RemotePresent() {
    }

    public RemotePresent(Long id, RemotePresentEnum remOrPres) {
        this.id = id;
        this.remOrPres = remOrPres;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return remOrPres.name();
    }

    public RemotePresentEnum getRemOrPres() {
        return remOrPres;
    }

    @Override
    public String toString() {
        return "RemotePresent{" +
                "id=" + id +
                ", type of class='" + remOrPres.name() + '\'' +
                '}';
    }
}
