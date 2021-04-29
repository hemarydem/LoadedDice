import java.util.concurrent.ThreadLocalRandom;

public class RandObj {
    private Integer faceNumber;

    public Integer getFaceNumber() {
        return faceNumber;
    }

    public void setFaceNumber(Integer faceNumber) {
        this.faceNumber = faceNumber;
    }

    public  Integer roll(){
        return ThreadLocalRandom.current().nextInt(1, this.faceNumber + 1);
    }
}
