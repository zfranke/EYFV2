public class player {
    private String name;
    private int size = 5;

    public player(String name, int size) {
        this.name = name;
        this.size = size;
    }

    // Name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Size
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void addSize(int size) {
        this.size += size;
    }

    public void removeSize(int size) {
        this.size -= size;
    }

    public void resetSize() {
        this.size = 5;
    }

    public void printSize() {
        System.out.println(this.name + " has " + this.size + " size.");
    }

}
