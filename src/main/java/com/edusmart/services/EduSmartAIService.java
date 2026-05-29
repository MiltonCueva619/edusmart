package com.edusmart.services;
import dev.langchain4j.service.AiServices;
import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.v;

@AiService
public interface EduSmartAiService {
    @UserMessage("Redacta una frase publicitaria de maximo 100 caracteres " + "para vender un curso de {{tema}} dirigido a {{audiencia}}-")
    String generarPublicidad(@V("tema") String tema, @V("audiencia") String audiencia);
}