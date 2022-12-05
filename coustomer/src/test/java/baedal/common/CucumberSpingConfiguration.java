package baedal.common;


import baedal.CoustomerApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { CoustomerApplication.class })
public class CucumberSpingConfiguration {
    
}
