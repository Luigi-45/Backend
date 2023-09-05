/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Backend.repositories;

import com.Backend.entities.Insumo;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IInsumoRepository extends JpaRepository<Insumo,Integer>{
  
    public Optional<Insumo> findbyId(int Id);
    
}
