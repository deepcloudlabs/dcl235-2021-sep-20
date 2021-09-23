package com.example.newfeatures.se7;

public class TryWithResources {

	public static void main(String[] args) throws Exception {
        try(
        		MyResource res1 = new MyResource();
        		MyResource res2 = new MyResource();
        		MyResource res3 = new MyResource();
        		) {
        	// using resources res1 and res2
        	throw new IllegalArgumentException();
        } 
	}

}

class MyResource implements AutoCloseable {
	public void close() throws Exception {
		System.err.println("Closing the resource...");
	}
}