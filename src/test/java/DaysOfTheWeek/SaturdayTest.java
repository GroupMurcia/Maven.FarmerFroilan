package DaysOfTheWeek;

import Interface.Rideable;
import Interface.Rider;
import collections.Stables;
import concreteclass.*;
import org.junit.Assert;
import org.junit.Test;

public class SaturdayTest {
    @Test
    public void personRiderTest() {
        Pilot froilanda = new Pilot();
        Farmer froilan = new Farmer();

        Assert.assertTrue(froilan instanceof Rider);
        Assert.assertTrue(froilanda instanceof Rider);
    }

    @Test
    public void horseRideable() {
        Horse horse = new Horse("horse");

        Assert.assertTrue(horse instanceof Rideable);
    }

    @Test
    public void eachHorseIsRiddenStableOneTest() {
        Stables stableOne = new Stables();
        Horse horse = new Horse("horse1");
        Horse horse2 = new Horse("horse2");
        Horse horse3 = new Horse("horse3");
        Horse horse4 = new Horse("horse4");

        stableOne.add(horse);
        stableOne.add(horse2);
        stableOne.add(horse3);
        stableOne.add(horse4);

        horse.hasRider = true;
        horse2.hasRider = true;
        horse3.hasRider = true;
        horse4.hasRider = true;

        Assert.assertTrue(horse.ride());
        Assert.assertTrue(horse2.ride());
        Assert.assertTrue(horse3.ride());
        Assert.assertTrue(horse4.ride());
    }

    @Test
    public void horseIsAnEaterTest() {
        Horse horse = new Horse("horse1");
        EarCorn earCorn = new EarCorn();
        horse.eat(earCorn);

        Assert.assertTrue(horse.hasEaten);
    }

    @Test
    public void froilanIsAnEaterTest() {
        Farmer froilan = new Farmer();
        EarCorn earCorn = new EarCorn();
        Tomato tomato= new Tomato();
        Egg egg = new Egg();

        froilan.eat(earCorn);
        froilan.eat(tomato);
        froilan.eat(egg);

        Assert.assertTrue(froilan.hasEaten);
    }

    @Test
    public void froilandaIsAnEaterTest() {
        Pilot froilanda = new Pilot();
        Tomato tomato = new Tomato();
        Egg egg = new Egg();
        EarCorn earCorn = new EarCorn();

        froilanda.eat(earCorn);
        froilanda.eat(tomato);
        froilanda.eat(egg);
        //is this a variable or method?
        Assert.assertTrue(froilanda.hasEaten);
    }
}
