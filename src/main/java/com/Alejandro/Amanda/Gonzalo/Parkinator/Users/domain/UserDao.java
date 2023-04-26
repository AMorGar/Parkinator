package com.Alejandro.Amanda.Gonzalo.Parkinator.Users.domain;

/**
 * Clase de acceso a datos de Usuario
 * @author Alejandro Moreno Garrido
 * @author Gonzalo Ruiz AzuarAmanada Navas Rodriguez, 
 * @version V0.0.1   JDK 19
 * 
 */



public class UserDao {

    private Integer id;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String rol;
    private String email;
/**
 * Copia los datos introducidos por teclados en los parametros de la aplicacion
 * @param nombre Este parametro iguala su valor al de la variable nombre
 * @param apellido1 Este parametro iguala su valor al de la variable apellido1
 * @param apellido2 Este parametro iguala su valor al de la variable apellido2
 * @param rol Este parametro iguala su valor al de la variable rol
 * @param emial Este parametro iguala su valor al de la variable emial
 */
    public UserDao(String email,String nombre, String apellido1, String apellido2, String rol) {
        this.email = email;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.rol = rol;
    }

    public UserDao() {

    }
/**
 * Devuelve lo almacenado en el parametro
 * @return Devuelve los datos guardados en el parametro id
 */
    public Integer getId() {
        return this.id;
    }
/**
 * Devuelve lo almacenado en el parametro
 * @return Devuelve los datos guardados en el parametro id
 */
public String getEmail() {
    return this.email;
}
/**
 * Devuelve lo almacenado en el parametro
 * @return Devuelve los parametros guardados en el parametro nombre
 */
    public String getNombre() {
        return this.nombre;
    }
/**
 * Devuelve lo almacenado en el parametro
 * @return Devuelve los parametros guardados en el parametro apellido1
 */
    public String getApellido1() {
        return this.apellido1;
    }
/**
 * Devuelve lo almacenado en el parametro
 * @return Devuelve los parametros guardados en el parametro apellido2
 */
    public String getApellido2() {
        return this.apellido2;
    }
/**
 * Devuelve lo almacenado en el parametro
 * @return Devuelve los parametros guardados en el parametro rol
 */
    public String getRol() {
        return this.rol;
    }

/**
 * Iguala el parametro a lo introducido
 * @param nombre Este parametro guarda los datos de la variable nombre
 */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
/**
 * Iguala el parametro a lo introducido
 * @param nombre Este parametro guarda los datos de la variable nombre
 */
public void setEmail(String email) {
    this.email = email;
}
/**
 * Iguala el parametro a lo introducido
 * @param apellido1 Este parametro guarda los datos de la variable apellido1
 */
    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }
/**
 * Iguala el parametro a lo introducido
 * @param apellido2 Este parametro guarda los datos de la variable apellido2
 */
    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }
/**
 * Iguala el parametro a lo introducido
 * @param rol Este parametro guarda los datos de la variable rol
 */
    public void setRol(String rol) {
        this.rol = rol;
    }
/**
 * Iguala el parametro a lo introducido
 * @return esta variable no devuelve nada pero era necesario
 */
    public String getFirstName() {
        return null;
    }

    
}