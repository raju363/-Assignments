interface GenDemo<T>{
   void addFirst(T element);
	void append(T element);
	boolean searchElement(T element);
	
}
class StackA<T> implements GenDemo<T>
{
	T[] a;
	int index=-1;
	
	public StackA(T[] a, int index) {
		this.a = a;
		this.index = index;
	}
	public boolean isFull() {
		return index==9;
	}
	public boolean isEmpty() {
		return index==-1;
	}
	public void push(T element) {
		if(!isFull()) {
			a[index++]=element;
		}else
			throw new RuntimeException("no more elements can be added");
	}
	public T pop() {
		if(!isEmpty()) 
			return a[index--];
		else 
			throw new RuntimeException(" stack is empty");
}
	public void addFirst(T element) {
		 for(int i=index;i>0;i--) {
			a[i+1]=a[i]; 
		
		 }
			a[0]=a[7];
	}

	public void append(T element) {
		if(index<a.length)
	a[index++]=element;
		
	}

	public boolean searchElement(T element)
	{
		for(int i=0;i<a.length;i++) {
		if(a[i].equals(element))
		return true;
	}
		throw new RuntimeException("no element found");
	
	}

public abstract class StringStack implements GenDemo<T> {

	
	public void addFirst(String element) {
       for(int i=index;i>0;i--) {
    	   a[index++]=(T)element;
       }
		
	}


	public void append(String element) {
for(int i=0;i<a.length;i++) {
	a[index++]= (T) element;
}
		
	}

}
	public boolean searchElement(String element) {
 for(int i=0;i<index;i++) {
	 if(a[index].equals(element))
 
		return true;
 }
		 throw  new RuntimeException("not found");
}

	public static void main(String[] args) {


	
	}

}
