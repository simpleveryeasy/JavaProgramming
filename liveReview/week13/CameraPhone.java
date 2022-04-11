package week13;

public class CameraPhone extends Phone{

    int imageSize; // in MegaBytes
    int memorySize; // in GigaBytes

    public CameraPhone(String make, String model, double price, int imageSize, int memorySize) {
        super(make, model, price);
        this.imageSize = imageSize;
        this.memorySize = memorySize;
    }

    public int numPictures(){
        return memorySize*1000/imageSize;
    }
}
