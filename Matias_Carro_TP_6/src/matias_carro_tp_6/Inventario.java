/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matias_carro_tp_6;

/**
 *
 * @author Matias
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Inventario {

    private ArrayList<Producto> productos;

    public Inventario(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void listarProductos() {
        //llama directo al arraylist - revisar 
        System.out.println("Listado Productos:");
        System.out.println(productos);
    }

    //retorna la cantidad de productos
    public int cantidadProductos() {
        return productos.size();
    }

    //buscar producto usando iterator
    public Producto buscarProducto(String id) {
        Producto productoEncontrado = null;
        Iterator<Producto> it = this.productos.iterator();
        while (it.hasNext() && productoEncontrado == null) {
            Producto a = it.next();
            if (a.getId().equalsIgnoreCase(id)) {
                productoEncontrado = a;
            }
        }
        return productoEncontrado;
    }

    public void eliminarProducto(String id) {
        //busca el producto con el metodo buscarproducto
        Producto productoEncontrado = buscarProducto(id);
        if (productoEncontrado != null) {
            //borra el producto encontrado, si lo encuentra
            productos.remove(productoEncontrado);
            System.out.println("\nSe borra el producto con ID:" + id);
        } else {
            System.out.println("\nEl producto no existe, no se elimina ningun producto");
        }

    }

    public void actualizarStock(String id, int cantidad) {
        Producto productoEncontrado = buscarProducto(id);
        if (productoEncontrado != null) {
            //borra el producto encontrado, si lo encuentra
            productoEncontrado.setCantidad(productoEncontrado.getCantidad() + cantidad);

            System.out.println("\nSe agrega al producto ID: " + id + " un total de: " + cantidad + " elementos.");
        } else {
            System.out.println("\nEl producto no existe, no se elimina agrega producto");
        }
    }

    public List<Producto> filtrarPorCategoria(Producto.CategoriaProducto categoria) {
        List<Producto> productosFiltrado = new ArrayList<>();
        for (Producto producto : productos) {
            if (producto.getCategoria() == categoria) {
                productosFiltrado.add(producto);
            }

        }
        return productosFiltrado;

    }

    public int obtenerTotalStock() {
        int totalStock = 0;
        for (Producto producto : productos) {
            totalStock += producto.getCantidad();
        }
        return totalStock;
    }

    public Producto obtenerProductoConMayorStock() {
        Producto productoMayorStock = null;
        int mayorStock = -1;
        for (Producto producto : productos) {
            if (producto.getCantidad() > mayorStock) {
                mayorStock = producto.getCantidad();
                productoMayorStock = producto;
            }
        }
        return productoMayorStock;

    }

    public List<Producto> filtrarProductosPorPrecio(double min, double max) {
        List<Producto> filtradosPorPrecio = new ArrayList<>();
        for (Producto producto : productos) {
            if (producto.getPrecio() >= min && producto.getPrecio() <= max) {
                filtradosPorPrecio.add(producto);
            }
        }
        return filtradosPorPrecio;

    }

    public void mostrarCategoriasDisp() {
        for (Producto.CategoriaProducto categoria : Producto.CategoriaProducto.values()) {
    System.out.println("Categoria: " + categoria + "  (" + categoria.getDescripcion()+")");
        
        
    }

    }
}


