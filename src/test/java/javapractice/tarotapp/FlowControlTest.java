package javapractice.tarotapp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

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
        // Given: I am a user
        // When: I enter the string "the fool"
        when(_majorArcanaValidator.isMajorArcana("the fool")).thenReturn(true);
        _flowControl.run("the fool");
        // Then: Call isMajorArcana() once
        verify(_majorArcanaValidator, times(1)).isMajorArcana("the fool");
    }

    @Test
    public void givenTheFoolCallMajorArcanaOnce() {
        // Given: I am a user
        // When: I enter the string "the fool"
        when(_majorArcanaValidator.isMajorArcana("the fool")).thenReturn(true);
        when(_majorArcana.generateTraits("the fool")).thenReturn(anyString());
        _flowControl.run("the fool");
        // Then: Call MajorArcana() once
        verify(_majorArcana, times(1)).generateTraits("the fool");
    }

    @Test
    public void givenBobCallISMajorArcanaOnce() {
        // Given: I am a user
        // When: I enter the string "bob"
        when(_majorArcanaValidator.isMajorArcana("bob")).thenReturn(false);
        _flowControl.run("bob");
        // Then: Call isMajorArcana() once
        verify(_majorArcanaValidator, times(1)).isMajorArcana("bob");
    }

    @Test
    public void givenBobDoNotCallMajorArcana() {
        // Given: I am a user
        // When: I enter the string "bob"
        when(_majorArcanaValidator.isMajorArcana("bob")).thenReturn(false);
        _flowControl.run("bob");
        // Then: Call MajorArcana() zero times
        verify(_majorArcana, never()).generateTraits(anyString());
    }

}