package com.example.assignment;
import Model.City;
import Model.Country;
import Model.State;
import org.springframework.cglib.core.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;


@RestController
public class DataProvider {

   @GetMapping("/CountryData")
   public ArrayList<Country> CountryProvider() {

       ArrayList<Country> country = new ArrayList<>();


       country.add(new Country(1,"India"));
       country.add(new Country(2,"USA"));
       country.add(new Country(3,"Australia"));
       country.add(new Country(4,"China"));

       return country;
   }


    @GetMapping("/StateData")
    public ArrayList<State> StateProvider(@RequestParam(value = "cid", defaultValue = "0")int cid,
                                          @RequestParam(name = "country",defaultValue = "")String country) {

       ArrayList<State> state = new ArrayList<>();

        state.add(new State(1,"Karnataka",1,"India"));
        state.add(new State(2,"TamilNadu",1,"India"));
        state.add(new State(3,"California",2,"USA"));
        state.add(new State(4,"Texas",2,"USA"));
        state.add(new State(5,"Victoria",3,"Australia"));
        state.add(new State(6,"Tasmania",3,"Australia"));
        state.add(new State(7,"Hebei",4,"China"));
        state.add(new State(8,"Sichuan",4,"China"));

        var response = new ArrayList<>(state);

        CollectionUtils.filter(response, o -> ((State) o).getCid()==cid || ((State) o).getCountry().equals(country));

        return response;
    }




    @GetMapping("/CityData")
    public ArrayList<City> CityProvider(@RequestParam(name = "sid",defaultValue = "0")int sid,
                                        @RequestParam(name = "state",defaultValue = "")String state) {

       ArrayList<City> city = new ArrayList<>();

        city.add(new City(1,"Bangalore",1,1,"Karnataka"));
        city.add(new City(2,"Mangalore",1,1,"Karnataka"));
        city.add(new City(3,"Chennai",1,2,"TamilNadu"));
        city.add(new City(4,"Madurai",1,2,"TamilNadu"));
        city.add(new City(5,"Los Angeles",2,3,"California"));
        city.add(new City(6,"San Deigo",2,3,"California"));
        city.add(new City(7,"Houston",2,4,"Texas"));
        city.add(new City(8,"Dallas",2,4,"Texas"));
        city.add(new City(9,"Melbourne",3,5,"Victoria"));
        city.add(new City(10,"Geelong",3,5,"Victoria"));
        city.add(new City(11,"Hobart",3,6,"Tasmania"));
        city.add(new City(12,"Launceston",3,6,"Tasmania"));
        city.add(new City(13,"Wuhan",4,7,"Hebei"));
        city.add(new City(14,"Yichang",4,7,"Hebei"));
        city.add(new City(15,"Leshan",4,8,"Sichuan"));
        city.add(new City(15,"Deyang",4,8,"Sichuan"));


        var response = new ArrayList<>(city);

        CollectionUtils.filter(response, o -> ((City) o).getSid()==sid || ((City) o).getState().equals(state));

        return response;
    }






}
