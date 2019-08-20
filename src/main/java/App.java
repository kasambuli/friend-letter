import static spark.Spark.*;

import java.util.HashMap;
import java.util.Map;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

public class App {
    public static void main(String[] args) {
        staticFileLocation("/public");
        get("/", (request, response) ->{
//
            Map<String,Object> model = new HashMap<String, Object>();//new model to store information
                    return new ModelAndView(model,"hello.hbs");//assemble individual pieces and render
                },
                new HandlebarsTemplateEngine()

        );

        get("/favorite_photos", (request, response) ->{
            Map<String, Object> model = new HashMap<String, Object>();
            return new ModelAndView(model, "favorite_photos.hbs");
                }, new HandlebarsTemplateEngine()

        );

    }
}