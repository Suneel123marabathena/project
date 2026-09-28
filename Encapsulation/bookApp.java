public class bookApp{
    private int pageNumber;
    public void setData(int x){
        pageNumber = x;
    }
    public void getData(){
        System.out.println("Page Number: " + pageNumber);
    }
    public static void main(String args[]){
        bookApp book = new bookApp();
        book.setData(100);
        book.getData();
    }
}