package com.camilo.app.service;

import org.springframework.data.repository.CrudRepository;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;





public abstract  class serviciosGenericosImpl <T, ID extends Serializable> implements  ServiciosGenrericos<T, ID>  {

	   public abstract CrudRepository<T, ID> getCrudRepository();
	   
	   
	   @Override
	    public T save(T Entity) {
	        return getCrudRepository().save(Entity);
	    }

	    @Override
	    public T findById(ID id) {
	        Optional<T> obj = getCrudRepository().findById(id);
	        if (obj.isPresent()) {
	            return obj.get();
	        }
	        return null;
	    }

	    @Override
	    public List<T> findByAll() {
	        List<T> list = new ArrayList<>();
	        getCrudRepository().findAll().forEach(obj -> list.add(obj));
	        return list;
	    }

	    @Override
	    public void delete(ID id) {
	    	getCrudRepository().deleteById(id);
	    }
	
	
}
