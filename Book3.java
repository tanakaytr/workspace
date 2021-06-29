public class Book3 {
    int id;
    String name;
    int price;
    int unit;
    
    public String toString() {
        String txt = "";
        txt += "===== タイトル " + name + " =====\n";
        txt += "ID:" + id + "\n";
        txt += "金額:" + price + "\n";
        txt += "冊数:" + unit + "\n";
        return txt;
    }
}
