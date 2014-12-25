/**Copyright 2013 Ultrapower Software Co. Ltd.
 * All right reserved. 
 * @author lyz
 * @version 3.0.0
 *
 * @date 2013-12-5,下午02:48:37
 */
package Quene;

/** 
 * @ClassName: MyQueue 
 * @Description: TODO 
 * @author lyz
 * @date 2013-12-5 下午02:48:37 
 * 
 * @version 3.0.0 
 */
public class MyQueue<E> {

	private int count =0; 
	
	private int size;
	
	private int endIndex = 0 ; 
	
	private int startIndex = 0  ; 
	
	private E[] es;

	@SuppressWarnings("unchecked")
	public  MyQueue(int size) {
		es = (E[])new Object[size];
		this.size = size ;
	}
	
	
	public boolean isEmpty(){
		if(startIndex==size){
			startIndex = 0 ;
		}
		return null==es[startIndex];
	}
	
	public E add(E e){
		if(endIndex==size){
			endIndex = 0 ;
		}
		
		if(es[endIndex]==null){
			es[endIndex] = e ; 
			endIndex +=1;
			count+=1;
		}else{
			return null ;
		}
		return e ; 
	}
	
	public E take(){
		E e =null ;
		if(startIndex==size){
			startIndex = 0 ;
		}
		
		if(es[startIndex]!=null){
			e = es[startIndex];
			es[startIndex] = null;
			startIndex+=1;
			count-=1;
		}
		return e;
	}
	
	public int size(){
		return count;
	}
	
}
