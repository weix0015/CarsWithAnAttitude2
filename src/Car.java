import java.util.ArrayList;

public class Car {
    private String Brand;
    private String Make;
    private String Honk;

    private String Sound;

    private String Drive;

    private String Park;

    // getter
    public String getBrand() {
        return Brand;
    }

    // setter
    public void setBrand(String newBrand) {
        this.Brand = newBrand;
    }

    // getter
    public String getMake() {
        return Make;
    }

    // setter
    public void setMake(String newMake) {
        this.Make = newMake;
    }

    // getter
    public String getHonk() {
        return Honk;
    }

    // setter
    public void setHonk(String newHonk) {
        this.Honk = newHonk;
    }

    // getter
    public String getSound() {
        return Sound;
    }

    // setter
    public void setSound(String newSound) {
        this.Sound = newSound;
    }

    // getter
    public String getDrive() {
        return Drive;
    }

    // setter
    public void setDrive(String newDrive) {
        this.Drive = newDrive;
    }

    // getter
    public String getPark() {
        return Park;
    }

    // setter
    public void setPark(String newPark) {
        this.Park = newPark;
    }

    Car() {
        ArrayList<String> brand = new ArrayList<>();
        ArrayList<String> make = new ArrayList<>();
        ArrayList<String> honk = new ArrayList<>();
        brand.add("Honda");
        brand.add("BMW");
        brand.add("Mercedes");
        make.add("One");
        make.add("Two");
        make.add("Three");
        honk.add("Dyt");
        honk.add("båt");
        honk.add("aaaah");
        System.out.println(brand.get(0));
        System.out.println(make.get(0));
        System.out.println(honk.get(0));
        System.out.println();
        System.out.println(brand.get(1));
        System.out.println(make.get(1));
        System.out.println(honk.get(1));
        System.out.println();
        System.out.println(brand.get(2));
        System.out.println(make.get(2));
        System.out.println(honk.get(2));
    }
}
