
public class MiArrayList {
	private int size;
	private static final int DEFAULT_CAPACITY = 10;
	private int elements[];
	
	public MiArrayList(){
		size = 0;
		elements = new int[DEFAULT_CAPACITY];
		
	}
	public int size(){
		return size;
	}
	public void add(int e) {
		elements[size]=e;
		size = size+1;
	}
	public void add(int index, int e) throws ArrayIndexOutOfBoundsException{
		if(index<=size) {
			for(int i = size+1;i>index;i--) {
				elements[i]=elements[i-1];
			}
			elements[index]=e;
		}else {
			throw new ArrayIndexOutOfBoundsException("Usuario el index sobrepasa el tamaño");
		}
	}
	public void new_array(int index,int e) throws ArrayIndexOutOfBoundsException{
        if(index== elements.length+1){
            elements = new int[DEFAULT_CAPACITY*2];
            elements[index]=e;
        }else{
        throw new ArrayIndexOutOfBoundsException("Usuario el index sobrepasa el tamaño");
        }
}
}
