import com.javacodegeeks.abk.MD5Encryptor;
import com.javacodegeeks.abk.SHA;
import com.javacodegeeks.abk.SHA256;

public class EncryptorFacade {
    public String encrypt(String type, String text) {
        String hash = "";
        if (type == "MD5") {
            MD5Encryptor e = new MD5Encryptor();
            hash = e.encrypt(text);
        } else if (type == "SHA") {
            SHA e = new SHA();
            hash = e.encrypt(text);
        } else if (type == "SHA256") {
            SHA256 e = new SHA256();
            hash = e.encrypt(text);
        }
        return hash;
    }
}