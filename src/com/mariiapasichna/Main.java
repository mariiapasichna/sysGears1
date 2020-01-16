package com.mariiapasichna;

public class Main {

    /*
    Задача:
Задание No1
Создать приложение по переводу значения температуры между градусами цельсия, фаренгейта и кельвина.
Входящие параметры:
Значение температуры вместе с указанием шкалы (цельсий, фаренгейт или кельвин), например: ​26С​,​ 299K​, или​ 79F​.
Выходные данные:
Целые значения температур в JSON формате для всех шкал измерения, кроме указанной во входящих параметрах,
например: {K: 299, F: 79F}
*/

    public static void main(String[] args) {
        Converter converter = new Converter("-24C");
        converter.convert();
    }
}