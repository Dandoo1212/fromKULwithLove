import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class CalcServiceTest {

    @Mock
    private Calc calc;
    @InjectMocks
    private CalcService calcService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void shouldReturnExpectedResultWhenGivenCorrectArguments() {
        //given
        int givenA = 5;
        int givenB = 4;
        int expectedResult = 9;
        when(calc.add(givenA, givenB)).thenReturn(expectedResult);
        //when
        int actualResult = calcService.add(givenA, givenB);
        //then
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void shouldReturnOneForFiveAndFourSubtract() {
        //given
        int givenA = 4;
        int givenB = 5;
        int expectedResult = 1;
        when(calc.subtractPositive(givenB, givenA)).thenReturn(expectedResult);
        //when
        int actualResult = calcService.subtractWithSwap(givenA, givenB);
        //then
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void shouldReturnOneForFourAndFiveSubtract(){
        //given
        int givenA = 5;
        int givenB = 4;
        int expectedResult = 1;
        when(calc.subtractPositive(givenA, givenB)).thenReturn(expectedResult);
        //when
        int actualResult = calcService.subtractWithSwap(givenA, givenB);
        //then
        assertEquals(expectedResult, actualResult);
    }

    // testowanie metody divide
}
