package com.Alejandro.Amanda.Gonzalo.Parkinator.Users.domain;
public enum Role {
    STUDENT("Alumno"),
    PROFESSOR("Profesor");

    private final String displayName;
    private Role(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName(){
        return this.displayName;
    }
    
}