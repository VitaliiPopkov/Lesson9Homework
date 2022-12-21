package MyAddress;

public class AddressMain {
    public static void main(String[] args) {
        Address address = new Address();
        address.setIndex(987654);
        address.setCountry("ISrael,");
        address.setCity("Tel Aviv,");
        address.setStreet("Dizingof,");
        address.setHouse(2);
        address.setApartment(24);
        //System.out.println(address.getIndex() + " " +address.getCountry() + " " + address.getCity() +" " +address.getStreet() +" "+ address.getHouse() + " " +address.getApartment());

        address.showAddress();
    }

}
