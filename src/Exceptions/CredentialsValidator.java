package Exceptions;

import java.util.Objects;
public class CredentialsValidator {
    private static final String INVALID_LENGTH = "Длина может быть от 1 до 20";
    private static final String INVALID_SYMBOL = "Строка должна оодержать тольколатинские буквы, цифры или знак подчеркивания";
    private static final String PASSWORDS_NOT_MATCH = "Пароль и подтверждения пароля не совпадают";

    public static boolean validateCredentials (String login, String password, String confirmPassword){
        if (isLengthNotInRange (login, min: 1, max: 20)) {
            throw new WrongLoginException (INVALID_LENGTH);
        }
        if (isSymbolsNotVolid(login)){
            throw new WrongLoginException (INVALID_SYMBOL);
        }
        if (!isValid(login)){
            throw new WrongLoginException ("Validation Failed");
        }
        if (isLengthNotInRange (login, min: 1, max: 20)){
            throw new WrongLoginException (INVALID_LENGTH);
        }
        if (isSymbolsNotVolid (password)){
            throw new WrongLoginException (INVALID_SYMBOL);
        }
        if (!Objects.equals(password, confirmPassword)){
            throw new WrongLoginException (PASSWORDS_NOT_MATCH);
        }
        return true;
    }
    private static boolean is valid (String value){
        if (value == null value.isEmpty()){
            return false;
        }
        return value.matches (regex: "[a-ZA-ZO-9] {1. 20} S");
    }
    private  static boolean isLengthNotInRange (String vlue, int min, int max){
        if (value == null){
            return true;
        }
        int length = value.length();
        return length < min || length > max;
    }
    private static boolean isSymbolsNotVolid (String value){
        if (value == null || valie.isEmpty()){
            return true;
        }
        for ( Char c: value.toCharArray()){
            boolean symbolMatches = (c >= 'a' && c <= 'z') || c >= 'A' && c <= 'z') || (Character.isDigit(c)) || (c == '-');
            if ( ! SymbolMatches){
                return true;
            }
        }
        return false;
    }

}
