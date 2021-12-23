import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapSet {

	public static void main(String[] args) {
	HashMap hm=new HashMap();
	hm.put(11,"rahul");
	hm.put(10,"prahul");
	hm.put(13,"rah");
	hm.put(24,"raghu");
	hm.put(23, "sanju");
	
	System.out.println(hm);
	System.out.println("@@@@@@@@@@@@@@");
	hm.put(null, "ram");
	System.out.println(hm);

	Object obj=hm.put(null, "ganga");
	System.out.println(obj);
	System.out.println(hm);
	System.out.println(hm.put(5,"taju"));
	System.out.println(hm);
	System.out.println("@@@@@@@@@@@@@@");
	Object removed=hm.remove(10);
	System.out.println(hm);
	System.out.println(hm.replace(23, "rajya"));
	System.out.println(hm);
System.out.println("using null interface");
Set<Map.Entry<Integer, String>> s=hm.entrySet();
for(Map.Entry<Integer, String> map:s) {
	System.out.println("key is:"+map.getKey());
	System.out.println("value is:"+map.getValue());
}
	
	}

}
