/**
 * File : MainDAO.java
 * Penulis : Abida Akbar Rusyadin
 * Deskripsi : Main program untuk akses DAO
 */

public class MainDAO {
    public static void main(String[] args){
        Person person = new Person("Indra");
        DAOManager m = new DAOManager();
        m.setPersonDAP(new MySQLPersonDAO());
        try{
            m.getPersonDAO().savePerson(person);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
