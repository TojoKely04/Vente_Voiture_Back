package com.projetS5.back.model;

public class Favoris {
    private long idFavoris;
    private Utilisateur user;
    private Long idAnnonce;

    public Favoris(){}

    public  Favoris(Long idFavoris , Utilisateur user, Long idAnnonce) {
        this.idFavoris = idFavoris;
        this.user = user;
        this.idAnnonce = idAnnonce;
    }

    public long getIdFavoris() {
        return idFavoris;
    }

    public void setIdFavoris(long idFavoris) {
        this.idFavoris = idFavoris;
    }

    public Utilisateur getUser() {
        return user;
    }

    public void setUser(Utilisateur user) {
        this.user = user;
    }

    public Long getIdAnnonce() {
        return idAnnonce;
    }

    public void setIdAnnonce(Long idAnnonce) {
        this.idAnnonce = idAnnonce;
    }

    
}
