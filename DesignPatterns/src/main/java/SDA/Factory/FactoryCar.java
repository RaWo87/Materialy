package SDA.Factory;

public class FactoryCar {

    public enum FuelType {
        BENZIN,
        DIESEL,
        ELECTRIC
    }
    // jezeli chcemy mieć powszechny dostep do fabryki bez fizycznego jej tworzenia
    // musimy pamietac o ustawieniu metod jako statyczne
    public static Car createCar(FuelType type){
        switch (type){
            case BENZIN:
                return new BenzinCar();
            case DIESEL:
                return new DieselCar();
            case ELECTRIC:
                return new ElectricCar();
        }
        throw new IllegalArgumentException("fuel type "+ type + " is not a valid type.");
    }



}
