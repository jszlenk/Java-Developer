package com.kodilla.patterns.builder.checkers;

import com.kodilla.patterns.builder.checker.*;
import org.junit.Assert;
import org.junit.Test;

public class CheckersTestSuite {
    @Test
    public void testCheckersBuilder() {
        //Given
        Checkers checkers = new Checkers.CheckersBuilder()
                .PlayerOne("John")
                .PlayerTwo("Theresa")
                .Figure(FigureFactory.PAWN, Figure.WHITE, 0, 3)
                .Figure(FigureFactory.PAWN, Figure.BLACK, 9, 7)
                .Figure(FigureFactory.QUEEN, Figure.WHITE, 0, 2)
                .build();
        System.out.println(checkers.getBoard());

        //When
        Figure figureOne = checkers.getBoard().getFigure(0, 3);
        Figure figureTwo = checkers.getBoard().getFigure(9, 7);
        Figure figureThree = checkers.getBoard().getFigure(0, 2);
        Figure figureFour = checkers.getBoard().getFigure(1, 1);

        //Then
        Assert.assertEquals(Figure.WHITE, figureOne.getColor());
        Assert.assertEquals(Pawn.class, figureTwo.getClass());
        Assert.assertEquals(Queen.class, figureThree.getClass());
        Assert.assertNull(figureFour);
    }
}
