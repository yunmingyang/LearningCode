import java.util.HashMap;
import java.util.Map;

public class FinallyTest {
    public static void main(String[] args){
        Map<String,String> map1 = getMap();
        System.out.println(getMap().get("KEY").toString());
    }
    public static Map<String,String> getMap(){
        Map<String,String> map = new HashMap<String,String>();
        map.put("KEY","INIT");
        try{
            map.put("KEY","TRY");
            return map;//此处已经返回map,但是还要走一遍finally,finally中虽然对进行map操作,但是由于此时已经返回,对原址进行操作可以，
            // 改变原址已经返回,再更改map地址已经失效
        }catch(Exception e){
            map.put("KEY","CATCH");
        }finally {
            map.put("KEY","FINALLY");
            map = null;
        }
        return null;
    }
}
