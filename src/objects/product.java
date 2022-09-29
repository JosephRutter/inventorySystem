package objects;

public class product {

    private String productName;
    private String productCategory;
    private Double productPrice;
    private int productQuantity;
    private boolean productInstock;



    public product(String productName, String productCategory, Double productPrice, int productQuantity, boolean productInstock) {
        this.productName = productName;
        this.productCategory = productCategory;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
        this.productInstock = productInstock;

    }




    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public boolean isProductInstock() {
        return productInstock;
    }

    public void setProductInstock(boolean productInstock) {
        this.productInstock = productInstock;
    }
}
