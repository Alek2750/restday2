/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.webtrade.todelete.presentation;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dk.webtrade.todelete.data.DataFacade;

/**
 *
 * @author thomas
 */
public class TheSerializor {
    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();
    private static final DataFacade DF = new DataFacade();
    
    public static void main(String[] args) {
         DF.populate();
//         DF.getAllCustomersDTO().forEach((el)->System.out.println(el));
         
        DF.getAllAddresses().forEach((el)->System.out.println(el));
        //System.out.println(gson.toJson(DF.getAllAddresses()));  //Bad call
        System.out.println(gson.toJson(DF.getAllCustomersDTO())); //GOOD CALL
    }}