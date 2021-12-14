package javapractice.tarotapp;

import javapractice.tarotapp.MajorArcana.IMajorArcana;
import javapractice.tarotapp.MajorArcana.IMajorArcanaValidator;
import javapractice.tarotapp.MinorArcana.*;

public class FlowControl implements IFlowControl {
    private IMajorArcanaValidator _majorArcanaValidator;
    private IMajorArcana _majorArcana;

    private INumberOrCourtValidator _numberOrCourtValidator;
    private ISuitValidator _suitValidator;
    private ICups _cups;
    private IPentacles _pentacles;
    private ISwords _swords;
    private IWands _wands;

    public FlowControl(IMajorArcanaValidator majorArcanaValidator, IMajorArcana majorArcana, INumberOrCourtValidator numberOrCourtValidator, ISuitValidator suitValidator, ICups cups, IPentacles pentacles, ISwords swords, IWands wands ) {
        this._majorArcanaValidator = majorArcanaValidator;
        this._majorArcana = majorArcana;

        this._numberOrCourtValidator = numberOrCourtValidator;
        this._suitValidator = suitValidator;
        this._cups = cups;
        this._pentacles = pentacles;
        this._swords = swords;
        this._wands = wands;
    }

    public void run(String input) {
        if(_majorArcanaValidator.isMajorArcana(input)) {
            String result = _majorArcana.generateTraits(input);
            System.out.println(result);
        } else if (_numberOrCourtValidator.isValid(input) & (_suitValidator.isSuit(input))) {
            if(input.contains("cups")) {
                String result = _cups.generateTraits();
                System.out.println(result);
            } else if (input.contains("pentacles")) {
                String result = _pentacles.generateTraits();
                System.out.println(result);
            } else if (input.contains("swords")) {
                String result = _swords.generateTraits();
                System.out.println(result);
            } else {
                String result = _wands.generateTraits();
                System.out.println(result);
            }
        }

    }
}
