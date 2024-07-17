package AuthClientService.Controllers;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RestController;

import AuthClientService.Models.Message;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class AppController {

    @GetMapping("/list")
    public List<Message> read() {
        return Collections.singletonList(new Message("Hola que tal"));
    }

    @PostMapping("/create")
    public Message write(@RequestBody Message message) {
        System.out.println("Se guardó el mensaje -> " + message.getText());
        return message;
    }

    @GetMapping("/authorized")
    public Map<String, String> authorized(@RequestParam String code) {
        return Collections.singletonMap("code", code);
    }

}
