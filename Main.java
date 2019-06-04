package UngDungQuanLySanPham;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ung dung quan ly san pham");
        int choice;
        ProductManagerImpl productManager = new ProductManagerImpl();
        do {
            menu();
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    productManager.showProduct();
                    break;
                case 2:
                    Product product = inputProduct();
                    boolean result = productManager.addProduct(product);
                    if (result) {
                        System.out.println("THEM SAN PHAM THANH CONG ");
                    } else {
                        System.out.println("THEM SAN PHAM THAT BAI !");
                    }
                    break;
                case 3:
                    Product product1 = inputProduct();
                    boolean greatResults = productManager.editProduct(product1);
                    if (greatResults) {
                        System.out.println("SUA SAN PHAM THANH CONG");
                    } else {
                        System.out.println("ID KHONG DUNG ! SUA SAN PHAM THAT BAI !");
                    }
                    break;
                case 4:
                    System.out.println("NHAP ID SAN PHAM CAN XOA");
                    int id = scanner.nextInt();
                    boolean deleteResults = productManager.deleteProduct(id);
                    if (deleteResults) {
                        System.out.println("XOA SAN PHAM THANH CONG");
                    } else {
                        System.out.println("KHONG XOA DUOC SAN PHAM");
                    }
                    break;
                case 5:
                    System.out.println("NHAP ID SAN PHAM CAN TIM KIEM ");
                    int idd = scanner.nextInt();
                    productManager.searchProduct(idd);
                case 6:
                    productManager.sortProduct();
                    break;

            }
        } while (choice != 0);

    }

    public static void menu() {
        System.out.println("Menu");
        System.out.println("1.Hien thi danh sach san pham");
        System.out.println("2.Them san pham");
        System.out.println("3.Sua thong tin san pham");
        System.out.println("4.Xoa san pham");
        System.out.println("5.Tim kiem san pham");
        System.out.println("6.Sap xep san pham theo gia tang dan hoac giam dan");
        System.out.println("Nhap lua chon cua ban vao !");
    }

    public static Product inputProduct() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap id");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap name");
        String name = sc.nextLine();
        System.out.println("Nhap description");
        String description = sc.nextLine();
        System.out.println("Nhap price");
        float price = sc.nextFloat();
        sc.nextLine();
        System.out.println("Nhap status");
        String status = sc.nextLine();

        Product product = new Product(id, name, description, price, status);
        return product;
    }
}
