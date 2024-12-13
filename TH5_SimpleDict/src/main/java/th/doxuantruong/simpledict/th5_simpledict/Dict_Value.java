package th.doxuantruong.simpledict.th5_simpledict;

import java.util.HashMap;

public class Dict_Value {
  public static class PhienAm {
    String nghia;
    String phienam;

    public PhienAm(String nghia, String phienam) {
      this.nghia = nghia;
      this.phienam = phienam;
    }
  }
  HashMap<String, PhienAm> value = new HashMap<>();
  public Dict_Value() {
    value.put("Hello", new PhienAm("Xin chào", "həˈloʊ"));
    value.put("Bye", new PhienAm("Chào tạm biệt", "baɪ"));
    value.put("Morning", new PhienAm("Buổi sáng", "ˈmɔːrnɪŋ"));
    value.put("Afternoon", new PhienAm("Buổi chiều", "ˌæftərˈnuːn"));
    value.put("Evening", new PhienAm("Buổi tối", "ˈiːvnɪŋ"));
    value.put("Sunset", new PhienAm("Hoàng hôn", "ˈsʌnˌsɛt"));
    value.put("Sunrise", new PhienAm("Bình minh", "ˈsʌnˌraɪz"));
    value.put("Tomorrow", new PhienAm("Ngày mai", "təˈmɑːroʊ"));
    value.put("Yesterday", new PhienAm("Ngày hôm qua", "ˈjɛstərdeɪ"));
    value.put("Today", new PhienAm("Ngày hôm nay", "təˈdeɪ"));
    value.put("Thank you", new PhienAm("Xin cảm ơn", "ˈθæŋk juː"));
  }
}
