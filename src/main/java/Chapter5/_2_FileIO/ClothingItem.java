/*
I haven't yet finished writing this challenge.
TODO: finish challenge
 */
package Chapter5._2_FileIO;

public class ClothingItem {
    private String name;
    private String pricetag;

    public ClothingItem(String name, String pricetag){
        this.name = name;
        this.pricetag = pricetag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPricetag() {
        return pricetag;
    }

    public void setPricetag(String price) {
        this.pricetag = price;
    }

    public boolean equals(ClothingItem o) {
        return o.pricetag == pricetag && o.name.equals(name);
    }
}
