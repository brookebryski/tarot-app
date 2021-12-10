package javapractice.tarotapp;

import javapractice.tarotapp.MajorArcana.IMajorArcana;
import javapractice.tarotapp.MajorArcana.IMajorArcanaValidator;

public class FlowControl implements IFlowControl {
    private IMajorArcanaValidator _majorArcanaValidator;
    private IMajorArcana _majorArcana;

    public FlowControl(IMajorArcanaValidator majorArcanaValidator, IMajorArcana majorArcana) {
        this._majorArcanaValidator = majorArcanaValidator;
        this._majorArcana = majorArcana;
    }

    public void run(String input) {
        if(_majorArcanaValidator.isMajorArcana(input)) {
            String result = _majorArcana.generateTraits(input);
            System.out.println(result);
        }

    }
}
