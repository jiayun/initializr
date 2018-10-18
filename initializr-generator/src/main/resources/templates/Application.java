package {{packageName}};

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.builder.SpringApplicationBuilder;
{{applicationImports}}

{{applicationAnnotations}}
public class {{applicationName}} implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger({{applicationName}}.class);

    @Value("${apNo}")
    private String apNo;

    public static void main(String[] args) {
        new SpringApplicationBuilder({{applicationName}}.class)
            .run(args);
    }

    @Override
    public void run(String... args) {
        logger.info("AP_{} start...", apNo);

        logger.info("AP_{} end", apNo);
    }
}
