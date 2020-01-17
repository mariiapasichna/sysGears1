package com.mariiapasichna;

import org.json.JSONObject;

public class Converter {
    private String str;

    public Converter(String str) {
        this.str = str;
    }

    public void convert() {
        str = str.trim();
        str = str.replace(',', '.');
        double x = Double.parseDouble(str.substring(0, str.length() - 2));
        char ch = str.charAt(str.length() - 1);
        switch (ch) {
            case 'C':
                convertCelsius(x);
                break;
            case 'K':
                convertKelvin(x);
                break;
            case 'F':
                convertFahrenheit(x);
                break;
            default:
                throw new RuntimeException("Unexpected: " + ch);
        }
    }

    private void convertFahrenheit(double x) {
        String c = Math.round(x - 32 / 1.8) + "C";
        String k = Math.round(x + 459.67 / 1.8) + "K";
        JSONObject jo2 = new JSONObject();
        jo2.put("K", k);
        jo2.put("C", c);
        System.out.println(jo2);
    }

    private void convertKelvin(double x) {
        String c = Math.round(x - 273.15) + "C";
        String f = Math.round(x * 1.8 - 459.67) + "F";
        JSONObject jo1 = new JSONObject();
        jo1.put("C", c);
        jo1.put("F", f);
        System.out.println(jo1);
    }

    private void convertCelsius(double x) {
        String k = Math.round(x + 273.15) + "K";
        String f = Math.round(x * 1.8 + 32) + "F";
        JSONObject jo = new JSONObject();
        jo.put("K", k);
        jo.put("F", f);
        System.out.println(jo);
    }
}