package be.nathan;

import be.nathan.model.MonsterDirector;
import be.nathan.model.Orc;
import be.nathan.model.OrcBuilder;

public class Application {
    public static void main(String[] args) {
        MonsterDirector director = new MonsterDirector();
        OrcBuilder orcBuilder = new OrcBuilder();
        director.constructOrc(orcBuilder);

        Orc orc = orcBuilder.getResult();
        System.out.println(orc.toString());
    }
}