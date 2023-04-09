package dao.cityDao;

import connection.HibernateSessionFactoryUtil;
import models.City;
import org.hibernate.Session;
import org.hibernate.Transaction;
import Exception.NotInDatabaseException;

public class CityDAOImpl implements CityDAO {


    @Override
    public City findById(Integer id) {
        City city = HibernateSessionFactoryUtil.getSessionFactory().openSession()
                .get(City.class, id);
        if (city == null) {
            throw new NotInDatabaseException("Город не найден в базе данных");
        }
        return city;
    }

    @Override
    public void addNewCity(City city) {
        try (Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.save(city);
            transaction.commit();
        }
    }

    @Override
    public void updateCity(City city) {
        try (Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.update(city);
            transaction.commit();

        }
    }

    @Override
    public void deleteCityById(City city) {
        try (Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.delete(city);
            transaction.commit();
        }
    }
}
