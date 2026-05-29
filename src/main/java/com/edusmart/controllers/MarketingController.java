package com.edusmart.controllers;
import com.edusmart.services.EduSmartAiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/edusmart")
public class MarketingController {
    @Autowired
    private EduSmartAiService eduSmartAiService;

    @GetMapping("/publicidad")
    public String obtenerPublicidad(@RequestParam String tema, @RequestParam String audiencia){
        return eduSmartAiService.generarPublicidad(tema, audiencia);
    }
}