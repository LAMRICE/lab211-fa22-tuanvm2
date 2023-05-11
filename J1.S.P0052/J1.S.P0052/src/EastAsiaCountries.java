/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class EastAsiaCountries extends Country{
    private String countryTerrain;

    public EastAsiaCountries() {
    }

    public EastAsiaCountries( String countryCode, String countryName, float totalArea, String countryTerrain) {
        super(countryCode, countryName, totalArea);
        this.countryTerrain = countryTerrain;
    }

    
    @Override   
    public String display(){
        return String.format("%-15s%-15s%-15.1f%-15s\n",countryCode , countryName,
                                    totalArea,countryTerrain);
    }
            

    
    
    
}
