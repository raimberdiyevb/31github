package DesignParkingSystem;

public class ParkingSystem {
    public int placesForBig;
    public int placesForMid;
    public int placesForSmall;

    public ParkingSystem(int big, int medium, int small) {
        placesForBig = big;
        placesForMid = medium;
        placesForSmall = small;
    }

    public boolean addCar(int carType) {
        boolean res = false;
        if(carType == 1){
            if(placesForBig != 0){
                placesForBig--;
                res = true;
            }
        } else if( carType == 2){
            if(placesForMid != 0){
                placesForMid--;
                res = true;
            }
        } else {
            if(placesForSmall != 0){
                placesForSmall--;
                res = true;
            }
        }
        return res;
    }
}
