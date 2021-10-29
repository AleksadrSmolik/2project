import ru.suptex.Dao.Dao;
import ru.suptex.Dao.impl.modelDaoImpl;
import ru.suptex.Util.Connector;
import ru.suptex.model.Model;

import java.sql.Connection;

public class Test {
    public static void main(String[] args) {
        Connection connection = Connector.getInstance();
        Dao<Model, Integer> modelDao = new modelDaoImpl(connection);

        System.out.println(modelDao.findById(1));

        Model userUpdater = modelDao.findById(1);
        userUpdater.setMark("VW");
        userUpdater.setBodyType("Sedan");
        modelDao.update(userUpdater);

        modelDao.findAll().forEach(System.out::println);

//        modelDao.save(new Model("Chevrolet", "Sedan", "Benzol" ));

        modelDao.delete(5);

        Connector.close(connection);
    }

}
