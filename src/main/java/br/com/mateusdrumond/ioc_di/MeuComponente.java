package br.com.mateusdrumond.ioc_di;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class MeuComponente {
    public String chamarMeuComponente() {
        return "Chamando o meu componente";
    }
}
