class Computer {
    String productionYear;
    String type;
    String size;

    public Computer(String productionYear, String type, String size) {
        this.productionYear = productionYear;
        this.type = type;
        this.size = size;
    }

    public void displayComputerInfo() {
        System.out.println("computer Info:  -------------------------------------------------------------");
    }

    public void displayPhoneInfo() {
        System.out.println("Phone Info:  ----------------------------------------------------------------");
    }
}

class Laptob extends Computer {
    String brand;

    Laptob(String productionYear, String type, String size, String brand) {
        super(productionYear, type, size);
        this.brand = brand;
    }

    @Override
    public void displayComputerInfo() {
        super.displayComputerInfo();
        System.out.println(
                "year: " + productionYear + "     Type: " + type + "      Size: " + size + "      Brand: " + brand);
    }
}

class Linux extends Laptob {
    String storage;

    Linux(String productionYear, String type, String size, String brand, String storage) {
        super(productionYear, type, size, brand);
        this.storage = storage;
    }

    public void displayInfo() {
        System.out.println("Storage: " + storage);
    }
}

class Phone extends Computer {
    String brand;
    String storage;

    Phone(String productionYear, String type, String size, String brand, String storage) {
        super(productionYear, type, size);
        this.brand = brand;
        this.storage = storage;
    }

    public void displayPhoneInfo() {
        super.displayPhoneInfo();
        System.out.println("Year: " + productionYear + "    Type: " + type + "    Size: " + size + "      Brand: "
                + brand + "     Storage: " + storage);
    }
}

public class Heirarchy {
    public static void main(String[] args) {

        Laptob obj1 = new Laptob("2019", "Business laptop", "10.5 inchs", "HP");
        Linux myLinux = new Linux("2022", "Gaming laptop", "13.4 inchs", "linux", "512GB");
        Phone myPhone = new Phone("2020", "Smartphone", "10.5inchs", "iphone", "512GB");
        // call their methods to illustrate how inheritance is functioning across the
        // different levels and types

        obj1.displayComputerInfo();
        myLinux.displayInfo();
        myPhone.displayPhoneInfo();
    }
}
