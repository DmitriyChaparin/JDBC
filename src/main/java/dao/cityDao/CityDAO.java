package dao.cityDao;

import models.City;


public interface CityDAO {
    City findById(Integer id) ;

    void addNewCity(City city);

    void updateCity(City city);

    void deleteCityById(City city);
}
