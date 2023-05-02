package com.simobkr.springbootfeignclient.client;

import com.simobkr.springbootfeignclient.dtos.SymptomFilter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

@FeignClient(
        url = "${application.symptom-url}"
        ,name = "SYMPTOM-CLIENT")
public interface SymptomClient {

    @PostMapping
    Optional<String> getSymptomData(@RequestBody SymptomFilter filter);

}

@Lazy
@Component
class SymptomClientFallbackFactory implements FallbackFactory<SymptomClient> {

    @Override
    public SymptomClient create(Throwable cause) {
        return new SymptomClientFallback(cause);
    }
}

@Slf4j
@RequiredArgsConstructor
class SymptomClientFallback implements SymptomClient {

    private final Throwable cause;

    @Override
    public Optional<String> getSymptomData(SymptomFilter filter) {
        return Optional.empty();
    }
}
