/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Imad
 */
public class Usuarios {
    private int id;
    private String nombre;
    private String email;
    private String clave;
    private int tel;
    private String direc;
    private int cdp;
    private String facebook;
    private String twitter;
    private String localidad;
    private String Provincia;
    private String usuarioLogeado;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    public Usuarios() {
    }

    public Usuarios(int id, String nombre, String email, String clave, int tel, String direc, int cdp, String facebook, String twitter, String localidad, String Provincia, String usuarioLogeado) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.clave = clave;
        this.tel = tel;
        this.direc = direc;
        this.cdp = cdp;
        this.facebook = facebook;
        this.twitter = twitter;
        this.localidad = localidad;
        this.Provincia = Provincia;
        this.usuarioLogeado = usuarioLogeado;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the clave
     */
    public String getClave() {
        return clave;
    }

    /**
     * @param clave the clave to set
     */
    public void setClave(String clave) {
        this.clave = clave;
    }

    /**
     * @return the tel
     */
    public int getTel() {
        return tel;
    }

    /**
     * @param tel the tel to set
     */
    public void setTel(int tel) {
        this.tel = tel;
    }

    /**
     * @return the direc
     */
    public String getDirec() {
        return direc;
    }

    /**
     * @param direc the direc to set
     */
    public void setDirec(String direc) {
        this.direc = direc;
    }

    /**
     * @return the cdp
     */
    public int getCdp() {
        return cdp;
    }

    /**
     * @param cdp the cdp to set
     */
    public void setCdp(int cdp) {
        this.cdp = cdp;
    }

    /**
     * @return the facebook
     */
    public String getFacebook() {
        return facebook;
    }

    /**
     * @param facebook the facebook to set
     */
    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    /**
     * @return the twitter
     */
    public String getTwitter() {
        return twitter;
    }

    /**
     * @param twitter the twitter to set
     */
    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    /**
     * @return the localidad
     */
    public String getLocalidad() {
        return localidad;
    }

    /**
     * @param localidad the localidad to set
     */
    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    /**
     * @return the Provincia
     */
    public String getProvincia() {
        return Provincia;
    }

    /**
     * @param Provincia the Provincia to set
     */
    public void setProvincia(String Provincia) {
        this.Provincia = Provincia;
    }

    /**
     * @return the usuarioLogeado
     */
    public String getUsuarioLogeado() {
        return usuarioLogeado;
    }

    /**
     * @param usuarioLogeado the usuarioLogeado to set
     */
    public void setUsuarioLogeado(String usuarioLogeado) {
        this.usuarioLogeado = usuarioLogeado;
    }
    
    
}
