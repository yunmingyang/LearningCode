import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

public final class Diectory {
    public static File[]
    local(File dir,final String regex){
        return dir.listFiles(new FilenameFilter() {
            private Pattern pattern;
            public boolean accept(File dir, String name) {
                return pattern.matcher(new File(name).getName()).matches();
            }
        });
    }
    public static File[]
    local(String path,final String regex){
        return local(new File(path),regex);
    }
}


class  TreeInfo implements Iterable<File>{
    public List<File> files = new ArrayList<File>();
    public List<File> dirs = new ArrayList<File>();
    public Iterator<File> iterator(){
        return files.iterator();
    }
    void addAll(TreeInfo other){
        files.addAll(other.files);
        dirs.addAll(other.files);
    }

    @Override
    public String toString() {
        //TODO:打印dirs以及files
        return "dirs: " + PPrint.pformat(dirs) +
                "\n\nfiles:" + PPrint.pformat(files);
    }

    public static  TreeInfo
    walk(File start,String regex){
        return recurseDirs(start,regex);
    }
    public static TreeInfo walk(File start){
        return recurseDirs(start,",");
    }
    public static TreeInfo walk(String start){
        return recurseDirs(new File("start"),".");
    }
    static TreeInfo recurseDirs(File startDir,String regex){
        TreeInfo result = new TreeInfo();
        for(File item : startDir.listFiles()){
            if(item.isDirectory()){
                result.dirs.add(item);
                result.addAll(recurseDirs(item,regex));
            }else{
                if(item.getName().matches(regex))
                    result.files.add(item);
            }
        }
        return result;
    }
    public static void main(String[] args){
        if(args.length == 0)
            System.out.println(walk("C://"));
        else
            for(String arg : args)
                System.out.println(walk(arg));
//        char c = 'a' ;
//        DataInputStream dataInputStream = new DataInputStream(System.in);
//        DataOutputStream dataOutputStream = new DataOutputStream(System.out);

//        try{
//            System.out.println(dataInputStream.read(bytes));
//        }catch(IOException e){
//            e.printStackTrace();
//        }
//        do{
//            try{
//                c = dataInputStream.readChar();
//                System.out.println(c);
//            }catch(IOException e){
//                e.printStackTrace();
//            }
//        }while(c != 'q');

    }
}

class PPrint{
    //pformat方法，返回一个String对象，接收一个泛型为"？"的集合
    public static String pformat(Collection<?> c){
        if(c.size() == 0) return "[]";
        StringBuilder str = new StringBuilder("[");
        for(Object o : c){
            if(c.size() != 1)
                str.append("\n ");
            str.append(o);
        }
        if(c.size() != 1)
            str.append("\n ");
        str.append("]");
        return str.toString();
    }
    //pprint方法，接收一个泛型为"？"的集合，调用pformat()方法
    public static void pprint(Collection<?> c){
        System.out.println(pformat(c));
    }
    //pprint方法，接收一个Object的数组，调用pformat()方法
    public static void pprint(Object[] c){
        System.out.println(pformat(Arrays.asList(c)));
    }
}