class Details{
    private String name;
    private String address;
    public void setName(String n) {
        this.name=n;
    }
        public String getName() {
        return name;
    }
        public void setAddress(String r) {
        this.address=r;
    }
    public String getAddress() {
        return address;
    }
}

public class Getset {

    public static void main(String[] args) {
        Details s1= new Details();
        s1.setName("Prabu");
        s1.setAddress("No: 30, Anna nagar, Tirunelveli");
        System.out.println(s1.getName());
        System.out.println(s1.getAddress());

    }
}
