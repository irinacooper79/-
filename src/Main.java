package exceptions;

import Exceptions.CredentialsValidator;

public class HomeworkExceptions {
    public static void main(String[] args) {
        System.out.println("checkCredentials");

        (login:"login", password:"password", confirmpassword:"password");
        (login:"login", password:"password", confirmpassword:"password");
        (login:"login", password:"password", confirmpassword:"password");
        (login:"login", password:"password", confirmpassword:"password");
        (login:"login", password:"password", confirmpassword:"password");
        (login:"login", password:"password", confirmpassword:"password");
        (login:"login", password:"password", confirmpassword:"password");
    }

    public static boolean checCredentials(String login, String password, String confirmPassword);
    try

    {
        return CredentialsValidator.validateCredentials(login, password, confirmpassword);
    } catch(
    WrongLoginException e)

    {
        System.out.println("Ошибка при валидации логина:" + е.getMessage());
        return false;
    } catch(
    WrongLoginException e)

    {
        System.out.println("Ошибка при валидации пароля:" + e.getMessage());
        return false;
    }
}


    }
}