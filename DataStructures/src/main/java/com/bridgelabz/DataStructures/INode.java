package com.bridgelabz.DataStructures;

public interface INode <K> {
	
	//declaring node methods 
	void setKey(K key);
	K getKey();
	void setNext(INode <K> next);
	INode <K> getNext();

}
