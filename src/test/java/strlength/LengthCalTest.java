package strlength;

public class LengthCalTest {
    public static void main(String[] args){
        LengthCal lengthCal = new LengthCal();
        System.out.println(lengthCal.strLength("03a0e2a3a31ab76280504d6c9338961bec25eb7a3e0e638fc4f6de03bf8f6b6caa"));

        System.out.println("签名长度1: " + lengthCal.strLength("30450221009c5a81db68533aab8febffe1e93a46006dfcf1c52bd6ec5de0b72d94d73335e202200dabad73acaa18b13ccd4929519328e5240f9bce3897dfbf048b50159d684c4a01"));
        System.out.println("签名长度1: " + lengthCal.strLength("3044022067922b6fb88a2704f901aa6b2155a8349ce01e8a3c1cc047511ca62b3529830202201b81f064fb0d2e40f308ed3c4c905430a97f697a2bb0435a8df7f63afcc7730801"));
        System.out.println("签名长度1: " + lengthCal.strLength("3045022100f9c860e9a1939766773f765a1cabd0837ea5dbce91b6574c3730e7a16c3c29ec02204a1bcad9ff7a6edd9dd336df05f82a57d0a066450eacee8706aaaab715ed847e01"));
        System.out.println("签名长度1: " + lengthCal.strLength("30440220498900ee3b525fa344489ac3bfdf447379a83b5bd0184b3213b0f4a1868dc0f20220161f5d27a87b8722d99e3e272924c3472cd95096c0d6fe34594d607a5436707301"));
        System.out.println("签名长度1: " + lengthCal.strLength("0xf92be20e8502540be400830f424094c72bd346a00f48a62cccdf4793cff8dd2c096ac887038d7ea4c68000b92b74"));
        System.out.println("字符串长度: " + lengthCal.strLength("0x0000000000000000000000000000000000000000"));
        System.out.println("字符串长度: " + lengthCal.strLength("0x0dbd369a741319fa5107733e2c9db9929093e3c7"));
    }
}
