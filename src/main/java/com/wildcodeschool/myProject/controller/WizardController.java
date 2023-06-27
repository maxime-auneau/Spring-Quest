package com.wildcodeschool.myProject.controller;

import com.wildcodeschool.myProject.model.Wizard;
import com.wildcodeschool.myProject.repository.WizardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class WizardController {

    @Autowired
    private WizardRepository repository;

    @GetMapping("/wizard")
    public String getWizard(Model model, @RequestParam(required = false) Long id) {

        Wizard wizard = new Wizard();
        if (id != null) {
            Optional<Wizard> optionalWizard = repository.findById(id);
            if (optionalWizard.isPresent()) {
                wizard = optionalWizard.get();
            }
        }
        model.addAttribute("wizard", wizard);
        return "wizard";
    }

    @GetMapping("/wizards")
    public String getAll(Model model) {
        model.addAttribute("wizards", repository.findAll());
        return "wizards";
    }

    @PostMapping("/wizard")
    public String postWizard(@ModelAttribute Wizard wizard) {
        repository.save(wizard);
        return "redirect:/wizards";
    }

    @GetMapping("/wizard/delete")
    public String deleteWizard(@RequestParam Long id) {
        repository.deleteById(id);
        return "redirect:/wizards";
    }
}

