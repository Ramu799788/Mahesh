package com.assited.project;


	
	
	class Accessmodifiers{
		  void display() 
		     { 
		         System.out.println("You are using defalut access specifier"); 
		     } 
		} 
	public class Accessmodifier{
			public static void main(String[] args) {
				
				//default
				System.out.println("Dafault Access Specifier");
				 Accessmodifiers obj = new  Accessmodifiers(); 		  
		        obj.display(); 

			}
		}




