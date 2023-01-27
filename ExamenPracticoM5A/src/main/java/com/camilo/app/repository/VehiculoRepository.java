package com.camilo.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.camilo.app.entity.vehiculo;


public interface VehiculoRepository  extends JpaRepository<vehiculo,Long> {
 
	
}
