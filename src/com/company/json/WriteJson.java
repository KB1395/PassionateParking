package com.company.json;

import com.company.Place;
import com.company.Size;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;


public class WriteJson {
    public static void main(String[] args) throws IOException {
        OutputStream fileoutputstream = new FileOutputStream("Parking.json");


        Size newSize = new Size(200,300);
        Place newPlace = new Place(newSize);
        System.out.println(newPlace.toString());
    }
}
