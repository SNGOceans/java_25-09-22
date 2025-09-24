package day14;

public class CustomException {

    public static void main(String[] args) {
        PasswordTest pt = new PasswordTest();
        //String password = null;
        String password = "12345";
        
        try {
            pt.setPassword(password);
            System.out.println(pt.getPassword());
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Test 종료");
    }
}

class PasswordTest {

    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) throws PasswordException {
        // 비밀번호는 null일 수 없다.
        if (password == null) {
            throw new PasswordException("비밀번호는 null일 수 없습니다.");
        }

        // 비밀번호는 5글자 이상이어야 한다.
        if (password.length() < 5) {
            throw new PasswordException("비밀번호는 5글자 이상이어야 합니다.");
        }

        // 비밀번호는 문자로만 이루어지면 안 된다. (숫자 또는 특수문자 포함 필요)
        if (password.matches("[a-zA-Z]+")) {
            throw new PasswordException("비밀번호는 문자 외에 숫자 또는 특수문자를 포함해야 합니다.");
        }

        this.password = password;
    }
}