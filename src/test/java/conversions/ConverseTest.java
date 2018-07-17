package conversions;

public class ConverseTest {
    public static void main(String[] args){
        //string2hex
        String2HexStr string2HexStr = new String2HexStr();
        String hexStr = string2HexStr.str2HexStr("中国中国中国中国中国中国中国中国中国中国中国中国,hello");
        System.out.println(hexStr);

        String hexStrArbitrary = string2HexStr.str2HexStrArbitrary("中国中国中国中国中国中国中国中国中国中国中国中国,hello");
        System.out.println(hexStrArbitrary);

        //hex2string
        Hex2String hex2String = new Hex2String();
        String originStr = "";
        for (int i = 0; i < hexStr.length(); i += 64){
            String tempStr = hex2String.hexToString(hexStr.substring(i, i + 64));
            originStr += tempStr;
        }
        System.out.println(originStr);

        String originStr2 = hex2String.hexToString(hexStrArbitrary);
        System.out.println(originStr2);
    }
}
