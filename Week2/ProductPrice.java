package Week2;

public class ProductPrice {
	public static void main(String[] args) {
		int count = 7;
		int total = 5700;
		
		//상품 단가 구하기 = 총 금액 /개수
		//int / int => int
		double aPrice = (double)total / count;
		System.out.printf("구매수량: %d\n", count);
		System.out.printf("총 구매 금액: %d원\n", total);
		System.out.printf("상품 단가: %.1f원\n",aPrice);
		
	}
}
