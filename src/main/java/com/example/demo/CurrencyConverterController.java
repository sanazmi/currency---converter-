

package com.example.demo;  // Change this to match your current directory structure


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConverterController {

    @GetMapping("/api/convert")
    public String convertCurrency(@RequestParam double amount, @RequestParam String currency) {
        double result = 0;

        switch (currency) {
            case "Dollar":
                result = amount * 0.011551;
                break;
            case "Euro":
                result = amount * 0.011250;
                break;
            case "Yen":
                result = amount * 1.806217;
                break;
            case "Riyal":
                result = amount * 0.043;
                break;
            default:
                return "Invalid currency!";
        }

        return String.format("Converted amount: %.2f %s", result, currency);
    }
}
