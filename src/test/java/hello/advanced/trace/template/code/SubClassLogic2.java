package hello.advanced.trace.template.code;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SubClassLogic2 extends AbstractTemplate {

    @Override
    protected void function() {
        log.info("비즈니스 로직2 수행");
    }
}
