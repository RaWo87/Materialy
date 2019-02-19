package SDA;

public class Book implements Comparable<Book>{
    //id,cat,name,price,inStock,author_t,series_t,sequence_i,genre_s
   private Integer id;
    private String category;
    private String tittle;
    private Double price;
    private Boolean inStock;
    private String author;
    private String series;
    private Integer sequence;
    private String genre;

    public Book(Integer id, String category, String tittle, Double price, Boolean inStock, String author, String series, Integer sequence, String genre) {
        this.id = id;
        this.category = category;
        this.tittle = tittle;
        this.price = price;
        this.inStock = inStock;
        this.author = author;
        this.series = series;
        this.sequence = sequence;
        this.genre = genre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Boolean getInStock() {
        return inStock;
    }

    public void setInStock(Boolean inStock) {
        this.inStock = inStock;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public int compareTo(Book o) {
        return o.inStock?this.inStock? (int)(o.getPrice() - this.getPrice()):0:-1;

        //(this.inStock && o.inStock? 0:this.inStock ? 1 :)

    }

    @Override
    public String toString() {
        return  "\n"+String.valueOf(id) +
                "," + category +
                "," + tittle +
                "," + String.valueOf(price) +
                "," + String.valueOf(inStock)  +
                "," + author +
                "," + series +
                "," + String.valueOf(sequence) +
                "," + genre;
    }
}
