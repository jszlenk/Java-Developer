package com.kodilla.patterns2.facade.api;

public final class ItemDto {
    private final Long productId;
    private final double quantity;

    public ItemDto(final Long productId, final double quantity) {
        this.productId = productId;
        this.quantity = quantity;
    }

    public Long getProductId() {
        return productId;
    }

    public double getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "ItemDto{" +
                "productId=" + productId +
                ", quantity=" + quantity +
                '}';
    }
}
