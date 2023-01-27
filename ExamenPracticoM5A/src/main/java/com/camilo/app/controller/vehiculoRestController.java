package com.camilo.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.camilo.app.entity.vehiculo;
import com.camilo.app.service.vehiculosService;



@RestController
@RequestMapping("/api")
public class vehiculoRestController {

	@Autowired   
	private vehiculosService vehicul ;

	    @GetMapping("/vehiculo/list")
	    public ResponseEntity<List<vehiculo>> obtenerLista() {
	      
	    	  try {
	              return new ResponseEntity<>(vehicul.findByAll(), HttpStatus.OK);
	          } catch (Exception e) {
	              return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	          }
	        

	    }

	    // Save
	    @PostMapping("/vehiculo/save")
	    public ResponseEntity<?> createVehiculo( @RequestBody vehiculo vei) {
	    
	            return new ResponseEntity<>(vehicul.save(vei), HttpStatus.CREATED);

	     
	    }

	    @GetMapping("/vehiculo/list/{id}")
	    public ResponseEntity<?> vervehiculo(@PathVariable(value = "id") Long id) {
	        Optional<vehiculo> valid = Optional.ofNullable(vehicul.findById(id));
	        if (!valid.isPresent()) {
	            return ResponseEntity.notFound().build();
	        }
	        return ResponseEntity.ok(valid);
	    }

	    @PutMapping("/vehiculo/update/{id}")
	    public ResponseEntity<?> updatevehiculo( @RequestBody vehiculo vei, @PathVariable(value = "id") Long id) {
	        Optional<vehiculo> valid = Optional.ofNullable(vehicul.findById(id));
	        if (!valid.isPresent()) {
	            return ResponseEntity.notFound().build();
	        }
	        valid.get().setColor(vei.getColor());
	        valid.get().setNumchasis(vei.getNumchasis());
	        valid.get().setNumllantas(vei.getNumllantas());
	        valid.get().setModelo(vei.getModelo());
	        valid.get().setCosto(vei.getCosto());
	        valid.get().setObservacion(vei.getObservacion());
	       

	        
	        
	        return ResponseEntity.status(HttpStatus.CREATED).body(vehicul.save(valid.get()));

	    }

	    @DeleteMapping("/delete/vehiculo/{id}")
	    public ResponseEntity<?> deletevehiculo(@PathVariable(value = "id") Long id) {
	       
	    	vehicul.delete(id);
	            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	       
	    }
	  
	  
	  
	  
	  
	  
	  
}
