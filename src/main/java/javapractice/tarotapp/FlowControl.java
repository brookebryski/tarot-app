package javapractice.tarotapp;

import javapractice.tarotapp.MajorArcana.IMajorArcana;
import javapractice.tarotapp.MajorArcana.IMajorArcanaValidator;
import javapractice.tarotapp.MinorArcana.*;

public class FlowControl implements IFlowControl {
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

    public FlowControl(IMajorArcanaValidator majorArcanaValidator, IMajorArcana majorArcana, INumberOrCourtValidator numberOrCourtValidator, ISuitValidator suitValidator, ISuitGetter suitGetter, INumberOrCourtGetter numberOrCourtGetter, ICups cups, IPentacles pentacles, ISwords swords, IWands wands ) {
        this._majorArcanaValidator = majorArcanaValidator;
        this._majorArcana = majorArcana;

        this._numberOrCourtValidator = numberOrCourtValidator;
        this._suitValidator = suitValidator;
        this._numberOrCourtGetter = numberOrCourtGetter;
        this._suitGetter = suitGetter;
        this._cups = cups;
        this._pentacles = pentacles;
        this._swords = swords;
        this._wands = wands;
    }

    public void run(String input) {
        if(_majorArcanaValidator.isMajorArcana(input)) {
            String result = _majorArcana.generateTraits(input);
            System.out.println(result);
        } else if (_numberOrCourtValidator.isValid(input) && (_suitValidator.isSuit(input))) {
            System.out.println("minor");
            if(input.contains("cups")) {
                System.out.println("cups");
                String result = _cups.generateTraits();
                System.out.println(result);
            } else if (input.contains("pentacles")) {
                System.out.println("pentacles");
                String result = _pentacles.generateTraits();
                System.out.println(result);
            } else if (input.contains("swords")) {
                System.out.println("swords");
                String result = _swords.generateTraits();
                System.out.println(result);
            } else {
                System.out.println("wands");
                String result = _wands.generateTraits();
                System.out.println(result);
            }

        }

    }
}

// ask user major or minor arcana
// major call major
// minor call two get input methods once
// case switch: determine suit, run generate traits
// remove get inputs from classes