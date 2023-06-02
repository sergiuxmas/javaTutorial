package collection.onlineshop;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product galaxy22 = new Product(1, "Galaxy 22", 100, 20000.00);
        Product xiami12Pro = new Product(2, "Xiaomi 12 pro", 50, 10000.00);
        Supplier alo = new Supplier("ALO","mun. Chisinau");
        alo.setProducts(List.of(galaxy22, xiami12Pro));

        OnlineShop phoneShop = new OnlineShop();
        phoneShop.addSupplier(alo);
        phoneShop.printSuppliersCatalog();
        phoneShop.printProductCatalog();


        Product galaxy = new Product(1, "Galaxy 22", 50, 10000.00);
        Supplier darwin = new Supplier("Darwin","mun. Chisinau");
        darwin.setProducts(List.of(galaxy));
        phoneShop.addSupplier(darwin);
        phoneShop.printSuppliersCatalog();
        phoneShop.printProductCatalog();
    }
}
