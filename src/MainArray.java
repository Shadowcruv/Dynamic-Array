public class MainArray {
    public static void main(String[] args){
        //ArrayList<String> arrayList = new ArrayList<String>();

        DynamicArray dynamicArray = new DynamicArray();

        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");
        dynamicArray.add("D");
        dynamicArray.add("E");
        dynamicArray.add("F");
        dynamicArray.add("G");
        dynamicArray.add("H");
        dynamicArray.add("I");
        dynamicArray.add("J");
        dynamicArray.add("K");
        dynamicArray.add("L");
        dynamicArray.delete("E");
       // dynamicArray.insert(8,"K");

        //System.out.println(dynamicArray.search("K"));
        //dynamicArray.insert(5,"Z");
       // dynamicArray.insert(0,"V");

        System.out.println(dynamicArray.toString());
        System.out.println("size : "+dynamicArray.size);
        System.out.println("capacity : "+dynamicArray.capacity);
        System.out.println("empty : " + dynamicArray.isEmpty());



    }
}
