package collection.onlineshop;

import java.util.ArrayList;
import java.util.List;

public class OnlineShop {
    private List<Supplier> suppliers;
    private List<Product> products;

    public OnlineShop() {
        suppliers = new ArrayList<>();
        products = new ArrayList<>();
    }

    public void addSupplier(Supplier supplier) {
        if (!suppliers.contains(supplier)) {
            suppliers.add(supplier);
            updateProductCatalog(supplier.getProducts());
        }
    }

    public void printSuppliersCatalog(){
        System.out.println("-----------------------");
//        System.out.println(suppliers);
        for (Supplier supplier:suppliers) {
            System.out.println(supplier.getName() + " | "+supplier.getAddress());
        }
    }

    public void printProductCatalog(){
        System.out.println(products);
    }

    private void updateProductCatalog(List<Product> supplProducts) {
        // check each product on persisting in the shop's catalog
        for (Product suppProduct : supplProducts) {
            if (!products.contains(suppProduct)) {
                products.add(suppProduct);
            } else {
                Product productFromShopCatalog = findProductInShopCatalog(suppProduct);
                if (productFromShopCatalog == null) {
                    products.add(suppProduct);
                } else {
                    Product updatedProduct = combineProducts(productFromShopCatalog, suppProduct);
                    products.set(products.indexOf(productFromShopCatalog), updatedProduct);
                }
            }
        }
    }

    private Product findProductInShopCatalog(Product supplirProduct) {
        for (Product product : products) {
            if (product.equals(supplirProduct)) {
                return product;
            }
        }
        return null;
    }

    private Product combineProducts(Product product1, Product product2) {
        if (!product1.equals(product2)) {
            System.out.println("WARN: Products keys don't match");
            return null;
        }
        Product p = new Product();
        p.setId(product1.getId());
        p.setName(product1.getName());
        p.setQuantity(product1.getQuantity() + product2.getQuantity());
        p.setPrice((product1.getQuantity() * product1.getPrice() + product2.getQuantity() * product2.getPrice())
                / product1.getQuantity() + product2.getQuantity());
        return p;
    }

}
