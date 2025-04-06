package dio.springboot.scopes;

import dio.springboot.scopes.app.SistemaMensagem;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Main {
  public static void main(String[] args) {
    SpringApplication.run(Main.class, args);
  }

  @Bean
  public CommandLineRunner run(SistemaMensagem sistema) throws Exception {
    return args -> {
      sistema.enviarConfirmacaoCadastro();
      sistema.enviarMensagemBoasVindas();
      sistema.enviarConfirmacaoCadastro();
    };
  }
}
