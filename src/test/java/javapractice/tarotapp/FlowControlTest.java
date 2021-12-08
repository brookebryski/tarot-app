package javapractice.tarotapp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

class FlowControlTest {
    private  IMajorArcanaValidator _majorArcanaValidator;
    private IMajorArcana _majorArcana;
    private IFlowControl _flowControl;

    @BeforeEach
    public void setup() {
        this._majorArcanaValidator = mock(MajorArcanaValidator.class);
        this._majorArcana = mock(MajorArcana.class);
        this._flowControl = new FlowControl(_majorArcanaValidator, _majorArcana);
    }

    @Test
    public void givenTheFoolCallIsMajorArcanaOnce() {

    }

}