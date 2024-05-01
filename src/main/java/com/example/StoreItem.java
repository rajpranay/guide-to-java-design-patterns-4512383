package com.example;

public class StoreItem

{
    private final String name;
    private final Double price;
    private final String shortDescription;
    private final String longDescription;
    private final Integer stockAvailable;
    private final String packagingType;

    private StoreItem(StoreItemBuilder storeItemBuilder) {
        this.name = storeItemBuilder.getName();
        this.price = storeItemBuilder.getPrice();
        this.shortDescription = storeItemBuilder.getShortDescription();
        this.longDescription = storeItemBuilder.getLongDescription();
        this.stockAvailable = storeItemBuilder.getStockAvailable();
        this.packagingType = storeItemBuilder.getPackagingType();
    }

    @Override
    public String toString() {
        return "StoreItem{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", shortDescription='" + shortDescription + '\'' +
                ", longDescription='" + longDescription + '\'' +
                ", stockAvailable=" + stockAvailable +
                ", packagingType='" + packagingType + '\'' +
                '}';
    }

    public static class StoreItemBuilder {
        private String name;
        private Double price;
        private String shortDescription;
        private String longDescription;
        private Integer stockAvailable;
        private String packagingType;

        public StoreItemBuilder(String name, Double price) {
            this.name = name;
            this.price = price;
        }

        public StoreItemBuilder shortDescription(String shortDescription) {
            this.shortDescription = shortDescription;
            return this;
        }

        public StoreItemBuilder longDescription(String longDescription) {
            this.longDescription = longDescription;
            return this;
        }

        public StoreItemBuilder packagingType(String packagingType) {
            this.packagingType = packagingType;
            return this;
        }

        public StoreItemBuilder stockAvailable(Integer stockAvailable) {
            this.stockAvailable = stockAvailable;
            return this;
        }

        public String getName() {
            return this.name;
        }

        public Double getPrice() {
            return this.price;
        }

        public String getShortDescription() {
            return this.shortDescription;
        }

        public String getLongDescription() {
            return this.longDescription;
        }

        public Integer getStockAvailable() {
            return this.stockAvailable;
        }

        public String getPackagingType() {
            return this.packagingType;
        }





        public StoreItem build() {
            return new StoreItem(this);
        }
    }
}
