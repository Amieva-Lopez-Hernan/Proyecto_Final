/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nutricionista.accesoDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import nutricionista.entidades.Renglon;

/**
 *
 * @author JulianC
 */
public class RenglonData {
     
    private Connection conection = null;
     
    public RenglonData(){
        conection = Conexion.getConexion();
    } 
    
     public void crearRenglon (Renglon renglon){
        
        String cargar = "INSERT INTO `renglon`(`nro_renglon`, `id_comida`, `cantidad_gramos`, `sub_total_calorias`) "
                + "VALUES (?, ?, ?, ?)";
        
        try {
            PreparedStatement ps = conection.prepareStatement(cargar);
            
            ps.setInt(1, renglon.getNumRenglon());
            ps.setInt(2, renglon.getComida().getIdComida());
            ps.setDouble(3, renglon.getCantGrm());
            ps.setDouble(4, renglon.getSubTotalCalorias());
            ps.executeUpdate();
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a tabla renglon (crearRenglon)");
        }
     }
}
