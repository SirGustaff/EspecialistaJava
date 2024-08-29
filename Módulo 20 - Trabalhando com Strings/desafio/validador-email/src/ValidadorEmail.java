public class ValidadorEmail {

    public static boolean validar(String email) {

        if(!arrobaIsValido(email)) return false;

        else if (!containsPonto(email)) return false;

        else if (!indexOfArrobaMenorQueIndexOfPonto(email)) return false;

        else if(!nomeUsuarioIsValido(email)) return false;

        else if (!dominioIsValido(email)) return false;

        else return sufixoIsValido(email);
    }

    private static boolean arrobaIsValido(String email) {

        int firstIndexOfArroba = email.indexOf('@');

        int lastIndexOfArroba = email.lastIndexOf('@');

        if (firstIndexOfArroba == -1) {
            return false;
        } else if(firstIndexOfArroba != lastIndexOfArroba) {
            return false;
        }

        return true;
    }

    private static boolean containsPonto(String email) {
        return email.lastIndexOf('.') != -1;
    }

    private static boolean indexOfArrobaMenorQueIndexOfPonto(String email) {
        return email.indexOf('@') < email.lastIndexOf('.');
    }

    private static boolean nomeUsuarioIsValido(String email) {

        String nomeUsuario = email.substring(0, email.indexOf("@"));

        if (nomeUsuario.isEmpty()) {
            return false;
        }

        for (int i = 0; i < nomeUsuario.length(); i++) {

            Character caractereNomeUsuario = nomeUsuario.charAt(i);

            if (!(Character.isLetter(caractereNomeUsuario) || Character.isDigit(caractereNomeUsuario))) {
                if (!(caractereNomeUsuario.equals('.') || caractereNomeUsuario.equals('-') || caractereNomeUsuario.equals('_'))) {
                    return false;
                }
            }
        }

        return true;
    }

    private static boolean dominioIsValido(String email) {

        String dominio = email.substring(email.indexOf('@') + 1, email.lastIndexOf('.'));

        if(dominio.isEmpty()) {
            return false;
        }

        for (int i = 0; i < dominio.length(); i++) {

            Character caractereDominio = dominio.charAt(i);

            if(Character.isLetter(caractereDominio)) {
                if(Character.isUpperCase(caractereDominio)) {
                    return false;
                }
            } else if (!Character.isDigit(caractereDominio)) {
                if (!(caractereDominio.equals('-') || caractereDominio.equals('.')))
                    return false;
            }

        }

        return true;
    }

    private static boolean sufixoIsValido(String email) {

        String sufixo = email.substring(email.lastIndexOf('.') + 1);

        int sufixoLenght = sufixo.length();

        if(!(sufixoLenght == 2 || sufixoLenght == 3)) return false;

        for (int i = 0; i < sufixoLenght; i++) {

            Character caractereSufixo = sufixo.charAt(i);

            if(!(Character.isLetter(caractereSufixo) && Character.isLowerCase(caractereSufixo))) {
                return false;
            }

        }

        return true;
    }
}