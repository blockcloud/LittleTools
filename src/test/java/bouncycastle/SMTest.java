package bouncycastle;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.engines.SM2Engine;
import org.bouncycastle.crypto.engines.SM4Engine;
import org.bouncycastle.jcajce.provider.symmetric.AES;
import org.bouncycastle.jcajce.provider.symmetric.DES;
import org.bouncycastle.jcajce.provider.symmetric.SM4;
import sun.awt.SunHints;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.security.Key;
import java.security.Security;

public class SMTest {
    public static void main(String[] args) throws Exception{
        SM4Engine sm4Engine = new SM4Engine();
        String sm4Name = sm4Engine.getAlgorithmName();
        sm4Engine.getBlockSize();

        System.out.println(sm4Name);

        Security.addProvider(new org.bouncycastle.jce.provider.BouncyCastleProvider());
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(128);
        SecretKey secretKey = keyGenerator.generateKey();

        byte[] keyBytes = secretKey.getEncoded();

        Key key = new SecretKeySpec(keyBytes, "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
        cipher.init(Cipher.ENCRYPT_MODE, key);
        byte[] cipherText = cipher.doFinal("123".getBytes());

        System.out.println(cipherText);

        cipher.init(Cipher.DECRYPT_MODE, key);
        byte[] plainText = cipher.doFinal(cipherText);
        System.out.println(plainText);
        System.out.println("123".getBytes());
    }
}
