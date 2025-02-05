package shop;

public class BillProduct {
	String productCode;
	int mrp;
	String productName;
	@Override
	public String toString() {
		return "BillProduct [productCode=" + productCode + ", quantityOrdered=" + mrp + ", productName="
				+ productName + "]";
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public int mrp() {
		return mrp;
	}
	public void setmrp(int mrp) {
		this.mrp = mrp;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
}
