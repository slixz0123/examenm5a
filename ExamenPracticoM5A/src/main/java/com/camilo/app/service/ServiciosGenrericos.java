package com.camilo.app.service;

import java.io.Serializable;
import java.util.List;

public interface ServiciosGenrericos   <T, ID extends Serializable>{

	 public T save(T entity);

	    public T findById(ID id);

	    public List<T> findByAll();

	    public void delete(ID id);
}
