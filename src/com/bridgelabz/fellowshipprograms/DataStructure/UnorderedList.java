package com.bridgelabz.fellowshipprograms.DataStructure;

import java.io.IOException;
import java.util.LinkedList;

import com.bridgelabz.fellowshipprograms.utility.Utility;

public class UnorderedList {

	public static void main(String[] args) throws IOException  {
			LinkedList<String> str= new LinkedList<String>();
			LinkedList<String> list= new LinkedList<String>();
			System.out.println("Enter path: ");
			String path=Utility.stringInput();
			str=Utility.readFile(path);
			System.out.println(str);
			for(String data:str)
			{
				Utility.insertLinkedList(data);
			}
			Utility.printLinkedList();
			System.out.println("Enter word to find in LinkedList: ");
			String find= Utility.stringInput();
			Utility.deleteByKey(find);
			/*
			System.out.println(ll);
			System.out.println("Enter word to find: ");
			String name= Utility.stringInput();
			boolean flag= false;
			int i;
			for(i=0; i<ll.size(); i++)
			{
				if(ll.get(i).equals(name))
				{
					flag=true;
					break;
				}
			}
			FileWriter pw= new FileWriter(file);
			if(flag)
			{
				ll.remove(name);
				System.out.println(ll);
			}
			else
			{
				ll.add(name);
				System.out.println(ll);
			}
				
			for(int j=0; j<ll.size();j++)
			{
				pw.write(ll.get(j));
				pw.write(" ");	
			}
			//pw.write(" ");
			pw.close();*/
		}	
	}


