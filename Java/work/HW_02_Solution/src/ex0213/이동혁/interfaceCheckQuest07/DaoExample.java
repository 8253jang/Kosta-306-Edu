package ex0213.이동혁.interfaceCheckQuest07;

public class DaoExample {
    public static void dbWork(DataAccessObject dao) {//OracleDao or MySqlDao
        dao.select();
        dao.insert();
        dao.delete();
        dao.update();
    }

    public static void main (String[] args) {
        dbWork(new OracleDao());
        dbWork(new MySqlDao());
    }
}
