package javapractice.tarotapp;

import org.springframework.context.annotation.Bean;

import java.util.concurrent.Flow;

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
