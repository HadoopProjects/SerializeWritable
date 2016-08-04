package com.rahul.serializewritable;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import org.apache.hadoop.io.IntWritable;

public class SerializeWritable {

	public static void main(String[] args) throws IOException {

		IntWritable intWritable = new IntWritable(1002);
		
		// Serialize
		ByteArrayOutputStream os = new ByteArrayOutputStream();
		DataOutputStream dos = new DataOutputStream(os);
		intWritable.write(dos);
		
		byte[] output = os.toByteArray();
		
		// Deserialize
		IntWritable finaloutput = new IntWritable();
		ByteArrayInputStream is = new ByteArrayInputStream(output);
		DataInputStream dis = new DataInputStream(is);
		finaloutput.readFields(dis);
		System.out.println(finaloutput.get());
		
	}

}
