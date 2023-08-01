package hello.advanced.trace.template.code;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class AbstractTemplate {

    // 부가 기능을 포함한 매서드, 핵심 기능은 별도 추상 매서드로 사용
    public void execute() {
        long startTime = System.currentTimeMillis();

        function();

        long endTime = System.currentTimeMillis();
        long resultTime = endTime - startTime;
        log.info("resultTime = {}", resultTime);
    }

    // 내부에 핵심 기능을 구현할 추상 매서드
    protected abstract void function();
}
