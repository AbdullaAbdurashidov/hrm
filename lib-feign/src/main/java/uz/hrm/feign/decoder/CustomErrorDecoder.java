package uz.hrm.feign.decoder;

import com.google.gson.Gson;
import feign.FeignException;
import feign.Response;
import feign.codec.DecodeException;
import feign.codec.Decoder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;
import uz.hrm.lib.model.HttpResponseDTO;

import java.io.IOException;
import java.lang.reflect.Type;

@Component
public class CustomErrorDecoder implements Decoder {

    private Logger log = LoggerFactory.getLogger(Logger.class);

    @Override
    public Object decode(Response response, Type type) throws IOException, DecodeException, FeignException {
        String json = response.body().toString();
        Gson gson = new Gson();
        if(json.startsWith("<!doctype html>"))
            return new ResponseStatusException(HttpStatus.NOT_FOUND, "Page not found");
        HttpResponseDTO responseDto = gson.fromJson(json, HttpResponseDTO.class);
        HttpStatus status = HttpStatus.resolve(responseDto.getStatus());
        String message = responseDto.getPath() + " -> " + responseDto.getMessage();
        log.info("{} : {}", status, message);
        return new ResponseStatusException(status, message);
    }
}
