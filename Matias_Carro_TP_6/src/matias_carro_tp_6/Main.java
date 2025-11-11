/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matias_carro_tp_6;

import java.util.ArrayList;

/**
 *
 * @author Matias
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Se crea el nuevo inventario
        ArrayList<Producto> listaInventario = new ArrayList<>();
        Inventario inventario1 = new Inventario(listaInventario);

        //Se crean nuevos productos
        Producto p1 = new Producto("1", "Notebook Lenovo", 850000.0, 5, Producto.CategoriaProducto.ELECTRONICA);
        Producto p2 = new Producto("2", "Mouse Logitech", 50000.0, 20, Producto.CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("3", "Teclado Mecánico Redragon", 65000.0, 15, Producto.CategoriaProducto.ELECTRONICA);
        Producto p4 = new Producto("4", "Monitor Samsung 24\"", 220000.0, 8, Producto.CategoriaProducto.ELECTRONICA);
        Producto p5 = new Producto("5", "Disco SSD 1TB Kingston", 95000.0, 12, Producto.CategoriaProducto.ELECTRONICA);

        Producto p6 = new Producto("6", "Pan Integral", 2500.0, 30, Producto.CategoriaProducto.ALIMENTOS);
        Producto p7 = new Producto("7", "Leche Entera", 1500.0, 50, Producto.CategoriaProducto.ALIMENTOS);
        Producto p8 = new Producto("8", "Arroz 1Kg", 950.0, 40, Producto.CategoriaProducto.ALIMENTOS);
        Producto p9 = new Producto("9", "Aceite de Girasol", 3000.0, 25, Producto.CategoriaProducto.ALIMENTOS);
        Producto p10 = new Producto("10", "Mate cocido", 800.0, 35, Producto.CategoriaProducto.ALIMENTOS);

        Producto p11 = new Producto("11", "Remera Lisa Negra", 15000.0, 15, Producto.CategoriaProducto.ROPA);
        Producto p12 = new Producto("12", "Jean", 50000.0, 10, Producto.CategoriaProducto.ROPA);
        Producto p13 = new Producto("13", "Campera", 45000.0, 5, Producto.CategoriaProducto.ROPA);
        Producto p14 = new Producto("14", "Zapatillas Deportivas", 90000.0, 8, Producto.CategoriaProducto.ROPA);
        Producto p15 = new Producto("15", "Gorra", 5000.0, 20, Producto.CategoriaProducto.ROPA);

        Producto p16 = new Producto("16", "Silla de Escritorio", 255000.0, 12, Producto.CategoriaProducto.HOGAR);
        Producto p17 = new Producto("17", "Mesa de Comedor", 300000.0, 4, Producto.CategoriaProducto.HOGAR);
        Producto p18 = new Producto("18", "Lámpara de Escritorio", 20000.0, 7, Producto.CategoriaProducto.HOGAR);
        Producto p19 = new Producto("19", "Cortinas", 35000.0, 10, Producto.CategoriaProducto.HOGAR);
        Producto p20 = new Producto("20", "Alfombra", 75000.0, 3, Producto.CategoriaProducto.HOGAR);

        //Se agregan al inventario
        inventario1.agregarProducto(p1);
        inventario1.agregarProducto(p2);
        inventario1.agregarProducto(p3);
        inventario1.agregarProducto(p4);
        inventario1.agregarProducto(p5);
        inventario1.agregarProducto(p6);
        inventario1.agregarProducto(p7);
        inventario1.agregarProducto(p8);
        inventario1.agregarProducto(p9);
        inventario1.agregarProducto(p10);
        inventario1.agregarProducto(p11);
        inventario1.agregarProducto(p12);
        inventario1.agregarProducto(p13);
        inventario1.agregarProducto(p14);
        inventario1.agregarProducto(p15);
        inventario1.agregarProducto(p16);
        inventario1.agregarProducto(p17);
        inventario1.agregarProducto(p18);
        inventario1.agregarProducto(p19);
        inventario1.agregarProducto(p20);

        //lista los productos
        inventario1.listarProductos();

        //busca productos por ID
        System.out.println("\nEl objeto buscado es: " + inventario1.buscarProducto("12"));

        //Filtrar por categoria "Ropa"
        System.out.println("\nMostrando los elementos que pertenecen a la categoria ROPA:" + inventario1.filtrarPorCategoria(Producto.CategoriaProducto.ROPA));

        //Se elimina el produco 17 - mesa de comedor
        inventario1.eliminarProducto("17");

        //se muestra el inventario luego de borrar
        System.out.println("Inventario actualizado:");
        inventario1.listarProductos();
        
        //Actualizar stock
        inventario1.actualizarStock("11", 20);
        System.out.println(inventario1.buscarProducto("11"));
        
        //total stock disponible
        System.out.println("\nTotal de productos en el Stock: " + inventario1.obtenerTotalStock());
        
        //Producto con mayor stock
        System.out.println("\nProducto con mayor stock: " + inventario1.obtenerProductoConMayorStock());
        
        
        //filtrar productos entre 1000 y 3000
        System.out.println("\nProductos entre $1000 y $3000: " + inventario1.filtrarProductosPorPrecio(1000.0, 3000.0));
        
        //Categorias disponibles 
        System.out.println("\n");
        inventario1.mostrarCategoriasDisp();
    }

}
