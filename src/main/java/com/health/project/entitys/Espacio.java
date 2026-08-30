package com.health.project.entitys;



import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor


public class Espacio {
    public int idEspacio;
    public String nombre ;
    public String tipo ; 
    public String descripcion;
    public String ubicacion;
    public double precioBase; 
    public String imagenUrl;
    public boolean activo;
}
