/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import negocio.*;
import dados.*;
/**
 *
 * @author udesc
 */
public class SistemaTest {
    
  @Test
  public void buscarAnimaisPorRaca(){
      Sistema sistema = new Sistema();
      sistema.getOngsCadastrada();
      sistema.setAnimaisCadastrados(new Animal(02,"Thor", "Husky", "Grande", 2,"Macho", "Canino"));
      sistema.setUsuariosCadastrados(usuariosCadastrados);
  
  }
    
}
