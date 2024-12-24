class Electronics {
    public static void main(String[] pro) {
        Product product = new Product();
        product.setProductId(202);
        product.setProductName("Laptop");
        product.setProductPrice(1200.5);

        System.out.println("Product ID: " + product.getProductId());
        System.out.println("Product Name: " + product.getProductName());
        System.out.println("Product Price: " + product.getProductPrice());
    }
}