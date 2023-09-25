package br.com.blog.demo.MVC.Model;

import jakarta.persistence.*;

@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String URLImage;
    String Titulo;
    String texto;
    @ManyToOne
    Categoria categoria;

    public Post(){
    }

    public Post(String URLImage, String titulo, String texto, Categoria categoria) {
        this.URLImage = URLImage;
        this.Titulo = titulo;
        this.texto = texto;
        this.categoria = categoria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getURLImage() {
        return URLImage;
    }

    public void setURLImage(String URLImage) {
        this.URLImage = URLImage;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
