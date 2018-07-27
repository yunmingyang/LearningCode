package OtherTest;

import io.fabric8.kubernetes.api.model.NamespaceList;
import io.fabric8.kubernetes.client.DefaultKubernetesClient;
import io.fabric8.kubernetes.client.KubernetesClient;

import java.io.File;
import java.io.FileInputStream;

/**
 * Created by yangyunming on 2018/7/6
 */
public class K8STest {
//    当前可以当做主函数的第一个参数来当做config文件的路径
//    public static void main(String[] args) {
//        String encoding = "UTF-8";
//        File file = new File(args[0]);
//        byte[] content = new byte[((Long)file.length()).intValue()];
//        try {
//            FileInputStream in = new FileInputStream(file);
//            in.read(content);
//            in.close();
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//        String str = null;
//        try {
//            str = new String(content,encoding);
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//        KubernetesClient client = DefaultKubernetesClient.fromConfig(str);
//        NamespaceList namespaceList = client.namespaces().list();
//        System.out.println(namespaceList.getItems());
//    }
}
