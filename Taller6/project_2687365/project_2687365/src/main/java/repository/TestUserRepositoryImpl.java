package repository;

import model.User;

import java.sql.SQLException;


public class TestUserRepositoryImpl {
    public static void main(String[] args) throws SQLException {
        Repository<User> repository = new UserRepositoryImpl();

        System.out.println("========saveObj Insert===========");
        User userInsert1 = new User();
        userInsert1.setUser_fistname("Nicol");
        userInsert1.setUser_lastname("Garcia");
        userInsert1.setUser_email("Nicol@mail.com");
        userInsert1.setUser_password("Nicol12");
        repository.saveObj(userInsert1);

        User userInsert2 = new User();
        userInsert2.setUser_fistname("jeffersom");
        userInsert2.setUser_lastname("pulido");
        userInsert2.setUser_email("pulido@mail.com");
        userInsert2.setUser_password("jefferson142");
        repository.saveObj(userInsert2);


        System.out.println("========== listaObj =========");
        repository.listAllObj().forEach(System.out::println);
        System.out.println();

        System.out.println("========== byIdObj ===========");
        System.out.println(repository.byIdObj(1));
        System.out.println();

        System.out.println("============== saveObj ===========");
        User userUpdate = new User();
        userUpdate.setUser_fistname("Andrea");
        userUpdate.setUser_lastname("Garcia");
        userUpdate.setUser_email("andrea28512@mail.com");
        userUpdate.setUser_password("andrea257112");
        repository.listAllObj().forEach(System.out::println);
        System.out.println();

        System.out.println("========== deleteObj ============");
        repository.deleteObj(2);
        repository.listAllObj().forEach(System.out::println);

    }
}


