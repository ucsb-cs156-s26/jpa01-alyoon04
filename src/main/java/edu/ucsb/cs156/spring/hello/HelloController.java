package edu.ucsb.cs156.spring.hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloController {

    public static String homePageContent = """
            <h1>Hello, World</h1>
            <ul>
                <li><a href="/es">Español</a></li>
                <li><a href="/fr">Français</a></li>
                <li><a href="/cn">中文</a></li>
            </ul>
            """;

    @GetMapping(value = "/", produces = "text/html;charset=UTF-8")
    public String hello() {
        return homePageContent;
    }

    public static String hello_es_content = """
            <h1>Hola Mundo</h1>
            <p><a href="/">Volver a la página de inicio (home)</a></p>
            """;

    @GetMapping(value = "/es", produces = "text/html;charset=UTF-8")
    public String hello_es() {
        return hello_es_content;
    }

    public static String hello_fr_content = """
            <h1>Bonjour le monde</h1>
            <p><a href="/">Retour à la page d'accueil (home)</a></p>
            """;

    @GetMapping(value = "/fr", produces = "text/html;charset=UTF-8")
    public String hello_fr() {
        return hello_fr_content;
    }

    public static String hello_cn_content = """
            <h1>你好世界</h1>
            <h2>Nǐ hǎo shìjiè</h2>
            <p><a href="/">返回主页 (Fǎnhuí zhǔyè)(home)</a></p>
            """;

    @GetMapping(value = "/cn", produces = "text/html;charset=UTF-8")
    public String hello_cn() {
        return hello_cn_content;
    }

}
