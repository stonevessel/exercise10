public class Main {
    public static void main(String[] args) {

        Contacts contact1 = new Contacts("Steve", "Letmeout@help.com");
        Contacts contact2 = new Contacts("Steve", "cantsee@help.com");
        Contacts contact3 = new Contacts("Steve", "itsdark@help.com");
        Contacts contact4 = new Contacts("Steve", "help@help.com");
        Contacts contact5 = new Contacts("Steve", "Letmeout@help.com");
        Contacts contact6 = new Contacts("Steve", "Letmeout@help.com");
        Contacts contact7 = new Contacts("Steve", "Letmeout@help.com");

        TheCollection listing = new TheCollection();
        listing.addContact(contact1);
        listing.addContact(contact2);
        listing.addContact(contact3);
        listing.addContact(contact4);
        listing.addContact(contact5);
        listing.addContact(contact6);
        listing.addContact(contact7);

        for(Contacts a: listing){
            System.out.println(a);
        }
    }
}