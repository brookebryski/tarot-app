package javapractice.tarotapp;

import javapractice.tarotapp.MajorArcana.IMajorArcana;
import javapractice.tarotapp.MajorArcana.IMajorArcanaValidator;
import javapractice.tarotapp.MajorArcana.MajorArcana;
import javapractice.tarotapp.MajorArcana.MajorArcanaValidator;
import javapractice.tarotapp.MinorArcana.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

class FlowControlTest {

    private IMajorArcanaValidator _majorArcanaValidator;
    private IMajorArcana _majorArcana;

    private INumberOrCourtValidator _numberOrCourtValidator;
    private ISuitValidator _suitValidator;
    private ISuitGetter _suitGetter;
    private INumberOrCourtGetter _numberOrCourtGetter;
    private ICups _cups;
    private IPentacles _pentacles;
    private ISwords _swords;
    private IWands _wands;

    private IFlowControl _flowControl;

    @BeforeEach
    public void setup() {
        this._majorArcanaValidator = mock(MajorArcanaValidator.class);
        this._majorArcana = mock(MajorArcana.class);

        this._numberOrCourtValidator = mock(NumberOrCourtValidator.class);
        this._suitValidator = mock(SuitValidator.class);
        this._numberOrCourtGetter = mock(NumberOrCourtGetter.class);
        this._suitGetter = mock(SuitGetter.class);

        this._cups = mock(Cups.class);
        this._pentacles = mock(Pentacles.class);
        this._swords = mock(Swords.class);
        this._wands = mock(Wands.class);

        this._flowControl = new FlowControl(_majorArcanaValidator, _majorArcana, _numberOrCourtValidator, _suitValidator,_numberOrCourtGetter, _suitGetter, _cups, _pentacles, _swords, _wands );
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