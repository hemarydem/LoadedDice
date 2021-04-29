public class Dice extends RandObj {
    public Dice(Integer nbFace) {
        this.setFaceNumber(nbFace);

        if( this.getFaceNumber() > 20)
            this.setFaceNumber(20);

        if ( this.getFaceNumber() <= 3)
            this.setFaceNumber(4);
    }
}
