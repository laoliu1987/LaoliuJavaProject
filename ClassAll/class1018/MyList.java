package ClassAll.class1018;


import java.util.Arrays;

public class MyList<E> implements IMyList<E>{

    private Object[] elementData;
    //初始化数组大小
    private static final int initialCapacity =10;
    //记录元素的个数
    private int size;
    public MyList(){
        this(10);
    }
    public MyList(int initialCapacity){
        this.elementData=new Object[initialCapacity];
    }
    public boolean add(E e){
        //确保数组能够存下
        ensureCapacityInternal(size+1);
        elementData[size++]=e;
        return  true;
    }
    public boolean add(int index,E e){
        //判断index是否在范围内

        //确保数组能够存下
        ensureCapacityInternal(size+1);
        //复制数组（元素后移）
        //插入元素
        //size++


        return  true;
    }
    public void ensureCapacityInternal(int minCapacity){
        //如果minCapacity>elementData.length，进行扩充1.5倍；
        if(minCapacity> elementData.length){
            int newCapacity= elementData.length+elementData.length>>2;
            elementData= Arrays.copyOf(elementData,newCapacity);
        }
    }
}
