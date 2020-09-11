package pe.soapros.items.services;

import java.util.List;

import pe.soapros.items.models.Item;
import pe.soapros.commons.models.entity.Producto;

public interface ItemService {

	public List<Item> findAll();
	
	public Item findById(Long id, Integer cantidad);
	
	public Producto save(Producto producto);

	public Producto update(Producto producto, Long id);
	
	public void delete (Long id);
}
