package conversions;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;

public class String2HexStr {
    //converse a string to a hexstr of arbitrary length
    public String str2HexStrArbitrary(String value){
        return String.format("%x", new BigInteger(1, value.getBytes(StandardCharsets.UTF_8)));
    }

    //converse a string to a hexStr, length of hexStr is multiple of 64, use "0" to complete
    public String str2HexStr(String value) {
        if (value == null){
            value = "";
        }
        String hexStr = "";
        String tempHexStr = "";
        int valueLen = value.length();
        int hexLen = 0;
        for (int i = 0; i < valueLen; i++){
//            String singleStr = value.substring(i, i+1);
            String singleHexStr = String.format("%x", new BigInteger(1, value.substring(i, i+1).getBytes(StandardCharsets.UTF_8)));
            int singleLen = singleHexStr.length();
            hexLen += singleLen;
            if (hexLen > 64){
                int extraLen = singleLen - (hexLen - 64);
                String extraStr = "";
                for (int j = 0; j < extraLen; j++){
                    extraStr += "0";
                }
                tempHexStr = extraStr + tempHexStr;
                hexStr += tempHexStr;
                hexLen = singleLen;
                tempHexStr = singleHexStr;
            } else {
                tempHexStr += singleHexStr;
            }
        }
        int tempStrLen = tempHexStr.length();
        String tempExtraStr = "";
        for(int i = 0; i <(64 -tempStrLen); i++){
            tempExtraStr += "0";
        }
        tempHexStr = tempExtraStr + tempHexStr;
        hexStr += tempHexStr;

        return hexStr;
    }
}
