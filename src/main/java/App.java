import io.javalin.Javalin;

public class App {
    public static void main(String[] args) {

        Javalin app = Javalin.create().start(7000);

        app.get("/", ctx -> ctx.result("Hello World"));

        app.get("/sergey", ctx -> {


            ctx.html("<b>Hello All!</b>");

        });



    }
}
