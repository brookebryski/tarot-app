//package javapractice.tarotapp;
//
//import javapractice.tarotapp.MajorArcana.MajorArcana;
//import javapractice.tarotapp.MajorArcana.MajorArcanaValidator;
//import javapractice.tarotapp.MinorArcana.*;
//import org.springframework.context.annotation.Bean;
//
//public class AppConfig {
//
//    @Bean(name = "iMajorArcanaValidator")
//    public MajorArcanaValidator createMajorArcanaValidator() { return new MajorArcanaValidator(); }
//
//    @Bean(name = "iMajorArcana")
//    public MajorArcana createMajorArcana() { return new MajorArcana(); }
//
//    @Bean(name = "iNumberOrCourtGetter")
//    public NumberOrCourtGetter createNumberOrCourtGetter() { return new NumberOrCourtGetter(); }
//
//    @Bean(name = "iNumberOrCourtValidator")
//    public NumberOrCourtValidator createNumberOrCourtValidator() { return new NumberOrCourtValidator(); }
//
//    @Bean(name = "iSuitGetter")
//    public SuitGetter createSuitGetter() { return new SuitGetter(); }
//
//    @Bean(name = "iSuitValidator")
//    public SuitValidator createSuitValidator() { return new SuitValidator(); }
//
//    @Bean(name = "iCups")
//    public Cups createCups() { return new Cups(); }
//
//    @Bean(name = "iPentacles")
//    public Pentacles createPentacles() { return new Pentacles(); }
//
//    @Bean(name = "iSwords")
//    public Swords createSwords() { return new Swords(); }
//
//    @Bean(name = "iWands")
//    public Wands createWands() { return new Wands(); }
//
//    @Bean(name = "iFlowControl")
//    public FlowControl createFlowControl() {
//        return new FlowControl(createMajorArcanaValidator(), createMajorArcana(), createNumberOrCourtValidator(), createSuitValidator(),createNumberOrCourtGetter(), createSuitGetter(), createCups(), createPentacles(), createSwords(), createWands());
//    }
//}
