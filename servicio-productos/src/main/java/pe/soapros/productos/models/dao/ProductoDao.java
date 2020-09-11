package pe.soapros.productos.models.dao;

import org.springframework.data.repository.CrudRepository;

import pe.soapros.commons.models.entity.Producto;

public interface ProductoDao extends CrudRepository<Producto, Long>{

}
