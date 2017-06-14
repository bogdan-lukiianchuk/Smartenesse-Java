package eu.sirotin.example.optional3;

import java.util.Optional;

import com.sun.istack.internal.Nullable;

import eu.sirotin.example.optional.CupOfWater;


public class WaterDispenser1  implements IWaterDispenser{
    @Nullable private CupOfWater mainCup;

    @Override
    public void setAvailability(@Nullable CupOfWater rainWater) {
        this.mainCup = rainWater;
    }

    @Override
    public CupOfWater getCupOfWater() {
        return Optional.ofNullable(mainCup).orElse(new CupOfWater());
    }
}
