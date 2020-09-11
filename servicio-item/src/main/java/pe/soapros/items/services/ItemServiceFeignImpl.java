package pe.soapros.items.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import pe.soapros.items.clients.ProductoClienteRest;
import pe.soapros.items.models.Item;
import pe.soapros.commons.models.entity.Producto;

@Service("serviceFeign")
@Primary
public class ItemServiceFeignImpl implements ItemService{

	@Autowired
	private ProductoClienteRest clienteFeign;
	
	@Override
	public List<Item> findAll() {
		return clienteFeign.listar().stream().map(p -> new Item(p, 1)).collect(Collectors.toList());
	}

	@Override
	public Item findById(Long id, Integer cantidad) {
		return new Item(clienteFeign.detalle(id), cantidad);
	}

	@Override
	public Producto save(Producto producto) {
		
		return clienteFeign.crear(producto);
	}

	//@Override
	//public Producto update(Producto producto, Long id) {
		//return clienteFeign.actualizar(producto, id);
	//}

	@Override
	public void delete(Long id) {
		clienteFeign.delete(id);		
	}

	@Override
	public Producto update(Producto producto, Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
