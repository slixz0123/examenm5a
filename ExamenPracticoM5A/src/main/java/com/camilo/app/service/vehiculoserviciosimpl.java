package com.camilo.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.camilo.app.entity.vehiculo;
import com.camilo.app.repository.VehiculoRepository;

@Service
public class vehiculoserviciosimpl extends serviciosGenericosImpl<vehiculo, Long> implements vehiculosService  {

	@Autowired
	VehiculoRepository vehiculoRepository ;
	@Override
	public CrudRepository<vehiculo, Long> getCrudRepository() {
		// TODO Auto-generated method stub
		return null;
	}

}
