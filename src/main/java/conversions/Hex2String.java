package conversions;

import org.web3j.utils.Numeric;

import java.nio.charset.StandardCharsets;

public class Hex2String {
    public String hexToString(String hex) {
        return new String(Numeric.hexStringToByteArray(hex), StandardCharsets.UTF_8).trim();
    }

    public String hexToString2(String hex) {
        return new String(Numeric.hexStringToByteArray(hex), StandardCharsets.UTF_16).trim();
    }
}
