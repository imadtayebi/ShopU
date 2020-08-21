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
public class Comentarios {
    
    private String comentario;
    private int id;
    private int idUsuario;
    private long  idArticulos;

    public Comentarios(String comentario, int id, int idUsuario, long idArticulos) {
        this.comentario = comentario;
        this.id = id;
        this.idUsuario = idUsuario;
        this.idArticulos = idArticulos;
    }

    public Comentarios() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public long getIdArticulos() {
        return idArticulos;
    }

    public void setIdArticulos(long idArticulos) {
        this.idArticulos = idArticulos;
    }

    
    
}
