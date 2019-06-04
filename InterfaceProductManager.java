package UngDungQuanLySanPham;

public interface InterfaceProductManager {
    void showProduct();

    boolean addProduct(Product product);

    boolean editProduct(Product product);

    boolean deleteProduct(int id);

    boolean searchProduct(int id);

    void sortProduct();
}
