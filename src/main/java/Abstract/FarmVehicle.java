package Abstract;

import Interface.Rideable;

import java.util.ArrayList;


public class FarmVehicle implements Rideable {
  
    public boolean hasRider = false;

        ArrayList<Object> farmVehicle = new ArrayList<>();

        public void add(Object vehicle){
            farmVehicle.add(vehicle);
        }
        public boolean contains (Object vehicle){
            return farmVehicle.contains(vehicle);
        }

    @Override
    public boolean ride() {
        return false;
    }

    public String makeNoise() {
            return "Noise";

    }

}

