package com.chapter12;

/**
 * Created by yangyunming on 2018/7/24
 */
class DynamticFieldsException extends Exception{}
public class DynamticFields {
    private Object[][] fields;
    public DynamticFields(int size){
        fields = new Object[size][2];
        for (int i = 0; i < size; i++) {
            fields[i] = new Object[]{null,null};
        }
    }

    public String toString(){
        StringBuilder result = new StringBuilder();
        for (Object[] obj:fields) {
            result.append(obj[0]);
            result.append(": ");
            result.append(obj[1]);
            result.append("\n");
        }
        return result.toString();
    }
    private int hasField(String id){
        for (int i = 0; i < fields.length; i++) {
            if (id.equals(fields[i][0]))
                return i;
        }
        return -1;
    }
    private int
    getFieldNumber(String id)throws NoSuchFieldException{
        int fieldNum = hasField(id);
        if(fieldNum == -1)
            throw new NoSuchFieldException();
        return fieldNum;
    }
    private int makeFiled(String id){
        for (int i = 0; i < fields.length; i++) {
            if(fields[i][0] == null){
                fields[i][0] = id;
                return i;
            }
        }
        Object[][] tmp = new Object[fields.length + 1][2];
        for (int i = 0; i < fields.length; i++) {
            tmp[i] = fields[i];
        }
        for (int i = fields.length; i < tmp.length; i++) {
            tmp[i] = new Object[]{null,null};
        }
        fields = tmp;
        return makeFiled(id);
    }
    public Object
    getField(String id)throws NoSuchFieldException{
        return fields[getFieldNumber(id)][1];
    }
    public Object setField(String id,Object value)throws  DynamticFieldsException{
        if (value == null){
            DynamticFieldsException dfe = new DynamticFieldsException();
            dfe.initCause(new NullPointerException());//此处由于value报一个自定义异常，且将NPE通过initCause插入当前抛出的异常对象中
            throw dfe;
        }
        int fieldNumber = hasField(id);
        if (fieldNumber == -1)
            fieldNumber = makeFiled(id);
        Object result = null;
        try{
            result = getField(id);
        }catch (NoSuchFieldException e){
            throw new RuntimeException(e);
        }
        fields[fieldNumber][1] = value;
        return result;
    }

    public static void main(String[] args) {
        DynamticFields df = new DynamticFields(3);
        System.out.print(df);
        try{
            df.setField("d","A value for d");
            df.setField("Number",47);
            df.setField("number2",48);
            System.out.print("df: " + df);
            df.setField("d","A new value for d");
            df.setField("Number3",11);
            System.out.print("df: " + df);
            System.out.print("df.getField(\"d\"): " + df.getField("d"));
            Object field = df.setField("d",null);
        }catch (NoSuchFieldException e){
            e.printStackTrace(System.out);
        }catch (DynamticFieldsException e){
            e.printStackTrace(System.out);
        }
    }
}
