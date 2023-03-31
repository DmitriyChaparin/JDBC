package dao.cityDao;

import models.City;

import java.sql.SQLException;

public interface CityDAO {
    City findById(Integer id) throws SQLException;
}
