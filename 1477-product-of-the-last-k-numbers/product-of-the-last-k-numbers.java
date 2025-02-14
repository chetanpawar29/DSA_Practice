class ProductOfNumbers {
private List<Integer> prefixProduct;
    
    public ProductOfNumbers() {
        prefixProduct = new ArrayList<>();
        prefixProduct.add(1); // Initial product for multiplication identity
    }
    
    public void add(int num) {
        if (num == 0) {
            prefixProduct = new ArrayList<>();
            prefixProduct.add(1); // Reset with identity
        } else {
            prefixProduct.add(prefixProduct.get(prefixProduct.size() - 1) * num);
        }
    }
    
    public int getProduct(int k) {
        int size = prefixProduct.size();
        if (k >= size) return 0; // There's a zero in the last k elements
        return prefixProduct.get(size - 1) / prefixProduct.get(size - 1 - k);
    }
}


/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */