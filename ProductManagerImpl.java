package UngDungQuanLySanPham;

import java.util.ArrayList;

public class ProductManagerImpl implements InterfaceProductManager {
    ArrayList<Product> products = new ArrayList<>();
    int count = 0;


    @Override
    public void showProduct() {
        for (Product product : this.products) {
            System.out.println(product.getId() + "\t" +
                    product.getName() + "\t" +
                    product.getDescription() + "\t" +
                    product.getPrice() + "\t" +
                    product.getStatus() + "\n"
            );
        }
    }

    @Override
    public boolean addProduct(Product product) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getName().equals(product.getName())) {
                return false;
            }
        }
        products.add(product);
        return true;
    }

    @Override
    public boolean editProduct(Product product) {
        for (Product productOne : products) {
            if (productOne.getId() == productOne.getId()) {
                productOne.setStatus(productOne.getStatus());
                productOne.setPrice(productOne.getPrice());
                productOne.setDescription(productOne.getDescription());
                productOne.setName(productOne.getName());
                return true;
            }
        }

        return false;
    }

    @Override
    public boolean deleteProduct(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                products.remove(product);
                count--;
                return true;
            }
        }

        return false;
    }

    @Override
    public boolean searchProduct(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                showProduct();
                return true;
            }
        }

        return false;

    }

    @Override
    public void sortProduct() {
        Product temp;
        for (int i = 0; i < products.size() - 1; i++) {
            for (int j = i + 1; j < products.size(); j++) {
                if (products.get(i).getPrice() > products.get(j).getPrice()) {
                    temp = products.get(i);
                    products.set(i, products.get(j));
                    products.set(j, temp);
                }

            }
        }
    }
}
