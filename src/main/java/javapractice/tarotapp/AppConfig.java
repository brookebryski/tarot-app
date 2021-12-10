package javapractice.tarotapp;

import javapractice.tarotapp.MajorArcana.MajorArcana;
import javapractice.tarotapp.MajorArcana.MajorArcanaValidator;
import org.springframework.context.annotation.Bean;

public class AppConfig {

    @Bean(name = "iMajorArcanaValidator")
    public MajorArcanaValidator createMajorArcanaValidator() { return new MajorArcanaValidator(); }

    @Bean(name = "iMajorArcana")
    public MajorArcana createMajorArcana() { return new MajorArcana(); }

    @Bean(name = "iFlowControl")
    public FlowControl createFlowControl() {
        return new FlowControl(createMajorArcanaValidator(), createMajorArcana());
    }
}
