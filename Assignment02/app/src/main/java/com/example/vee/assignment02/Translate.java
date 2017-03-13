package com.example.vee.assignment02;


public class Translate {

     double tlTOusd(double a){

        return a / 3.10105405 ;
    }
   double tlTOeuro(double a){

        return a / 3.41900512;
    }
    double usdTOtl(double a){

        return a * 3.10105405;
    }
    double euroTOtl(double a){

        return a * 3.41900512;
    }
}
