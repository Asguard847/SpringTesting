package hello;

import hello.entity.CD;


import java.util.ArrayList;

public class TestModel {

    CD firstCD = new CD("Empire Burlesque","Bob Dylan","USA","Columbia","10.90","1985");
    CD secondCD = new CD("Hide your heart","Bonnie Tyler","UK","CBS Records","9.90", "1988");
    public  ArrayList<CD> cds = new ArrayList<>();

    public void fillCds(){
        cds.add(firstCD);
        cds.add(secondCD);
    }

}
