package by.itacademy.java.jd1.apetrov.samples.xml_parsers.practice.sax;

public class ParsingResult {
    private int itemsQuantity;
    private Food itemHighestPrice;
    private Food itemLowestPrice;
    private Food itemHighestCol;
    private Food itemLowestCol;
    private Food longestName;
    private double totalPrice;

    public int getItemsQuantity() {
        return itemsQuantity;
    }

    public void setItemsQuantity(int itemsQuantity) {
        this.itemsQuantity = itemsQuantity;
    }


    public Food getItemHighestCol() {
        return itemHighestCol;
    }

    public void setItemHighestCol(Food itemHighestCol) {
        this.itemHighestCol = itemHighestCol;
    }

    public Food getItemLowestCol() {
        return itemLowestCol;
    }

    public void setItemLowestCol(Food itemLowestCol) {
        this.itemLowestCol = itemLowestCol;
    }

    public Food getLongestName() {
        return longestName;
    }

    public void setLongestName(Food longestName) {
        this.longestName = longestName;
    }



    public Food getItemHighestPrice() {
        return itemHighestPrice;
    }

    public void setItemHighestPrice(Food itemHighestPrice) {
        this.itemHighestPrice = itemHighestPrice;
    }

    public Food getItemLowestPrice() {
        return itemLowestPrice;
    }

    public void setItemLowestPrice(Food itemLowestPrice) {
        this.itemLowestPrice = itemLowestPrice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void increaseFoodCount() {
        itemsQuantity++;
    }

    @Override
    public String toString() {
        return "ParsingResult [itemsQuantity=" + itemsQuantity + ", itemHighestPrice="
                + itemHighestPrice + ", itemLowestPrice=" + itemLowestPrice
                + ", itemHighestCol=" + itemHighestCol + ", itemLowestCol="
                + itemLowestCol + ", longestName=" + longestName + ", totalPrice="
                + totalPrice + "]";
    }

}
